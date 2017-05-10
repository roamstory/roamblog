package net.helloworld.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.helloworld.user.User;
import net.helloworld.user.UserDAO;

@WebServlet("/users/api/find")
public class ApiFindUserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		if (userId == null) {
			resp.sendRedirect("/");
			return;
		}
		
		UserDAO userDAO = new UserDAO();
		try {
			User user = userDAO.findByUserId(userId);
			if (user == null) {
				return;
			}
			
			final GsonBuilder builder = new GsonBuilder();
		    builder.excludeFieldsWithoutExposeAnnotation();
		    final Gson gson = builder.create();
		    ;
			String jsonData = gson.toJson(user);
			resp.setContentType("application/json;charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.print(jsonData);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
