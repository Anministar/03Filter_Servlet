package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main.do")
public class FrontController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("[FC] Start!-------"); //FC == FrontController
		
		//resp.sendRedirect("main.jsp");
		req.getRequestDispatcher("WEB-INF/main.jsp").forward(req, resp);
		
		System.out.println("[FC] End!--------");
		
	}

	
	
	
	
}
