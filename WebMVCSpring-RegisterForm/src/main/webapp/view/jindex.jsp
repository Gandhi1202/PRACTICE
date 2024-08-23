<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error{color:red}
</style>
</head>
<body>
<h3> Registraction form</h3>
<form:form action="register" modelAttribute="user" method="POST">
<table>
<tr>
<td>UserName:</td>
<td><form:input path="uName"/> <form:errors path="uName" cssClass="error"/></td>

</tr>

<tr>
<td>Password:</td>
<td><form:input path="pwd"/> <form:errors path="pwd" cssClass="error"/></td>
</tr>
<tr>
<td>E-Mail:</td>
<td><form:input path="email"/><form:errors path="email" cssClass="error"/></td>
</tr>
<tr>
<td>Phone number:</td>
<td><form:input path="phNo"/><form:errors path="phNo" cssClass="error"/></td>
</tr>
<tr>
<td>Age:</td>
<td><form:input path="age"/><form:errors path="age" cssClass="error"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Registration" /></td>
</tr>
</table>
</form:form>

</body>
</html>