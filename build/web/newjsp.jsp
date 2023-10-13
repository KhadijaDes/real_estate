<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Display</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #00f;
            color: #fff;
            text-align: center;
            padding: 20px 0;
            font-size: 28px;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            border: 1px solid #ccc;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 15px;
            text-align: left;
            font-size: 18px;
        }

        th {
            background-color: #00f;
            color: #fff;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f7f7f7;
        }

        tr:hover {
            background-color: #e0e0e0;
        }

        img {
            max-width: 100px;
            max-height: 100px;
        }
    </style>
</head>
<body>
    <header>Data from Database</header>
    <table>
        <tr>
            <th>Image</th>
            <th>Column1</th>
            <th>Column2</th>
            <th>Column3</th>
            <th>Column4</th>
            <th>Column5</th>
            <th>Column6</th>
            <!-- Add more table headers as needed -->
        </tr>
        <c:forEach items="${dataList}" var="row">
            <tr>
                <td><img src="${row.imagePath}" alt="Image" /></td>
                <td>${row.column1}</td>
                <td>${row.column2}</td>
                <td>${row.column3}</td>
                <td>${row.column4}</td>
                <td>${row.column5}</td>
                <td>${row.column6}</td>
                <!-- Add more table data cells for other columns -->
            </tr>
        </c:forEach>
    </table>
</body>
</html>
