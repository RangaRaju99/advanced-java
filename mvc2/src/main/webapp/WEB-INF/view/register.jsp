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

<form:form action="save" modelAttribute="employee">
NAME:<form:input path="name" /><br>
PHONE:<form:input path="phone" /><br>
EMAIL:<form:input path="email" /><br>

<input type="submit" value="Register" >


</form:form>


</body>
</html>