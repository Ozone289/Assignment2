package DAO.DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import read.AppProperties;

import java.io.FileInputStream;
import java.io.IOException;

public class DataSource {
    private static Connection connection = null;
    

    /**
     * Constructs a new DataSource object.
     */
    private DataSource() {
    }

    /**
     * Creates a new database connection.
     * Only use one connection for this viewlayer, prevent memory leaks.
     *
     * @return the Connection object representing the database connection
     */
    public static Connection createConnection() {
        try {
            if (connection != null) {
                System.out.println("Cannot create new connection, one exists already");
            } else {
            	String url = AppProperties.getDBUrl();
            	String user = AppProperties.getDBUser();
            	String pass = AppProperties.getDBPass();
            	
                connection = DriverManager.getConnection(url, user, pass);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}