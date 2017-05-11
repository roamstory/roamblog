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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.helloworld.posts.Post;
import net.helloworld.posts.PostDAO;
import net.helloworld.support.SessionUtils;

@WebServlet("/users/post")
public class ReadPostServlet extends HttpServlet {

	private static Logger logger = LoggerFactory.getLogger(ReadPostServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int index = Integer.parseInt(req.getParameter("index"));
		
		if (index == 0) {
			RequestDispatcher rd = req.getRequestDispatcher("/nonepost.jsp");
			rd.forward(req, resp);
			return;
		}
		
		logger.debug("index : {}",index);
		HttpSession session = req.getSession();
		String userId = SessionUtils.getStringValue(session, LoginUserServlet.SESSION_USER_ID);

		if (userId == null) {
			resp.sendRedirect("/");
			return;
		}

		PostDAO postDAO = new PostDAO();

		if (index == 0) {
			RequestDispatcher rd = req.getRequestDispatcher("/nonepost.jsp");
			rd.forward(req, resp);
			return;
		}
		Post post = postDAO.readPost(index);
		req.setAttribute("post", post);
		logger.debug("post: {}", post);
		RequestDispatcher rd = req.getRequestDispatcher("/post.jsp");
		rd.forward(req, resp);
	}

}
