<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<m:master>	
	<div id="interface">
		<span>
			Preço da compra R$<c:out value="${DetailsModel.price }" />			
		</span>
	</div>
</m:master>