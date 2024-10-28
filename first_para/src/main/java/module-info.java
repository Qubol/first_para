module com.example.first_para {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.first_para to javafx.fxml;
    exports com.example.first_para;
}