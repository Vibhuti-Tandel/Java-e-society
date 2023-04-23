package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Admin;
import model.Complaint;
import model.Member;

public class AdminDao {
	
	public static boolean checkEmail(String email)
	{
		boolean flag = false;
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from admin where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				flag = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static Admin adminSignIn(Admin a)
	{
		Admin a1 = null;
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from admin where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, a.getEmail());
			pst.setString(2, a.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				a1 = new Admin();
				a1.setName(rs.getString("name"));
				a1.setEmail(rs.getString("email"));
				a1.setPassword(rs.getString("password"));
				a1.setContact(rs.getLong("contact"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a1;
	}
	
	public static List<Member> approveListOfMemebers()
	{
		List<Member> list = new ArrayList<Member>();
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from member where register_status='pending'";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Member m = new Member();
				m.setMid(rs.getInt("mid"));
				m.setFname(rs.getString("fname"));
				m.setLname(rs.getString("lname"));
				m.setContact(rs.getLong("contact"));
				m.setH_no(rs.getInt("h_no"));
				m.setAddress(rs.getString("address"));
				m.setJoin_date(rs.getString("join_date"));
				m.setEmail(rs.getString("email"));
				m.setPassword(rs.getString("password"));
				m.setRegister_status(rs.getString("register_status"));
				list.add(m);
				System.out.println("List Of Member To Approve Dao");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Member> adminGetAllMembers()
	{
		List<Member> list = new ArrayList<Member>();
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from member";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Member m = new Member();
				m.setMid(rs.getInt("mid"));
				m.setFname(rs.getString("fname"));
				m.setLname(rs.getString("lname"));
				m.setContact(rs.getLong("contact"));
				m.setH_no(rs.getInt("h_no"));
				m.setAddress(rs.getString("address"));
				m.setJoin_date(rs.getString("join_date"));
				m.setEmail(rs.getString("email"));
				m.setPassword(rs.getString("password"));
				m.setRegister_status(rs.getString("register_status"));
				list.add(m);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void approvingRequest(String email)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "update member set register_status='approved' where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.executeUpdate();
			System.out.println("Registration Approved");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Member> approveMemebersList()
	{
		List<Member> list = new ArrayList<Member>();
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from member where register_status='approved'";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Member m = new Member();
				m.setMid(rs.getInt("mid"));
				m.setFname(rs.getString("fname"));
				m.setLname(rs.getString("lname"));
				m.setContact(rs.getLong("contact"));
				m.setH_no(rs.getInt("h_no"));
				m.setAddress(rs.getString("address"));
				m.setJoin_date(rs.getString("join_date"));
				m.setEmail(rs.getString("email"));
				m.setPassword(rs.getString("password"));
				m.setRegister_status(rs.getString("register_status"));
				list.add(m);
				System.out.println("List Of Approved Member Dao");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Complaint> getAllRegisteredComplaints()
	{
		List<Complaint> list = new ArrayList<Complaint>();
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from complaint";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Complaint c = new Complaint();
				c.setCid(rs.getInt("cid"));
				c.setMid(rs.getInt("mid"));
				c.setH_no(rs.getInt("h_no"));
				c.setSubject(rs.getString("subject"));
				c.setCdate(rs.getString("cdate"));
				c.setDescription(rs.getString("description"));
				c.setComplaint_status(rs.getString("complaint_status"));
				list.add(c);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void adminSolvedComplaint(int cid)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "update complaint set complaint_status='solved' where cid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
			pst.executeUpdate();
			System.out.println("Complaint Solved");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String checkComplaintStatus(int cid)
	{
		String c_status="";
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from complaint where cid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				c_status = rs.getString("complaint_status");		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c_status;
	}

}
