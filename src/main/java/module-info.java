module com.example.demo5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires fontawesomefx;
    requires java.sql;
    requires java.mail;
    requires java.xml.crypto;
    requires javafx.swing;
    requires org.apache.poi.poi;
    requires org.apache.commons.lang3;
    requires org.apache.logging.log4j;
    requires glide;

    opens com.example.demo5 to javafx.fxml;
    exports com.example.demo5;
}