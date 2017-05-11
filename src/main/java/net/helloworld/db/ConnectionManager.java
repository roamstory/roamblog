package net.helloworld.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	public static Connection getConnection() {

		String url = "jdbc:mysql://localhost:3306/roamstory_dev?useSSL=false&serverTimezone=UTC";
		String id = "root";
		String pw = JdbcPassword.pwdDecrypt();   // 비밀번호 암호화

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
}
