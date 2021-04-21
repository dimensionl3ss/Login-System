package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css\"\n");
      out.write("      integrity=\"sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\n");
      out.write("      integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <script\n");
      out.write("      src=\"https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js\"\n");
      out.write("      integrity=\"sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <title>Home</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Login System </a>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n");
      out.write("          <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <!-- </span> -->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"dropdown show\">\n");
      out.write("          <a\n");
      out.write("            class=\"btn btn-default dropdown-toggle\"\n");
      out.write("            role=\"button\"\n");
      out.write("            id=\"user\"\n");
      out.write("            data-toggle=\"dropdown\"\n");
      out.write("            aria-haspopup=\"true\"\n");
      out.write("            aria-expanded=\"false\"\n");
      out.write("          >\n");
      out.write("            My Profile\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"user\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/Logout\">Log out</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("      ");
 
              String user = null;
              response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
              response.setHeader("Progma", "no-cache");
              response.setHeader("Expires", "0");
              if (session != null) {
                  user = session.getAttribute("name").toString();
                  if (session.getAttribute("name") != null) {
                      out.print("Hello, " + session.getAttribute("name") + " Welcome to your Profile");
                  } else {
                      response.sendRedirect("login.html");
                  }
            }else response.sendRedirect("login.html");
      
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <script>\n");
      out.write("      document.getElementById(\"user\").innerHTML = \"");
      out.print(user );
      out.write("\";\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
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
