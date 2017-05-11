package net.helloworld.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.helloworld.support.SessionUtils;
import net.helloworld.user.User;
import net.helloworld.user.UserDAO;

@WebServlet("/users/form/update")
public class UpdateFormUserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String userId = SessionUtils.getStringValue(session, LoginUserServlet.SESSION_USER_ID);

		if (userId == null) {
			resp.sendRedirect("/");
			return;
		}

		UserDAO userDAO = new UserDAO();

		User user = userDAO.findByUserId(userId);
		req.setAttribute("isUpdate", true);
		req.setAttribute("user", user);
		RequestDispatcher rd = req.getRequestDispatcher("/form.jsp");
		rd.forward(req, resp);
	}

}
