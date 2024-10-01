<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Form</title>
    <link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
<h1>User Form</h1>
<form action="${pageContext.request.contextPath}/submitAdmin" method="post">
    <label>Name: <input type="text" name="name" required /></label><br>
    <label>Email: <input type="email" name="email" required /></label><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
