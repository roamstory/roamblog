package net.helloworld.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import net.helloworld.support.JdbcTemplate;
import net.helloworld.support.RowMapper;

public class UserDAO {
	public void addUser(User user) throws SQLException {

		JdbcTemplate template = new JdbcTemplate();
		String sql = "insert into USERS values(?,?,?,?)";
		template.executeUpdate(sql, user.getUserId(), user.getPassword(), user.getName(), user.getEmail());
	}

	public User findByUserId(String userId) throws SQLException {

		RowMapper<User> rm = new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs) throws SQLException {
				return new User(rs.getString("userId"), rs.getString("password"), rs.getString("name"),
						rs.getString("email"));
			}
		};

		JdbcTemplate template = new JdbcTemplate();
		String sql = "select * from Users where userId = ?";

		return template.executeQuery(sql, rm, userId);

	}

	public void removeUser(String userId) throws SQLException {

		JdbcTemplate template = new JdbcTemplate();

		String sql = "delete from Users where userId = ?";

		template.executeUpdate(sql, userId);
	}

	public void updateUser(User user) throws SQLException {

		JdbcTemplate template = new JdbcTemplate();

		String sql = "update USERS set password= ?, name= ?, email= ? where userId = ?";

		template.executeUpdate(sql, user.getUserId(), user.getPassword(), user.getName(), user.getEmail());

	}

	public List<User> findUsers() throws SQLException {
		RowMapper<User> rm = new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs) throws SQLException {
				return new User(rs.getString("userId"), rs.getString("password"), rs.getString("name"),
						rs.getString("email"));
			}
		};

		JdbcTemplate template = new JdbcTemplate();
		String sql = "select * from Users";

		return template.list(sql, rm);
	}

}
