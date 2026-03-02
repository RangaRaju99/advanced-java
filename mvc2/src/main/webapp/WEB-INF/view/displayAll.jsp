<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Update</th>
    <th>Delete</th>
</tr>

<c:forEach var="emp" items="${employees}">
<tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.phone}</td>
    <td>${emp.email}</td>
    <td><a href="edit?id=${emp.id}">Update</a></td>
    <td><a href="delete?id=${emp.id}">Delete</a></td>
</tr>
</c:forEach>
</table>

<a href="registerPage">➕ Add New Employee</a>
<br><br>
</body>
</html>