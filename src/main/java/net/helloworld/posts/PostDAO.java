package net.helloworld.posts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostDAO {

	public Connection getConnection() {

		String url = "jdbc:mysql://localhost:3306/roamstory_dev?useSSL=false&serverTimezone=UTC";
		String id = "root";
		String pw = "0330gogh";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	public Post readPost(int index) throws SQLException {

		String sql = "select * from POSTS where POSTS.index = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = getConnection().prepareStatement(sql);
			pstmt.setInt(1, index);

			rs = pstmt.executeQuery();

			if (!rs.next()) {
				return null;
			}
			return new Post(rs.getInt("index"), rs.getString("title"), rs.getString("posts"));

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}

			if (conn != null) {
				conn.close();
			}
		}

	}
}
