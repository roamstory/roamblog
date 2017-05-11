package net.helloworld.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.commons.beanutils.BeanUtilsBean;

import net.helloworld.support.HelloValidatorFactory;
import net.helloworld.support.SessionUtils;
import net.helloworld.user.User;
import net.helloworld.user.UserDAO;

@WebServlet("/users/update")
public class UpdateUserServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 로그인 세션여부
		HttpSession session = request.getSession();

		String sessionUserId = SessionUtils.getStringValue(session, LoginUserServlet.SESSION_USER_ID);
		if (sessionUserId == null) {
			response.sendRedirect("/");
			return;
		}

		User user = new User();
		try {

			BeanUtilsBean.getInstance().populate(user, request.getParameterMap());

		} catch (IllegalAccessException | InvocationTargetException e1) {
			throw new ServletException();
		}

		if (!user.isSameUser(sessionUserId)) {
			response.sendRedirect("/");
			return;
		}

		Validator validator = HelloValidatorFactory.createValidator();
		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

		if (constraintViolations.size() > 0) {
			request.setAttribute("isUpdate", true);
			request.setAttribute("user", user);
			String errorMessage = constraintViolations.iterator().next().getMessage();
			forwardJSP(request, response, errorMessage);
			return;
		}

		UserDAO userDAO = new UserDAO();
		userDAO.updateUser(user);

		response.sendRedirect("/");
	}

	private void forwardJSP(HttpServletRequest request, HttpServletResponse response, String errorMessage)
			throws ServletException, IOException {
		request.setAttribute("errorMessage", errorMessage);
		RequestDispatcher rd = request.getRequestDispatcher("/form.jsp");
		rd.forward(request, response);
	}
}
