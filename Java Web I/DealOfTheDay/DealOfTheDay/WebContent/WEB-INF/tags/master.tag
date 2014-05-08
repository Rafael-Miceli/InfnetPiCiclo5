<%@tag description="Simple Master Tag" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<link href="Styles/site.css" rel="stylesheet" />
    <link href="Styles/page/index.css" rel="stylesheet" />
    <script src="Scripts/jquery-1.9.1.js"></script>
</head>
<body>
	<div class="top-bar">
        <ul>
            <li>
            	
            	<a href="ListDeals">Gerenciar Promoções</a>
            	|
                <a href="#">Cadastre-se</a>
                |
                <a href="#">Entrar</a>
            </li>
        </ul>
    </div>

	
	<jsp:doBody/>
  	
  	
  	<footer class="rodape">
        <div class="container">
            
            <div class="imagem">
                <img src="Img/formas_pagamento2.jpg" />
                <img src="Img/site_seguro2.jpg" />
            </div>

            <p>
                &#169; Compras Via Web
            </p>


            <div class="redes_sociais">
                <p>
                    <a href="http://facebook.com" target="_blank">Facebook</a>
                    |
                    <a href="http://twitter.com" target="_blank"> Twitter</a>
                </p>
            </div>

        </div>
    </footer>
</body>
</html>