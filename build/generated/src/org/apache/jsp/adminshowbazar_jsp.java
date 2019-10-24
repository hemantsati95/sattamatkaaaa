package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminshowbazar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>admin_show_bazar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Admin_show_bazar\" method=\"post\">\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n1\" id=\"n1\" placeholder=\"Time_Bazar\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n2\" id=\"n2\" placeholder=\"Diamond\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n3\" id=\"n3\" placeholder=\"Milan Day\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n4\" id=\"n4\" placeholder=\"Rajdhani Day\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n5\" id=\"n5\" placeholder=\"Supreme Day\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n6\" id=\"n6\" placeholder=\"Kalyan\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n7\" id=\"n7\" placeholder=\"Milan Night\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n8\" id=\"n8\" placeholder=\"Rajdhani Night\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n9\" id=\"n9\" placeholder=\"Supreme Night\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n10\" id=\"n10\" placeholder=\"Bombay Bazar\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n11\" id=\"n11\" placeholder=\"Kalyan Night\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n12\" id=\"n12\" placeholder=\"Worli Mumbai\">\n");
      out.write("                    </td>\n");
      out.write("                </tr><tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n13\" id=\"n13\" placeholder=\"Bhagyalaxmi\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n14\" id=\"n14\" placeholder=\"Jodi Bazar\">\n");
      out.write("                    </td>\n");
      out.write("                   \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n15\" id=\"n15\" placeholder=\"MP Day\">\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n16\" id=\"n16\" placeholder=\"Biswar\">\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n17\" id=\"n17\" placeholder=\"Gaziabad\">\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n18\" id=\"n18\" placeholder=\"Farida_bad\">\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"n19\" id=\"n19\" placeholder=\"Kalyani\">\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\">\n");
      out.write("                    </td>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
