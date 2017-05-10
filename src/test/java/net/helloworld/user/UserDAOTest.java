package net.helloworld.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserDAOTest {
	private static Logger logger = LoggerFactory.getLogger(UserDAOTest.class);
	
	private UserDAO userDAO;
	
	@Before
	public void setup() {
		userDAO = new UserDAO();
		
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
	
	@Test
	public void findUsers() throws Exception {
		List<User> users = userDAO.findUsers();
		assertTrue(users.size() > 0);
		logger.debug("Users : {}", users);
	}
}
