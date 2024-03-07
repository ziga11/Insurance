 module com.example.zavarovanje {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zavarovanje to javafx.fxml;
    exports com.example.zavarovanje;
}