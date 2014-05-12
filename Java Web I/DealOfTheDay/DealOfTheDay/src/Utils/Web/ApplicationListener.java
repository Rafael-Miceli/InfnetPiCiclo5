package Web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import Repository.DealRepository;
import Repository.UserRepository;
import Repository.VoucherRepository;

@WebListener
public class ApplicationListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		//Application Root!
		
		//Aqui inicializamos o Dependency Container
		//Mas para simplicidade da aplica��o irei guardar o objeto necess�rio como um atributo da aplica��o
		
		servletContextEvent.getServletContext().setAttribute("userRepository", new UserRepository());
		servletContextEvent.getServletContext().setAttribute("dealRepository", new DealRepository());
		servletContextEvent.getServletContext().setAttribute("voucherRepository", new VoucherRepository());
	}

}
