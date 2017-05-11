package net.helloworld.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetter {
	void setParameter(PreparedStatement pstmt) throws SQLException;
}
