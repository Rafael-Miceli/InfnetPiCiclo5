<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${Welcome}" />
	
	<br>
	<c:url value="DealDetails" var="urlDealDetail">
		<c:param name="Id" value="1" />
	</c:url>
	
	<a href="${urlDealDetail}" >
		Detalhe de uma promo��o
	</a>

</body>
</html>