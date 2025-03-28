module Application {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    
    exports Application;
    opens Application to javafx.fxml;
    
	requires java.sql;
    exports DAO.DataAccessLayer;
}
