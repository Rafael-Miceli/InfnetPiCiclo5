<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<m:master>    
<c:out value="${Welcome}" />

<br>
<c:url value="DealDetails" var="urlDealDetail">
	<c:param name="Id" value="1" />
</c:url>

<a href="${urlDealDetail}" >
	Detalhe de uma promoção
</a>

</m:master>
