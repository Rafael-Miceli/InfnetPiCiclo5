<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<m:master>
	<div id="interface">
	<span>Promoções</span>
	
	<br>
		
	<a href="Deal" >Criar Promoção</a>
	
	<table>
		<tr>
			<th>
				<span>Titúlo</span>	
			</th>
			<th>
				<span>Categoria</span>	
			</th>
			<th>
				<span>Preço</span>
			</th>
			<th>
				<span>Total vendido</span>
			</th>
			<th>
				
			</th>			
		</tr>
		<c:forEach items="${deals}" var="deal">
			<c:url value="Deal" var="urlDeal">
				<c:param name="Id" value="${deal.id}" />
			</c:url>
		
			<tr>
				<td>
					<span><a href="${urlDeal}" ><c:out value="${deal.title}" /></a></span>
				</td>
				<td>
					<span><c:out value="${deal.category.nome}" /></span>
				</td>
				<td>
					<span><c:out value="${deal.price}" /></span>
				</td>
				<td align="center">
					<span><c:out value="${deal.totalBuyed}" /></span>
				</td>
				<td>
					<input type="button" value="Excluir" data-id="${deal.id}" />
				</td>
			</tr>		
		</c:forEach>
	</table>
	</div>	
</m:master>