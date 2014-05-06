package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		req.setAttribute("Welcome", "Bem-víndo ao site de Compras coletivas");
		req.getRequestDispatcher("WEB-INF/View/Home.jsp").forward(req, resp);
	}	
}
