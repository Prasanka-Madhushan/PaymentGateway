package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Payment Services</title>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <!--Fonts link-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"PaymentServices\" method=\"POST\">\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        \n");
      out.write("                        <h2 class=\"heading\">Billing Details</h2>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>Name : </span>\n");
      out.write("                            <input type=\"text\" name=\"uname\" placeholder=\"Alex\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>Phone No : </span>\n");
      out.write("                            <input type=\"text\" name=\"tp\" placeholder=\"+94 xxxxxxxxx\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>Email : </span>\n");
      out.write("                            <input type=\"text\" name=\"email\" placeholder=\"ABC@gmail.com\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>Address : </span>\n");
      out.write("                            <input type=\"text\" name=\"address\" placeholder=\"SriLanka, Colombo 07\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>City : </span>\n");
      out.write("                            <input type=\"text\" name=\"city\" placeholder=\"Colombo\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"flex\">\n");
      out.write("                            <div class=\"inptbox\">\n");
      out.write("                                <span>State : </span>\n");
      out.write("                                <input type=\"text\" name=\"state\" placeholder=\"Sri Lanka\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"inptbox\">\n");
      out.write("                                <span>ZIP Code : </span>\n");
      out.write("                                <input type=\"text\" name=\"zipcode\" placeholder=\"xxxx\">\n");
      out.write("                            </div>       \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <h2 class=\"heading\">Payment Details</h2>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>Payment Methods : </span>\n");
      out.write("                            <img src=\"images/paypal img.jpg\" alt=\"Payment Methods\"/>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>Card Holder's Name : </span>\n");
      out.write("                            <input type=\"text\" name=\"holdername\" placeholder=\"Mr.Alex\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>Card Number : </span>\n");
      out.write("                            <input type=\"text\" name=\"cardno\" placeholder=\"1111-2222-3333-4444\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"inptbox\">\n");
      out.write("                            <span>Card EXP Month : </span>\n");
      out.write("                            <input type=\"text\" name=\"expmonth\" placeholder=\"xx\" required>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                        <div class=\"flex\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"inptbox\">\n");
      out.write("                                <span>EXP Year : </span>\n");
      out.write("                                <input type=\"text\" name=\"expyr\" placeholder=\"20xx\" required>\n");
      out.write("                            </div> \n");
      out.write("                            \n");
      out.write("                            <div class=\"inptbox\">\n");
      out.write("                                <span>CVV : </span>\n");
      out.write("                                <input type=\"text\" name=\"cvvno\" placeholder=\"xxxx\" required>\n");
      out.write("                            </div>      \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                          \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Check Out\" class=\"submitbtn\">\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
