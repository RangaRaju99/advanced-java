<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Update here</h1>
<form action="update">
    <input type="hidden" name="id" value="${employee.id}">
    Name: <input type="text" name="name" value="${employee.name}"><br>
    Phone: <input type="text" name="phone" value="${employee.phone}"><br>
    Email: <input type="text" name="email" value="${employee.email}"><br>
    <input type="submit" value="Update">
</form>


</body>
</html>