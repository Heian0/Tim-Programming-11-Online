module com.example.dice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dice to javafx.fxml;
    exports com.example.dice;
}