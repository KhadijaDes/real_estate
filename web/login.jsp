<%-- 
    Document   : login
    Created on : Oct 1, 2023, 7:35:35 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
     <link rel="stylesheet" type="text/css" href="css/login.css"  >
</head>
<body>
   <div class="login-container">
        <h2>Login</h2>
        <form action="LoginServlet" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            
            
<!--         <label for="role">Role:</label>
        <select id="role" name="role" required>
            <option value="buyer">Buyer</option>
            <option value="seller">Seller</option>
        </select><br><br>-->
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
