<%-- 
    Document   : register
    Created on : Oct 1, 2023, 7:18:26 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <head>
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="css/register.css">
</head>

</head>
<body>
    
    

  <div class="form-container"> <!-- Apply the form container style -->
        <h2>Registration</h2>
        <form action="RegistrationServlet" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
    
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
    
            <label for="role">Role:</label>
            <select id="role" name="role" required>
                <option value="buyer">Buyer</option>
                <option value="seller">Seller</option>
            </select><br><br>
    
            <!-- Add more registration fields as needed -->
    
            <input type="submit" value="Register">
        </form>
    </div>

    
       
</body>
</html>

