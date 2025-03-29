package read;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {
	
	private static boolean read = false;
	private static String db_url;
	private static String db_user;
	private static String db_pass;
	private static String api_key;
	
	private static final String PROPS_URL = "src/main/resources/App.properties";

	private AppProperties() {}
	
	public static void read() {	
		
    	try {
    		if(read == false) {
    			Properties props = new Properties();
    			props.load(new FileInputStream(PROPS_URL));
    			
    			db_url = props.getProperty("db.url");
    			db_user = props.getProperty("db.username");
    			db_pass = props.getProperty("db.password");
    			api_key = props.getProperty("api.key");
    			read = true;
    		}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getDBUrl() { return db_url; }
	public static String getDBUser() { return db_user; }
	public static String getDBPass() { return db_pass; }
	public static String getApiKey() { return api_key; }
	
}
