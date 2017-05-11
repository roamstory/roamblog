package net.helloworld.posts;

import net.helloworld.db.JdbcTemplate;
import net.helloworld.db.RowMapper;

public class PostDAO {
	public Post readPost(int index) {

		RowMapper<Post> rm = rs ->
				new Post(
						rs.getInt("index"), 
						rs.getString("title"), 
						rs.getString("posts"),
						rs.getString("regdate"),
						rs.getString("regwriter"),
						rs.getString("strapline"));

			

		JdbcTemplate template = new JdbcTemplate();
		String sql = "select * from roamstory_dev.posts where posts.index = ?";

		return template.executeQuery(sql, rm, index);

	}
	
	
}
