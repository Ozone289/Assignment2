open module Application {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires java.sql;
	requires java.net.http;
	requires com.google.gson;
    
    exports Application;
    exports DAO.DataAccessLayer;
}
