package net.helloworld.user;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import net.helloworld.support.ConnectionManager;

public class connectionManagerTest {

	@Test
	public void conncetion() {
		Connection con = ConnectionManager.getConnection();
		assertNotNull(con);
	}
}
