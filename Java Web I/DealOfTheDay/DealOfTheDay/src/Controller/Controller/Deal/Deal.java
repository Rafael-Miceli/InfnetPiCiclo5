package Controller.Deal;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Categoria;
import Service.CategoriaService;
import Service.DealService;

public class Deal extends HttpServlet{
	
	private DealService _dealService;
	private CategoriaService _categoriaService;
	
	public Deal() {
		_dealService = new DealService();
		_categoriaService = new CategoriaService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Integer Id = Web.WebUtil.GetIdFromQueryString(req.getQueryString());
		
		List<Categoria> categories = _categoriaService.listCategories();
		req.setAttribute("Categories", categories);
		
		if(Id > 0)
		{
			Model.Deal deal = _dealService.FindDeal(Id);		
			req.setAttribute("DealModel", deal);
		}
		
		req.getRequestDispatcher("WEB-INF/View/Deal/Deal.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Model.Deal deal = new Model.Deal();
		
		deal.setId(Integer.parseInt(req.getParameter("idDeal")));
		deal.setTitle(req.getParameter("txtTitle"));
		deal.setDescription(req.getParameter("txtDescription"));
		//deal.setPrice(Double.parseDouble(req.getParameter("txtPrice")));
		deal.setCategory(_categoriaService.findCategory(Integer.parseInt(req.getParameter("ddlCategory"))));
		deal.setRules(req.getParameter("txtRules"));
		
		if (req.getParameter("idDeal") == null || req.getParameter("idDeal") == "") {
			_dealService.create(deal);
		}
		else {
			_dealService.update(deal);
		}
		
		List<Model.Deal> deals = _dealService.listDeals();		
		req.setAttribute("deals", deals);		
		req.getRequestDispatcher("WEB-INF/View/Deal/ListDeals.jsp").forward(req, resp);
	}
}
