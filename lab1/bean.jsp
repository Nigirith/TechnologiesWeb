<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="person" scope="application" class="isep.lab1.bean.Person"/>
	
	<jsp:setProperty name="person" property="firstName" value='<%=request.getParameter("firstName")%>'/>
	<jsp:setProperty name="person" property="lastName" value='<%=request.getParameter("lastName")%>'/>
	<jsp:setProperty name="person" property="birthDay" value='<%=request.getParameter("birthDay")%>'/>
	<jsp:setProperty name="person" property="sex" value='<%=request.getParameter("sex")%>'/>
	
	<jsp:getProperty name="person" property="firstName" />
	<jsp:getProperty name="person" property="lastName"/>
	<jsp:getProperty name="person" property="birthDay"/>
	<jsp:getProperty name="person" property="sex"/>

</body>
</html>