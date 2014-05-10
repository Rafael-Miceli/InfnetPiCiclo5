package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Categoria;

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
		/*
		//inicio de teste busca properties..............
		Properties acessoPropertiesCategoria = new Properties();
		acessoPropertiesCategoria = BuscaProperties.emArquivo("uteis/categoria.properties");


		//--jogando as properties dentro de hashMap--
		
		HashMap todasCategoriasDoSistema = new HashMap();
		todasCategoriasDoSistema.putAll(acessoPropertiesCategoria);
		


		//--jogando as properties dentro de array--
		//depois que ja estiver funcioando aqui...implementar essa parte dentro Repositorio.*
		List<Categoria> todasCategoriasDoSistema     = new ArrayList<Categoria>();
		//todasCategoriasDoSistema = Repositorio.buscarCategorias();//implementar esse for abaixo, dentro Repositorio.*
		Integer qtd = acessoPropertiesCategoria.size();
		for (int i=1; i<=qtd; i++)
		{
			Integer id = i;
			String valor = acessoPropertiesCategoria.getProperty(id.toString());//pegando o conteudo do ID da vez
			Categoria categoria = new Categoria();
			categoria.setId(id);
			categoria.setNome(valor);
			todasCategoriasDoSistema.add(categoria); //juntando varios objetos numa mesma array
		}

		//fim de teste busca properties................



		//inicio de teste setAtribute categoria com o HashMap acima ... para enviar para camada de visao
		req.setAttribute("todasCategoriasDoSistema", todasCategoriasDoSistema);
		//fim de teste setAtribute................
		*/
		
		req.setAttribute("Welcome", "Conteudo dinamico");
		req.getRequestDispatcher("Home.jsp").forward(req, resp);
	}	
	

}
