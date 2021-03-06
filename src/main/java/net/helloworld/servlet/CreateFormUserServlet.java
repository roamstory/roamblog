package net.helloworld.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.helloworld.user.User;

@WebServlet("/users/form/create")
public class CreateFormUserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("user", new User());
		RequestDispatcher rd = req.getRequestDispatcher("/form.jsp");
		rd.forward(req, resp);
	}
}
