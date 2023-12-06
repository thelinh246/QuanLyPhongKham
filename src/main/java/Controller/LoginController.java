package Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.DAO.PersonDAO;
import Model.BO.LoginBO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBO login = new LoginBO();
		boolean isValidUser = login.validateUser(username, password);
		if (isValidUser) {
			response.sendRedirect("Index.jsp");
		}else {
			response.sendRedirect("Login.jsp?error=0");
		}
	}
}
