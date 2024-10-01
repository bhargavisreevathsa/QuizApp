<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.practice.quizapp.Model.Admin" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Information</title>
     <link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
<h1>Admin Information</h1>
<%
    Admin Admin = (Admin) request.getAttribute("Admin");
    if (Admin != null) {
%>
        <p>Name: <%= Admin.getName() %></p>
        <p>Email: <%= Admin.getEmail() %></p>
<%
    } else {
%>
        <p>No Admin information available.</p>
<%
    }
%>
</body>
</html>
