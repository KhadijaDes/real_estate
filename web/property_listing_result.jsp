<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>
    <title>Property Listings</title>
   

</head>

    
    
    
<body>
    <h1>Property Listings</h1>
    <table border="1"  >
        <tr >
             <th>City</th>
             <th>Location</th>
             <th>Price</th>
             <th>Bedrooms</th> <!-- Add a header for the Bedrooms property -->
             <th>Bathrooms</th> <!-- Add a header for the Bathrooms property -->
             <th>Property Type</th> <!-- Add a header for the Property Type property -->
             <th>Extra Facilities</th> <!-- Add a header for the Extra Facilities property -->
             <th>Transport Modes</th> <!-- Add a header for the Transport Modes property -->
             <th>Furniture</th> <!-- Add a header for the Furniture property -->
             <th>Image Path</th>
             <th>Payment Mode</th> <!-- Add a header for the Payment Mode property -->
             <th>Contact Details</th> <!-- Add a header for the Contact Details property -->
            <!-- Add headers for other properties as needed -->
        </tr>
        <c:forEach items="${propertyListings}" var="property">
            <tr>
                <td>${property.city}</td>
                <td>${property.location}</td>
                <td>${property.price}</td>
                <td>${property.bedrooms}</td> <!-- Add a cell for the Bedrooms property -->
                <td>${property.bathrooms}</td> <!-- Add a cell for the Bathrooms property -->
                <td>${property.propertyType}</td> <!-- Add a cell for the Property Type property -->
                <td>${property.extraFacilities}</td> <!-- Add a cell for the Extra Facilities property -->
                <td>${property.transportModes}</td> <!-- Add a cell for the Transport Modes property -->
                <td>${property.furniture}</td> <!-- Add a cell for the Furniture property -->
                <td><img src="${property.imagePath}" alt="Property Image" style="width: 200px; height: 150px;"></td>
                <!-- Add a cell for the Image Path property -->
                <td>${property.paymentMode}</td> <!-- Add a cell for the Payment Mode property -->
                <td>${property.contactDetails}</td> <!-- Add a cell for the Contact Details property -->
                <!-- Add cells for other properties as needed -->
                
            </tr>
            
            
        </c:forEach>
            <c:if test="${empty propertyListings}">
    <p>No property listings found.</p>
</c:if>
    
    
    

    </table>
</body>
</html>
