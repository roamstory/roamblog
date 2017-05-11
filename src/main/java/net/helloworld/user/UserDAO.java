package net.helloworld.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import net.helloworld.db.JdbcTemplate;
import net.helloworld.db.RowMapper;

public class UserDAO {
	public void addUser(User user)  {

		JdbcTemplate template = new JdbcTemplate();
		String sql = "insert into roamstory_dev.users values(?,?,?,?)";
		template.executeUpdate(sql, user.getUserId(), user.getPassword(), user.getName(), user.getEmail());
	}

	public User findByUserId(String userId) {

		RowMapper<User> rm = rs ->
				new User(
						rs.getString("userId"), 
						rs.getString("password"), 
						rs.getString("name"),
						rs.getString("email"));

			

		JdbcTemplate template = new JdbcTemplate();
		String sql = "select * from roamstory_dev.users where userId = ?";

		return template.executeQuery(sql, rm, userId);

	}

	public void removeUser(String userId) {

		JdbcTemplate template = new JdbcTemplate();

		String sql = "delete from roamstory_dev.users where userId = ?";

		template.executeUpdate(sql, userId);
	}

	public void updateUser(User user)  {

		JdbcTemplate template = new JdbcTemplate();
		String sql = "update roamstory_dev.users set password= ?, name= ?, email= ? where userId = ?";

		template.executeUpdate(sql, user.getPassword(), user.getName(), user.getEmail(),user.getUserId() );

	}

	public List<User> findUsers() {
		RowMapper<User> rm = rs ->
		new User(
				rs.getString("userId"), 
				rs.getString("password"), 
				rs.getString("name"),
				rs.getString("email"));

		JdbcTemplate template = new JdbcTemplate();
		String sql = "select * from roamstory_dev.users";

		return template.list(sql, rm);
	}

}
