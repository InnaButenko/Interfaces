module org.example.interfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.interfaces to javafx.fxml;
    exports org.example.interfaces;
}