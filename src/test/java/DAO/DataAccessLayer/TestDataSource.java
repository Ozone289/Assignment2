package DAO.DataAccessLayer;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class TestDataSource {

	@Test
	void testConnection() {
		Connection con = new DataSource().createConnection();
		assertNotNull(con, "Connection is null");
	}

}
