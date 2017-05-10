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
import net.helloworld.utils.SessionUtils;

@WebServlet("/users/post")
public class ReadPostServlet extends HttpServlet {
	
	private static Logger logger = LoggerFactory.getLogger(ReadPostServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		 HttpSession session = req.getSession();
		 String userId = SessionUtils.getStringValue(session, LoginUserServlet.SESSION_USER_ID);
		 

		 
	     if (userId == null) {
	    	 resp.sendRedirect("/");
	    	 return;
	     }
	     
	     PostDAO postDAO = new PostDAO();
	     
	     try {
	    	 
			Post post = postDAO.readPost(1);
			req.setAttribute("post", post.getPost());
			RequestDispatcher rd = req.getRequestDispatcher("/post.jsp");
			rd.forward(req, resp);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
