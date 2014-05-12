package Controller.Deal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Voucher;
import PaperAuthentication.ProviderHttpServlet;
import Service.VoucherService;

public class ValidateVoucher extends ProviderHttpServlet {

	private VoucherService _voucherService;

	public ValidateVoucher() {
		//Poor Mans Dependency Injection
		_voucherService = new VoucherService();
	}
	
	@Override
	protected void PerformGetOperations(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {		
		
		req.getRequestDispatcher("WEB-INF/View/Deal/ValidateVoucher.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Voucher voucher = _voucherService.validateVoucher(req.getParameter("txtVoucherCode").toString());
		
		if(voucher != null) {			
			req.setAttribute("VoucherModel", voucher);
			req.getRequestDispatcher("WEB-INF/View/Deal/VoucherValidated.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("VoucherMessage", "Voucher Inválido");
			req.getRequestDispatcher("WEB-INF/View/Deal/ValidateVoucher.jsp").forward(req, resp);
		}
		
		
	}
}
