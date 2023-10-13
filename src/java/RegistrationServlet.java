/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */


public class RegistrationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
             String username = request.getParameter("username");
      String password = request.getParameter("password");
       String role = request.getParameter("role");
          
               String url = "jdbc:sqlserver://localhost:1433;databaseName=Sweethome;encrypt=false;trustServerCertificate=false;";
String usernamed = "sa";
String passwordd = "123";

             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2-connection
       //3-Execute and statemt
       try{
           //3-Execute and statemt
            Connection con = DriverManager.getConnection(url, usernamed, passwordd);
            
            System.out.println("connected s");
            

//         Statement stmt = con.createStatement();
//           //-process the reslt
//        ResultSet rs = stmt.executeQuery("select * from dbo.userRegister");
           
         
//                   int row = stmt.executeUpdate("INSERT INTO [dbo].[userRegister] ([username], [password], [role]) VALUES (username, password, role);");
        
                   
                   // Assuming you have already created a Connection object named 'connection'

String query = "INSERT INTO [dbo].[usersRegister] ([username], [password], [role]) VALUES (?, ?, ?)";
PreparedStatement preparedStatement = con.prepareStatement(query);
preparedStatement.setString(1, username);
preparedStatement.setString(2, password);
preparedStatement.setString(3, role);
int row = preparedStatement.executeUpdate();

// Close the PreparedStatement when done
preparedStatement.close();

                   if(row >0){
                       if(role.equals("seller"))
                       {
                   response.sendRedirect("propertyListing.jsp");
                           
                       }else{
                       response.sendRedirect("register.jsp");
                       }
                   }
                   
                   
//           while (rs.next()) {
//               System.out.printf("username");
//           
////                    out.printf("%d : %s : %s : %d",rs.getInt("ID"),rs.getString("Name"), rs.getString("Name"),rs.getInt("AGE"));
//           }
 con.close();
       }
       
       
       catch(SQLException e){
           System.err.println("oops"+e);
       }
       
       
            
            
            
            
// String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String role = request.getParameter("role");
//
//        // Perform registration logic (e.g., validate inputs, store user in the database)
//        // For simplicity, we'll just print the data for demonstration purposes
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//        System.out.println("Role: " + role);
//
//        // After registration logic, redirect to the home page
//     response.sendRedirect("index.jsp"); // Redirect to the home page
        }
        
    }
@Override
public void destroy() {
    // Clean up resources, close connections, etc.
    super.destroy();
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
