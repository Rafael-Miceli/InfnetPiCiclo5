<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<m:master>	
	<div id="interface">
		<span>
			Pre�o da compra R$<c:out value="${DetailsModel.price }" />			
		</span>
		
		<div id="tabs">
		  <ul>		
		    <li><a href="#tabs-Card">Cart�o</a></li>		
		    <li><a href="#tabs-BankSlip">Boleto</a></li>				
		  </ul>		
		  <div id="tabs-Card">
	  		<form method="post" action="DealPayment">
	  			<span>Tipo do cart�o</span>
			  	<br>
			  	<select name="ddlCardType">
			  		<option value="Master" selected="selected">Master</option>
			  		<option value="Visa">Visa</option>
			  		<option value="Amex">American Express</option>
			  		<option value="Dinners">Dinners</option>
			  	</select>
			  	<br>
			  	<br>
			  	<span>N�mero do cart�o</span>
			  	<br>
			  	<input type="text" name="txtCardNumber" />
			  	<br>
			  	<br>
			  	<span>Nome no cart�o</span>
			  	<br>
			  	<input type="text" name="txtCardName" />
			  	<br>
			  	<br>
			  	<span>Validade</span>
			  	<br>
			  	<span>Dia</span> 
			  	<select name="ddlDay">			  		
			  	</select>			  	
			  	<span>M�s</span> 
			  	<select name="ddlMonth">			  		
			  	</select>
			  	<br>
			  	<br>
			  	<span>C�digo de seguran�a</span>
			  	<br>
			  	<input type="text" name="txtCardSecureCode" />
			  	<br>
			  	<br>
			  	<input type="hidden" value="${DetailsModel.id}" name="txtDealId"/>
			  	<input type="submit" value="Comprar" />
		  	</form>		    		
		  </div>		
		  <div id="tabs-BankSlip">		
		    <form method="post" action="DealPayment">
		    	<input type="hidden" value="${DetailsModel.id}" name="txtDealId"/>
		    	<input type="submit" value="Imprimir Boleto">
		    </form>		
		  </div>		
		</div>
	</div>
	
	<script type="text/javascript">
	  $(function() {
	
	    $("#tabs").tabs();
	
	  });
  	</script>
	
</m:master>