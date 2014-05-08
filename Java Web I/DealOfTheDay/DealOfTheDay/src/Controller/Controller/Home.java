package Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uteis.BuscaProperties; //testar caminho do import...estou sem ambiente eclipse aqui no trabalho

public class Home extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.processRequest(req, resp);
	}

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		//inicio de teste busca properties..............
		Properties acessoPropertiesCategoria = new Properties();
		HashMap todasCategoriasDoSistema = new HashMap();

		acessoPropertiesCategoria = BuscaProperties.emArquivo("uteis/categoria.properties");
		todasCategoriasDoSistema.putAll(acessoPropertiesCategoria);
		//fim de teste busca properties................
		
		
		//inicio de teste setAtribute categoria com o HashMap acima ... para enviar para camada de visao
		req.setAttribute("todasCategoriasDoSistema", todasCategoriasDoSistema);
		//fim de teste setAtribute................
		
		req.setAttribute("Welcome", "Conteúdo dinâmico");
		req.getRequestDispatcher("Home.jsp").forward(req, resp);
	}	
	

}
