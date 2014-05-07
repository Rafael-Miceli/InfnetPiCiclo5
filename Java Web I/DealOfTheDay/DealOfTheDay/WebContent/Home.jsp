<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<m:master>    

	<!-- Colocar a busca e o select de estados por aqui -->

    <!-- Header -->

    <header class="cabecalho">
        <h1>Compras via web</h1>
    </header>
    
    <!-- Menu -->

    <nav class="menu">
        <div class="container">
            <ul>
                <li><a href="#">Categoria 1</a></li>
                <li><a href="#">Categoria 2</a></li>
                <li><a href="#">Categoria 3</a></li>
                <li><a href="#">Categoria 4</a></li>
            </ul>
        </div>
    </nav>
    
    <div id="interface">

		<c:out value="${Welcome}" />
		
		<br>
		<c:url value="DealDetails" var="urlDealDetail">
			<c:param name="Id" value="1" />
		</c:url>
		
		<a href="${urlDealDetail}" >
			Detalhe de uma promoção
		</a>
	</div>
</m:master>
