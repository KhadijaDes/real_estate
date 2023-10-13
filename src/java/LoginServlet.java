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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class LoginServlet extends HttpServlet {

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
        throws ServletException, IOException, SQLException, ClassNotFoundException {
    response.setContentType("text/html;charset=UTF-8");
   try (PrintWriter out = response.getWriter()) {
        // Get username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Call the checkUserRole method to get the user's role
        String role = checkUserRole(username, password);
        
        if (role != null) {
            // User with the provided username and password exists
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("role", role);
            
            if (role.equals("seller")) {
                response.sendRedirect("propertyListing.jsp");
            } else if (role.equals("buyer")) {
              response.sendRedirect("PropertyListingsServlet");

             
            }
        } else {
            // Invalid username or password, display an error message
            out.println("<script>alert('Invalid username or password');</script>");
            out.println("<script>history.back();</script>");
        }
    }
        // Handle any exceptions that may occur during database operations
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
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
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

    private String checkUserRole(String username, String password) {
          Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String role = null;

    try {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Sweethome;encrypt=false;trustServerCertificate=false;";
        String usernamed = "sa";
        String passwordd = "123";

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(url, usernamed, passwordd);

        // Create a PreparedStatement to query the user's role based on username and password
        String query = "SELECT role FROM usersRegister WHERE username = ? AND password = ?";
        preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        // Execute the query and retrieve the role
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            role = resultSet.getString("role");
        }
    } catch (ClassNotFoundException | SQLException e) {
              // Handle any exceptions that may occur during database operations

    } finally {
        // Close database resources
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
        }
    }

    return role;
    }

}
