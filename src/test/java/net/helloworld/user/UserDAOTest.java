package net.helloworld.user;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

public class UserDAOTest {

	private UserDAO userDAO;
	
	@Before
	public void setup() {
		userDAO = new UserDAO();
		
	}

	@Test
	public void conncetion() {
		Connection con = userDAO.getConnection();
		assertNotNull(con);
	}
	
	@Test
	public void crud() throws Exception {
		User user = UserTest.TEST_USER;
		userDAO.removeUser(user.getUserId());
		userDAO.addUser(user);
		
		User dbuser = userDAO.findByUserId(user.getUserId());
		assertEquals(user, dbuser);
		
		User updateUser = new User(user.getUserId(),"dddd2","허재회님", "kokoru58@gmail.com");
		userDAO.updateUser(updateUser);
		dbuser = userDAO.findByUserId(updateUser.getUserId());
		assertEquals(updateUser,dbuser);
	}

	@Test
	public void findNoneUser() throws Exception {
		User user = UserTest.TEST_USER;
		userDAO.removeUser(user.getUserId());
		User dbuser = userDAO.findByUserId(user.getUserId());
		assertNull(dbuser);
	}
}
