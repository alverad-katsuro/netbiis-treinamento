module com.curso3 {
    requires java.sql;
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    
    opens com.curso3 to javafx.fxml;
    exports com.backend;
    exports com.curso3;
}
