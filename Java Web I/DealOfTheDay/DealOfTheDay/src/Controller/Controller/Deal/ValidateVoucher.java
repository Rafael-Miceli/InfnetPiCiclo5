package Controller.Deal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PaperAuthentication.ProviderHttpServlet;

public class ValidateVoucher extends ProviderHttpServlet {

	public ValidateVoucher() {
		
	}
	
	@Override
	protected void PerformGetOperations(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/View/Deal/ValidateVoucher.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		
	}
}
