<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import ="lab.mvc.model.Person" %>
	<jsp:useBean id="bean" beanName="request.getAttribute('bean')" scope="request" type="lab.mvc.model.Person"/>
	
	FirstName : <jsp:getProperty property="firstName" name="bean"/> <br>
	LastName : <jsp:getProperty property="lastName" name="bean"/> <br>
	Birthday : <jsp:getProperty property="birthDay" name="bean"/> <br>
	Sex : <jsp:getProperty property="sex" name="bean"/> <br>
	
	<p> Tu es jeune </p>
</body>
</html>
