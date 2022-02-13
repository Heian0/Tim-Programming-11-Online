module com.example.friends {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.friends to javafx.fxml;
    exports com.example.friends;
}