package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            :root {\n");
      out.write("  input-padding-x: 1.5rem;\n");
      out.write("  input-padding-y: .75rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background: #007bff;\n");
      out.write("  background: linear-gradient(to right, #0062E6, #33AEFF);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-signin {\n");
      out.write("  border: 0;\n");
      out.write("  border-radius: 1rem;\n");
      out.write("  box-shadow: 0 0.5rem 1rem 0 rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-signin .card-title {\n");
      out.write("  margin-bottom: 2rem;\n");
      out.write("  font-weight: 300;\n");
      out.write("  font-size: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-signin .card-body {\n");
      out.write("  padding: 2rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-signin {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-signin .btn {\n");
      out.write("  font-size: 80%;\n");
      out.write("  border-radius: 5rem;\n");
      out.write("  letter-spacing: .1rem;\n");
      out.write("  font-weight: bold;\n");
      out.write("  padding: 1rem;\n");
      out.write("  transition: all 0.2s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-label-group {\n");
      out.write("  position: relative;\n");
      out.write("  margin-bottom: 1rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-label-group input {\n");
      out.write("  height: auto;\n");
      out.write("  border-radius: 2rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-label-group>input,\n");
      out.write(".form-label-group>label {\n");
      out.write(" \n");
      out.write("\n");
      out.write(".form-label-group>label {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 0;\n");
      out.write("  /* Override default `<label>` margin */\n");
      out.write("  line-height: 1.5;\n");
      out.write("  color: #495057;\n");
      out.write("  border: 1px solid transparent;\n");
      out.write("  border-radius: .25rem;\n");
      out.write("  transition: all .1s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-label-group input:not(:placeholder-shown) {\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-label-group input:not(:placeholder-shown)~label {\n");
      out.write(" font-size: 12px;\n");
      out.write("  color: #777;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-google {\n");
      out.write("  color: white;\n");
      out.write("  background-color: #ea4335;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-facebook {\n");
      out.write("  color: white;\n");
      out.write("  background-color: #3b5998;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fallback for Edge\n");
      out.write("-------------------------------------------------- */\n");
      out.write("\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("  <body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      \n");
      out.write("            <h5 class=\"card-title text-center\">Sign In</h5>\n");
      out.write("            <form  action=\"login1\" method=\"post\">\n");
      out.write("              <div class=\"form-label-group\">\n");
      out.write("                  <input type=\"text\" id=\"inputUsername\" name=\"n1\" class=\"form-control\" placeholder=\"username\" required autofocus>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"form-label-group\">\n");
      out.write("                  <input type=\"password\" id=\"inputPassword\" name=\"n2\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("             \n");
      out.write("              <input class=\"btn btn-lg btn-primary btn-block text-uppercase\" type=\"submit\">Sign in</button>\n");
      out.write("              <hr class=\"my-4\">\n");
      out.write("              </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("</body>\n");
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
