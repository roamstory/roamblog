package net.helloworld.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.helloworld.exception.DataAccessException;

public class JdbcTemplate {

	public <T> T executeQuery(String sql, RowMapper<T> rm, Object... parameters) {
		return executeQuery(sql, rm, createPreparedStatementSetter(parameters));

	}

	public <T> T executeQuery(String sql, RowMapper<T> rm, PreparedStatementSetter pss) {
		List<T> list = list(sql, rm, pss);
		if (list.isEmpty()) {
			return null;
		}

		return list.get(0);
	}

	public <T> List<T> list(String sql, RowMapper<T> rm, Object... parameters) {
		return list(sql, rm, createPreparedStatementSetter(parameters));

	}

	public <T> List<T> list(String sql, RowMapper<T> rm, PreparedStatementSetter pss) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pss.setParameter(pstmt);

			rs = pstmt.executeQuery();

			List<T> list = new ArrayList<T>();

			if (rs.next()) {
				list.add(rm.mapRow(rs));
			}

			return list;

		} catch (SQLException e) {
			throw new DataAccessException(e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new DataAccessException(e);
			}

		}

	}

	public void executeUpdate(String sql, Object... parameters) {
		executeUpdate(sql, createPreparedStatementSetter(parameters));

	}

	public void executeUpdate(String sql, PreparedStatementSetter pss) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnectionManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pss.setParameter(pstmt);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new DataAccessException(e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new DataAccessException(e);
			}
		}

	}

	private PreparedStatementSetter createPreparedStatementSetter(Object... parameters) {
		return new PreparedStatementSetter() {
			@Override
			public void setParameter(PreparedStatement pstmt) {
				for (int i = 0; i < parameters.length; i++) {
					try {
						pstmt.setObject(i + 1, parameters[i]);
					} catch (SQLException e) {
						throw new DataAccessException(e);
					}
				}
			}
		};
	}

}
