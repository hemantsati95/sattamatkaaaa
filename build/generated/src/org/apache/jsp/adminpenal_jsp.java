package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class adminpenal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AdminPenal</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("                body \n");
      out.write("                {\n");
      out.write("                 background-color: black;\n");
      out.write("                 background: url(img/t1.jpg) no-repeat center center fixed; \n");
      out.write("                 background-size: cover;\n");
      out.write("                 background-size: cover;\n");
      out.write("                 background-size: cover;\n");
      out.write("                 background-size: cover;\n");
      out.write("                }\n");
      out.write("                .color1\n");
      out.write("                {\n");
      out.write("                `color: red;\n");
      out.write("                }\n");
      out.write("                .hdtitle{\n");
      out.write("                background-color: red;\n");
      out.write("                }\n");
      out.write("                h1{\n");
      out.write("                background-color: red;\n");
      out.write("                }\n");
      out.write("                #my_centered_buttons { display: flex; justify-content: center; }\n");
      out.write("             \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.jsp\"><strong><div class=\"hdtitle\">SattaMatkaOne</div></strong></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"color1\">\n");
      out.write("                        <h1 style=\"font-size:4vw;\">Welcome To Sattamatka Admin Penal</h1>\n");
      out.write("                    </div>\n");
      out.write("    \n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\">    \n");
      out.write("             <div class=\"container-fluid\">    \n");
      out.write("                  <a class=\"btn btn-primary btn-lg margin-left \" class=\"margin-top\" href=\"update_bazar.jsp\" role=\"button\">Update All Bazars</a>\n");
      out.write("                  <a class=\"btn btn-primary btn-lg margin-left \" class=\"margin-top\" href=\"delete_bazar.jsp\" role=\"button\">Delete All Bazar</a>       \n");
      out.write("                  <a class=\"btn btn-primary btn-lg margin-left \" class=\"margin-top\" href=\"create_user.jsp\" role=\"button\">Create User</a>\n");
      out.write("             </div> \n");
      out.write("            <div class=\"a2a_kit a2a_kit_size_32 a2a_default_style\" id=\"my_centered_buttons\">\n");
      out.write("    <a class=\"a2a_button_facebook\"></a>\n");
      out.write("    <a class=\"a2a_button_twitter\"></a>\n");
      out.write("    <a class=\"a2a_button_pinterest\"></a>\n");
      out.write("    <a class=\"a2a_dd\" href=\"https://www.addtoany.com/share\"></a>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
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
