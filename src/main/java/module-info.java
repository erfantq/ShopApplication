module com.example.onlineshopproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.onlineshopproject to javafx.fxml;
    exports com.example.onlineshopproject;
}