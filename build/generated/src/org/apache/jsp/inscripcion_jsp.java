package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inscripcion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      FitnessCenter.Inscripcion inscripcion = null;
      synchronized (session) {
        inscripcion = (FitnessCenter.Inscripcion) _jspx_page_context.getAttribute("inscripcion", PageContext.SESSION_SCOPE);
        if (inscripcion == null){
          inscripcion = new FitnessCenter.Inscripcion();
          _jspx_page_context.setAttribute("inscripcion", inscripcion, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
 if (request.getParameter("nombre") != null) { 
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("inscripcion"), request);
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Nuevo cliente</title>\r\n");
      out.write("    <style>\r\n");
      out.write("      body {\r\n");
      out.write("        background-color: blue;\r\n");
      out.write("        font-family: Calibri, sans-serif;\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("      }\r\n");
      out.write("      label {\r\n");
      out.write("        color: white;\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        width: 10%;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <form action=\"inscripcion.jsp\" method=\"post\">\r\n");
      out.write("      <label for=\"nombre\">Nombre</label>\r\n");
      out.write("      <input name=\"nombre\" type=\"text\" required autofocus/>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <label for=\"apellido1\">Primer apellido</label>\r\n");
      out.write("      <input name=\"apellido1\" type=\"text\" required/>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <label for=\"apellido2\">Segundo apellido</label>\r\n");
      out.write("      <input name=\"apellido2\" type=\"text\" required/>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <label for=\"domicilio\">Domicilio</label>\r\n");
      out.write("      <input name=\"domicilio\" type=\"text\" required/>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <label for=\"fechaNac\">Fecha nacimiento</label>\r\n");
      out.write("      <input name=\"fechaNac\" type=\"date\" required/>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <label for=\"telefono\">Teléfono</label>\r\n");
      out.write("      <input name=\"telefono\" type=\"tel\" required/>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <label for=\"dni\">D.N.I.</label>\r\n");
      out.write("      <input name=\"dni\" type=\"text\" required/>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <label for=\"tipoCuota\">Tipo de cuota</label>\r\n");
      out.write("      <select name=\"tipoCuota\">\r\n");
      out.write("        <option disabled selected>Seleccione cuota...</option>\r\n");
      out.write("        <option value=\"F\">Familiar</option>\r\n");
      out.write("        <option value=\"I\">General individual</option>\r\n");
      out.write("        <option value=\"M\">Mañanas</option>\r\n");
      out.write("        <option value=\"3\">Tercera edad</option>\r\n");
      out.write("      </select>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <input type=\"submit\" value=\"Enviar inscripción\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
