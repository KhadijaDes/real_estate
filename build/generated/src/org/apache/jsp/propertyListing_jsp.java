package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class propertyListing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Property Listing Form</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/property.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <form action=\"PropertyListingsServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("        <h1>Property Listing</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <input type=\"hidden\" name=\"action\" value=\"insert\"> <!-- Set the action to \"insert\" -->\n");
      out.write("        \n");
      out.write("        <label>City:</label>\n");
      out.write("        <input type=\"text\" name=\"city\" required><br>\n");
      out.write("\n");
      out.write("        <label>Location/Area in the City:</label>\n");
      out.write("        <input type=\"text\" name=\"location\" required><br>\n");
      out.write("        \n");
      out.write("        <label>Price:</label>\n");
      out.write("        <input type=\"text\" name=\"price\" required><br>\n");
      out.write("        \n");
      out.write("        <label>Number of Bedrooms:</label>\n");
      out.write("        <input type=\"number\" name=\"bedrooms\" required><br>\n");
      out.write("        \n");
      out.write("        <label>Number of Bathrooms:</label>\n");
      out.write("        <input type=\"number\" name=\"bathrooms\" required><br>\n");
      out.write("        \n");
      out.write("        <label>Type:</label>\n");
      out.write("        <select name=\"propertyType\">\n");
      out.write("            <option value=\"Residential Land\">Residential Land</option>\n");
      out.write("            <option value=\"Commercial\">Commercial</option>\n");
      out.write("            <option value=\"Condominium\">Condominium</option>\n");
      out.write("            <option value=\"Townhouse\">Townhouse</option>\n");
      out.write("            <option value=\"Multi-unit dwelling\">Multi-unit dwelling</option>\n");
      out.write("        </select><br>\n");
      out.write("        \n");
      out.write("        <label>Extra Facilities:</label>\n");
      out.write("        <input type=\"text\" name=\"extraFacilities\"><br>\n");
      out.write("        \n");
      out.write("        <label>Convenient Modes of Transport:</label>\n");
      out.write("        <input type=\"text\" name=\"transportModes\"><br>\n");
      out.write("        \n");
      out.write("        <label>With or Without Furniture/Interiors:</label>\n");
      out.write("        <input type=\"radio\" name=\"furniture\" value=\"With\" checked> With\n");
      out.write("        <input type=\"radio\" name=\"furniture\" value=\"Without\"> Without<br><br>\n");
      out.write("        \n");
      out.write("        <label>Upload an Image:</label>\n");
      out.write("        <input type=\"file\" name=\"image\" accept=\"image/*\"><br>\n");
      out.write("        \n");
      out.write("        <label>Mode of Payment:</label>\n");
      out.write("        <input type=\"text\" name=\"paymentMode\"><br>\n");
      out.write("        \n");
      out.write("        <label>Contact Details:</label>\n");
      out.write("        <input type=\"text\" name=\"contactDetails\" required><br>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </form>\n");
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
