package PaperAuthentication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUtils;

public class ProviderHttpServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		if(session.getAttribute("Role") == null || session.getAttribute("Role").toString() != "Provider") {
			session.setAttribute("target", HttpUtils.getRequestURL(req).toString());
			req.getRequestDispatcher("WEB-INF/View/User/Login.jsp").forward(req, resp);
		}
	}
}
