package net.helloworld.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;

import org.junit.Test;

import net.helloworld.user.User;
import net.helloworld.user.UserDAO;
import net.helloworld.user.UserTest;

public class DatabaseTest {

	@Test
	public void addAndFindExisted() throws SQLException {
		User user = UserTest.TEST_USER;
		UserDAO userDAO = new UserDAO();
		userDAO.addUser(user);
		
		User dbUser = userDAO.findByUserId(user.getUserId());
		
		assertEquals(user, dbUser);
	}
	
	@Test
	public void addAndFindNotExisted() throws SQLException {
		UserDAO userDAO = new UserDAO();
		User dbUser = userDAO.findByUserId("userId2");
		
		assertNull(dbUser);
	}

}
