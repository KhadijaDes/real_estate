package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Home Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row row-cols-1 row-cols-md-2 g-4\">\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <img src=\"https://www.cio.com/wp-content/uploads/2023/07/shutterstock_676661263.jpg?quality=50&strip=all&w=1024\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy-3NcAXu69qOdHCCLgGRuhtrbNw_r3vi_8_8QrswxAJt1_cyacCXvj57k94p5i5wyZlo&usqp=CAU\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkbGgiSUUcEOvzTxNIXe6b1CEZzrqlXR6RmZn1C_VEPAozps1zxNoaKs-Ub--KM09NAlc&usqp=CAU\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <img src=\"https://i2.au.reastatic.net/800x600/8fcbdc204b1a9d32abb769c371f26fe7c9d1e36cb3e00ef68614d62503b3de45/image.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/footer.jsp", out, false);
      out.write("\n");
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
