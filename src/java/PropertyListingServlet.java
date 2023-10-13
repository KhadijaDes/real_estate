///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.Part;
//import javax.servlet.annotation.MultipartConfig;
//
//
///**
// *
// * @author hp
// */
//
//@MultipartConfig(
//    fileSizeThreshold = 1024 * 1024 * 2,  // 2 MB
//    maxFileSize = 1024 * 1024 * 10,      // 10 MB
//    maxRequestSize = 1024 * 1024 * 50    // 50 MB
//)
//public class PropertyListingServlet extends HttpServlet {
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException, SQLException {
//        response.setContentType("text/html;charset=UTF-8");
//      
//       
//      
//        
//        String city = request.getParameter("city");
//
//        
//        
//        String location = request.getParameter("location");
//      
//        double price = 0.0;
//        String priceParameter = request.getParameter("price");
// // Default value in case the parameter is missing or invalid
//
//if (priceParameter != null && !priceParameter.isEmpty()) {
//    try {
//        price = Double.parseDouble(priceParameter);
//    } catch (NumberFormatException e) {
//        // Handle the case where the "price" parameter is present but not a valid number
//        // You can log an error, display an error message, or take appropriate action.
//    }
//}
//
//       String bedroomsParameter = request.getParameter("bedrooms");
//int bedrooms = 0; // Default value in case the parameter is missing or invalid
//
//if (bedroomsParameter != null && !bedroomsParameter.isEmpty()) {
//    try {
//        bedrooms = Integer.parseInt(bedroomsParameter);
//    } catch (NumberFormatException e) {
//        // Handle the case where the "bedrooms" parameter is present but not a valid integer
//        // You can log an error, display an error message, or take appropriate action.
//    }
//}
//
//       String bathroomsParameter = request.getParameter("bathrooms");
//int bathrooms = 0; // Default value in case the parameter is missing or invalid
//
//if (bathroomsParameter != null && !bathroomsParameter.isEmpty()) {
//    try {
//        bathrooms = Integer.parseInt(bathroomsParameter);
//    } catch (NumberFormatException e) {
//        // Handle the case where the "bathrooms" parameter is present but not a valid integer
//        // You can log an error, display an error message, or take appropriate action.
//    }
//}
//
//        String propertyType = request.getParameter("propertyType");
//        String extraFacilities = request.getParameter("extraFacilities");
//        String transportModes = request.getParameter("transportModes");
//        String furniture = request.getParameter("furniture");
//        Part imagePart = request.getPart("image");
//        String paymentMode = request.getParameter("paymentMode");
//        String contactDetails = request.getParameter("contactDetails");
//
//        // Save the image to a directory and get its file path
//        String imagePath = saveImage(imagePart);
//
//        // Store the property listing data in the database
//        Connection con = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        try {
//                      String url = "jdbc:sqlserver://localhost:1433;databaseName=Sweethome;encrypt=false;trustServerCertificate=false;";
//String usernamed = "sa";
//String passwordd = "123";
//
//            // Establish a database connection
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//             con = DriverManager.getConnection(url, usernamed, passwordd);
//// Establish a database connection
//
//
//
//
//            // SQL query to insert property listing data into the database
//            String sql = "INSERT INTO dbo.PropertyListings (City, Location, Price, Bedrooms, Bathrooms, PropertyType, " +
//                    "ExtraFacilities, TransportModes, Furniture, ImagePath, PaymentMode, ContactDetails) " +
//                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            
//            preparedStatement = con.prepareStatement(sql);
//            preparedStatement.setString(1, city);
//            preparedStatement.setString(2, location);
//            preparedStatement.setDouble(3, price);
//            preparedStatement.setInt(4, bedrooms);
//            preparedStatement.setInt(5, bathrooms);
//            preparedStatement.setString(6, propertyType);
//            preparedStatement.setString(7, extraFacilities);
//            preparedStatement.setString(8, transportModes);
//            preparedStatement.setString(9, furniture);
//            preparedStatement.setString(10, imagePath);
//            preparedStatement.setString(11, paymentMode);
//            preparedStatement.setString(12, contactDetails);
//  // Redirect to the property_listing_result.jsp page after successfully storing the data
//
//            // Execute the SQL query to insert data
//            preparedStatement.executeUpdate();
//
//
//
//            
//            // Redirect to a success page or display a success message
//            response.sendRedirect("index.jsp");
//            
//            
//            String selectQuery = "SELECT * FROM dbo.PropertyListings"; // Modify the query as needed
//preparedStatement = con.prepareStatement(selectQuery);
//resultSet = preparedStatement.executeQuery();
//
//            List<PropertyListing> propertyListings = new ArrayList<>();
//            
//            while (resultSet.next()) {
//    PropertyListing property = new PropertyListing();  
//    
//    property.setCity(resultSet.getString("City"));
//    property.setLocation(resultSet.getString("Location"));
//    property.setPrice(resultSet.getDouble("Price"));
//
//    property.setBedrooms(resultSet.getInt("Bedrooms"));
//    property.setBathrooms(resultSet.getInt("Bathrooms"));
//    property.setPropertyType(resultSet.getString("PropertyType"));
//    property.setExtraFacilities(resultSet.getString("ExtraFacilities"));
//    property.setTransportModes(resultSet.getString("TransportModes"));
//    property.setFurniture(resultSet.getString("Furniture"));
//   property.setImagePath(resultSet.getString("ImagePath"));
//    property.setPaymentMode(resultSet.getString("PaymentMode"));
//    property.setContactDetails(resultSet.getString("ContactDetails"));      
//           
//             propertyListings.add(property);
//             
//           
//            }
//               System.out.println("Number of property listings retrieved: " + propertyListings.size());
//
//            request.setAttribute("propertyListings", propertyListings);
//            
//            
//            System.out.println("propertyListings attribute is set in the request.");
//
//RequestDispatcher dispatcher = request.getRequestDispatcher("property_listing_result.jsp");
//dispatcher.forward(request, response);
//            
//
//
//    // ...
//
//
//        } catch (ClassNotFoundException e) {
//            System.out.println("no ffff");
//            // Handle database errors or validation errors
//            // Redirect to an error page or display an error message
//        } finally {
////            response.sendRedirect("login.jsp");
//           try {
//            if (resultSet != null) {
//                resultSet.close();
//            }
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//            if (con != null) {
//                con.close();
//            }
//        } catch (SQLException e) {
//            }
//        }
//        
//                
//
//           
//    
//
//    }
//    
//    
//
//    // Method to save an image to a directory and return its file path
//private String saveImage(Part imagePart) throws IOException {
//    if (imagePart != null && imagePart.getSize() > 0) {
//        // Implement logic to save the image to a directory and return its file path
//        // You may also consider generating a unique filename for each image to avoid conflicts
//        String imagePath = "/image/" + imagePart.getSubmittedFileName(); // Corrected path
//        try (InputStream input = imagePart.getInputStream();
//             OutputStream output = new FileOutputStream(getServletContext().getRealPath(imagePath))) {
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = input.read(buffer)) != -1) {
//                output.write(buffer, 0, bytesRead);
//            }
//            return imagePath;
//        } catch (IOException e) {
//            // Handle the error here, e.g., log it or return an error message
//            return null;
//        }
//    } else {
//        // Handle the case where no file was uploaded
//        return null;
//    }
//}
//
//
//
//
//
//
//
//
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            processRequest(request, response);
//        } catch (SQLException ex) {
//            Logger.getLogger(PropertyListingServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            processRequest(request, response);
//        } catch (SQLException ex) {
//            Logger.getLogger(PropertyListingServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
