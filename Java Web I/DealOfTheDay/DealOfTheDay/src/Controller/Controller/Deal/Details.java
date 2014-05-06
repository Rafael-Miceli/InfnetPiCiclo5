package Controller.Deal;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Deal;
import Service.DealService;

public class Details extends HttpServlet{
	
	private DealService _dealService;
	
	public Details() {
		_dealService = new DealService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Integer Id = Web.WebUtil.GetIdFromQueryString(req.getQueryString());
		
		if(Id > 0)		
		{
			Deal deal = _dealService.FindDeal(Id);
			
			req.setAttribute("DetailsModel", deal);
			req.getRequestDispatcher("WEB-INF/View/Deal/Details.jsp").forward(req, resp);
		}
		else
			req.getRequestDispatcher("WEB-INF/View/Exception/Erro.jsp").forward(req, resp);
	}
	
}
