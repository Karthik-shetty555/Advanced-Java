package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class file2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student Information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><br><br><br><br>\n");
      out.write("        <b>STUDENT DETAILS RETRIVED FROM STUDENT BEAN</b>\n");
      out.write("        ");
      program.StudentBean stud = null;
      synchronized (session) {
        stud = (program.StudentBean) _jspx_page_context.getAttribute("stud", PageContext.SESSION_SCOPE);
        if (stud == null){
          stud = new program.StudentBean();
          _jspx_page_context.setAttribute("stud", stud, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Student Name:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((program.StudentBean)_jspx_page_context.findAttribute("stud")).getName())));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Student USN:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((program.StudentBean)_jspx_page_context.findAttribute("stud")).getUsn())));
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Student Branch:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((program.StudentBean)_jspx_page_context.findAttribute("stud")).getBranch())));
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Email id:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((program.StudentBean)_jspx_page_context.findAttribute("stud")).getEmail())));
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Phone Number:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((program.StudentBean)_jspx_page_context.findAttribute("stud")).getPhone())));
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("        \n");
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
