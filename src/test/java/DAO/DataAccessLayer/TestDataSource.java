package DAO.DataAccessLayer;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import read.AppProperties;

class TestDataSource {

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		AppProperties.read();
	}
	
	@Test
	void testConnection() {
		
		Connection con = DataSource.createConnection();
		assertNotNull(con, "Connection is null");
	}

}
