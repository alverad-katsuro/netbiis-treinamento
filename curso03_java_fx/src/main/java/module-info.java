module com.curso3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    
    opens com.curso3 to javafx.fxml;
    exports com.curso3;
}
