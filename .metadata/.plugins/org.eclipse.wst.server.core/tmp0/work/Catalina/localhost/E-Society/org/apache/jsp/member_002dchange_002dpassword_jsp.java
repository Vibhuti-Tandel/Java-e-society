/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-21 18:03:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Member;
import model.Member;

public final class member_002dchange_002dpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/member-header.jsp", Long.valueOf(1681642610157L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1681567217709L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>E-Society-User Change Password</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>E-Society-User Header</title>\r\n");
      out.write(" <!-- Required meta tags -->\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <!-- google fonts -->\r\n");
      out.write("  <link href=\"//fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- google fonts -->\r\n");
      out.write("  <!-- Template CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/style-starter.css\">\r\n");
      out.write("  <!-- Template CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style-liberty.css\">\r\n");
      out.write("  \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/dropdown.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

	Member m = null;
	if(session.getAttribute("memberData") != null)
	{
		m = (Member)session.getAttribute("memberData");	
	}
	else
	{
		response.sendRedirect("member-login.jsp");
	}

      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<!--header-->\r\n");
      out.write("		  <header id=\"site-header\" class=\"fixed-top\">\r\n");
      out.write("		    <div class=\"container\">\r\n");
      out.write("		      <nav class=\"navbar navbar-expand-lg stroke\">\r\n");
      out.write("		        <h1><a class=\"navbar-brand mr-lg-5\" href=\"index.jsp\">\r\n");
      out.write("		          <span class=\"log\">E-</span>Society\r\n");
      out.write("		          </a></h1>\r\n");
      out.write("		        <!-- if logo is image enable this   \r\n");
      out.write("		      <a class=\"navbar-brand\" href=\"#index.html\">\r\n");
      out.write("		          <img src=\"image-path\" alt=\"Your logo\" title=\"Your logo\" style=\"height:35px;\" />\r\n");
      out.write("		      </a> -->\r\n");
      out.write("		        <button class=\"navbar-toggler  collapsed bg-gradient\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		          data-target=\"#navbarTogglerDemo02\" aria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\"\r\n");
      out.write("		          aria-label=\"Toggle navigation\">\r\n");
      out.write("		          <span class=\"navbar-toggler-icon fa icon-expand fa-bars\"></span>\r\n");
      out.write("		          <span class=\"navbar-toggler-icon fa icon-close fa-times\"></span>\r\n");
      out.write("		          </span>\r\n");
      out.write("		        </button>\r\n");
      out.write("\r\n");
      out.write("		        <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">\r\n");
      out.write("		          <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("		            <li class=\"nav-item active\">\r\n");
      out.write("		              <a class=\"nav-link\" href=\"member-home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            \r\n");
      out.write("		                     \r\n");
      out.write("		             <li class=\"nav-item\">\r\n");
      out.write("		             	<div class=\"dropdown\">\r\n");
      out.write("		             		<a class=\"nav-link\" class=\"dropbtn\">Complaint <i class=\"fa fa-angle-down lnr\"></i> <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("		              		<div class=\"dropdown-content\" >\r\n");
      out.write("		              				\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"member-register-complain.jsp\">Register Complaint</a>\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"#\">View All Complaint</a>\r\n");
      out.write("		              		</div>\r\n");
      out.write("		            	</div>\r\n");
      out.write("		            </li> \r\n");
      out.write("		            \r\n");
      out.write("		            \r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		             	<div class=\"dropdown\">\r\n");
      out.write("		             		<a class=\"nav-link\" class=\"dropbtn\">Service <i class=\"fa fa-angle-down lnr\"></i> <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("		              		<div class=\"dropdown-content\" >\r\n");
      out.write("		              				\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"#\">Book Hall</a>\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"#\">Society Meetings</a>\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"#\">Circular</a>\r\n");
      out.write("		              		</div>\r\n");
      out.write("		            	</div>\r\n");
      out.write("		            </li> \r\n");
      out.write("		            \r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		             	<div class=\"dropdown\">\r\n");
      out.write("		             		<a class=\"nav-link\" class=\"dropbtn\">Payment <i class=\"fa fa-angle-down lnr\"></i> <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("		              		<div class=\"dropdown-content\" >\r\n");
      out.write("		              				\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"#\">Maintenance</a>\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"#\">Payment History</a>\r\n");
      out.write("		              		</div>\r\n");
      out.write("		            	</div>\r\n");
      out.write("		            </li> 		\r\n");
      out.write("		           \r\n");
      out.write("		            \r\n");
      out.write("		           			\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		             	<div class=\"dropdown\">\r\n");
      out.write("		             		<a class=\"nav-link\" class=\"dropbtn\">Event <i class=\"fa fa-angle-down lnr\"></i> <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("		              		<div class=\"dropdown-content\" >\r\n");
      out.write("		              				\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"#\">Society Events</a>\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"#\">Gallery</a>\r\n");
      out.write("		              		</div>\r\n");
      out.write("		            	</div>\r\n");
      out.write("		            </li> \r\n");
      out.write("		                       \r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		             	<div class=\"dropdown\">\r\n");
      out.write("		             		<a class=\"nav-link\" class=\"dropbtn\">");
      out.print(m.getFname() );
      out.write(" <i class=\"fa fa-angle-down lnr\"></i> <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("		              		<div class=\"dropdown-content\" >\r\n");
      out.write("		              				\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"member-profile.jsp\">Profile</a>\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"member-change-password.jsp\">Change Password</a>\r\n");
      out.write("		                		<a class=\"nav-link\" href=\"member-logout.jsp\">Logout</a>\r\n");
      out.write("		              		</div>\r\n");
      out.write("		            	</div>\r\n");
      out.write("		            </li> \r\n");
      out.write("		              \r\n");
      out.write("\r\n");
      out.write("		          </ul>\r\n");
      out.write("		        </div>\r\n");
      out.write("		        \r\n");
      out.write("			        \r\n");
      out.write("		       \r\n");
      out.write("		        \r\n");
      out.write("		      </nav>\r\n");
      out.write("		    </div>\r\n");
      out.write("		  </header>\r\n");
      out.write("		  \r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- //footer-29 block -->\r\n");
      out.write("  <!-- disable body scroll which navbar is in active -->\r\n");
      out.write("  <script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("      $('.navbar-toggler').click(function () {\r\n");
      out.write("        $('body').toggleClass('noscroll');\r\n");
      out.write("      })\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("  <!-- disable body scroll which navbar is in active -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Template JavaScript -->\r\n");
      out.write("  <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/js/theme-change.js\"></script>\r\n");
      out.write("  <script src=\"assets/js/owl.carousel.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("  <!--/MENU-JS-->\r\n");
      out.write("  <script>\r\n");
      out.write("    $(window).on(\"scroll\", function () {\r\n");
      out.write("      var scroll = $(window).scrollTop();\r\n");
      out.write("\r\n");
      out.write("      if (scroll >= 80) {\r\n");
      out.write("        $(\"#site-header\").addClass(\"nav-fixed\");\r\n");
      out.write("      } else {\r\n");
      out.write("        $(\"#site-header\").removeClass(\"nav-fixed\");\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //Main navigation Active Class Add Remove\r\n");
      out.write("    $(\".navbar-toggler\").on(\"click\", function () {\r\n");
      out.write("      $(\"header\").toggleClass(\"active\");\r\n");
      out.write("    });\r\n");
      out.write("    $(document).on(\"ready\", function () {\r\n");
      out.write("      if ($(window).width() > 991) {\r\n");
      out.write("        $(\"header\").removeClass(\"active\");\r\n");
      out.write("      }\r\n");
      out.write("      $(window).on(\"resize\", function () {\r\n");
      out.write("        if ($(window).width() > 991) {\r\n");
      out.write("          $(\"header\").removeClass(\"active\");\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("  <!--//MENU-JS-->\r\n");
      out.write("\r\n");
      out.write("  <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<!-- about breadcrumb -->\n");
      out.write("  <section class=\"w3l-about-breadcrumb text-left\">\n");
      out.write("    <div class=\"breadcrumb-bg breadcrumb-bg-about py-sm-5 py-4\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h2 class=\"title\">Member Change Password</h2>\n");
      out.write("        <ul class=\"breadcrumbs-custom-path mt-2\">\n");
      out.write("          <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("          <li class=\"active\"><span class=\"fa fa-arrow-right mx-2\" aria-hidden=\"true\"></span> Change Password </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- //about breadcrumb -->\n");
      out.write("  <!-- /Member Change Password-->\n");
      out.write("  <div class=\"contact-form py-5\" id=\"contact\">\n");
      out.write("    <div class=\"container py-lg-5 py-md-4\">\n");
      out.write("      \n");
      out.write("      <h3 class=\"hny-title mb-lg-5 mb-4\">Change Password</h3>\n");
      out.write("        <div class=\"contacts12-main mb-5\">\n");
      out.write("        ");

		String msg = (String) request.getAttribute("msg");
		
      out.write('\n');
      out.write('	');
      out.write('	');

		if (msg != null) {
		
      out.write("\n");
      out.write("		<h3>\n");
      out.write("			");

			out.print(msg);
			
      out.write("\n");
      out.write("		</h3>\n");
      out.write("		");

		}
		
      out.write('\n');
      out.write('	');
      out.write('	');

		String msg1 = (String) request.getAttribute("msg1");
		
      out.write('\n');
      out.write('	');
      out.write('	');

		if (msg1 != null) {
		
      out.write("\n");
      out.write("		<h3>\n");
      out.write("			");

			out.print(msg1);
			
      out.write("\n");
      out.write("		</h3>\n");
      out.write("		");

		}
		
      out.write("\n");
      out.write("            <form action=\"MemberController\" method=\"post\">\n");
      out.write("                <div class=\"main-input\">\n");
      out.write("               		<div class=\"d-grid\" >\n");
      out.write("                    	<input type=\"hidden\" name=\"mid\" id=\"w3lPhone\"  class=\"contact-input\" value=\"");
      out.print(m.getMid() );
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("					<div class=\"d-grid\" >\n");
      out.write("                    	<input type=\"password\" name=\"oldPassword\" id=\"w3lPhone\" placeholder=\"Old Password\" class=\"contact-input\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-grid\" >\n");
      out.write("                    	<input type=\"password\" name=\"newPassword\" id=\"w3lPhone\" placeholder=\"New Password\" class=\"contact-input\" required />\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"d-grid\" >\n");
      out.write("                    	<input type=\"password\" name=\"confirmNewPassword\" id=\"w3lPhone\" placeholder=\"Confirm New Password\" class=\"contact-input\" required />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("                <div class=\"text-left\" style=\"align: left\">\n");
      out.write("                    <button class=\"btn btn-style btn-primary btn-contact\" type=\"submit\" name=\"action\" value=\"changePassword\">Change Password</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>E-Society-User Footer</title>\n");
      out.write(" <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <!-- google fonts -->\n");
      out.write("  <link href=\"//fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("  <!-- google fonts -->\n");
      out.write("  <!-- Template CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/style-starter.css\">\n");
      out.write("  <!-- Template CSS --></head>\n");
      out.write("<body>\n");
      out.write("<!--/w3l-footer-29-main-->\n");
      out.write("  <section class=\"w3l-footer-29-main\">\n");
      out.write("    <div class=\"footer-29 py-5\">\n");
      out.write("      <div class=\"container py-lg-4\">\n");
      out.write("        <div class=\"row footer-top-29\">\n");
      out.write("          <div class=\"footer-list-29 col-lg-4\">\n");
      out.write("            <h6 class=\"footer-title-29\">About Us</h6>\n");
      out.write("            <p class=\"pr-lg-5\">We'll help you to manage your society related work. If you're facing any problem then you can register your complain\n");
      out.write("          and we'll reach out with possible solutions.</p>\n");
      out.write("            <div class=\"main-social-footer-29 mt-4\">\n");
      out.write("              <a href=\"#facebook\" class=\"facebook\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("              <a href=\"#twitter\" class=\"twitter\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("              <a href=\"#instagram\" class=\"instagram\"><span class=\"fa fa-instagram\"></span></a>\n");
      out.write("              <a href=\"#linkedin\" class=\"linkedin\"><span class=\"fa fa-linkedin\"></span></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-2 col-md-6 col-sm-4 footer-list-29 footer-2 mt-lg-0 mt-5\">\n");
      out.write("\n");
      out.write("            <ul>\n");
      out.write("              <h6 class=\"footer-title-29\">Useful Links</h6>\n");
      out.write("              <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("              <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("              <li><a href=\"services.html\">Services</a></li>\n");
      out.write("              <li><a href=\"member-signup.jsp\">Member Sign Up</a></li>\n");
      out.write("              <li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-list-29 footer-3 mt-lg-0 mt-5\">\n");
      out.write("            <ul>\n");
      out.write("              <h6 class=\"footer-title-29\">Services</h6>\n");
      out.write("              \n");
      out.write("              <li>\n");
      out.write("                <a href=\"#url\">\n");
      out.write("                  Make Complaints\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("               <li>\n");
      out.write("                <a href=\"#url\">\n");
      out.write("                  Pay Maintenance\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 col-md-6 col-sm-8 footer-list-29 footer-1 mt-lg-0 mt-5\">\n");
      out.write("            <h6 class=\"footer-title-29\">Contact Us</h6>\n");
      out.write("            <ul>\n");
      out.write("              <li>\n");
      out.write("                <p><span class=\"fa fa-map-marker\"></span> E-Society, Ahmedabad, Gujarat</p>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"tel:+7-800-999-800\"><span class=\"fa fa-phone\"></span> +(21)-255-999-8888</a></li>\n");
      out.write("              <li><a href=\"mailto:eSociety2023.gmail.com\" class=\"mail\"><span class=\"fa fa-envelope-open-o\"></span>\n");
      out.write("                  eSociety2023.gmail.com</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <section class=\"w3l-footer-29-main w3l-copyright\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"bottom-copies\">\n");
      out.write("        <p class=\"copy-footer-29 text-center\">© 2020 Livefloor. All rights reserved. Design by <a\n");
      out.write("            href=\"https://w3layouts.com/\" target=\"_blank\">\n");
      out.write("            W3Layouts</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  <!-- //footer-29 block -->\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
