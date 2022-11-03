module com.curso4.unidade4 {
    requires java.sql;
    requires org.hibernate.orm.core;
    requires java.persistence;
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires transitive javafx.graphics;
    
    opens com.curso4.controller to javafx.fxml;
    exports com.curso4.controller;
    exports com.curso4.unidade4;
    exports com.curso4.unidade4.model;
}
