package Controller.Deal;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Deal;
import Service.DealService;

public class ListDeals extends HttpServlet {
	
	private DealService _dealService;

	public ListDeals() {
		_dealService = new DealService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Deal> deals = _dealService.listDeals();
		
		req.setAttribute("deals", deals);
		req.getRequestDispatcher("WEB-INF/View/Deal/ListDeals.jsp").forward(req, resp);		
	}
}
