package DAO.DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

public class DataSource {
    private static Connection connection = null;
    private static final String PROPS_URL = "src/main/resources/DAO/database.properties";

    /**
     * Constructs a new DataSource object.
     */
    public DataSource() {
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
            	Properties props = new Properties();
            	props.load(new FileInputStream(PROPS_URL));
            	
            	String url = props.getProperty("db.url");
            	String user = props.getProperty("db.username");
            	String pass = props.getProperty("db.password");
            	
                connection = DriverManager.getConnection(url, user, pass);
            }
        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}