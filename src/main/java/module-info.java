module com.example.timeserverjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.timeserverjavafx to javafx.fxml;
    exports com.example.timeserverjavafx;
}