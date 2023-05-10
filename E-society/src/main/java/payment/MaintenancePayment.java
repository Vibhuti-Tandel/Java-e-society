package payment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;
import com.razorpay.*;

import dao.MPaymentDao;
import model.Maintenance;

/**
 * Servlet implementation class MaintenancePayment
 */
@WebServlet("/MaintenancePayment")
public class MaintenancePayment extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaintenancePayment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get called");
		RazorpayClient client=null;
		String orderId=null;
		try {
			client=new RazorpayClient("rzp_test_8zWJ0BUityU273","Ng7E94qYTBiMIzrOFtbkP1AE");
			
			String amount=request.getParameter("amount");
			Integer digit=new Integer(Integer.parseInt(amount)*100);
			
			JSONObject options=new JSONObject();
			options.put("amount", digit.toString());
			options.put("currency", "INR");
			options.put("receipt", "zxr456");
			options.put("payment_capture", true);
			Order order=client.Orders.create(options);
			orderId=order.get("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().append(orderId);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post called");
		RazorpayClient client=null;
		try {
			client=new RazorpayClient("rzp_test_8zWJ0BUityU273","Ng7E94qYTBiMIzrOFtbkP1AE");
			JSONObject options=new JSONObject();
			options.put("razorpay_payment_id",request.getParameter("razorpay_payment_id"));
			options.put("razorpay_order_id",request.getParameter("razorpay_order_id"));
			options.put("razorpay_signature",request.getParameter("razorpay_signature"));
			boolean SigRes=Utils.verifyPaymentSignature(options,"Secret");
			if(SigRes)
			{
				response.getWriter().append("Payment Successfull");
			}
			else
			{
				response.getWriter().append("Payment Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String action= request.getParameter("action");
		if(action.equalsIgnoreCase("PayMaintenance"))
		{
			Maintenance m = new Maintenance();
			m.setMid(Integer.parseInt(request.getParameter("mid")));
			m.setM_date(request.getParameter("m_date"));
			m.setM_amount(Long.parseLong(request.getParameter("m_amount")));
			long am = Long.parseLong(request.getParameter("m_amount"));
			MPaymentDao.insertMaintenancePayment(m);
			response.sendRedirect("member-mpayment.jsp?amount="+am);
			
			
		}
				
	}

}
