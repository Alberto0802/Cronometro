module com.example.cronometroejemplo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cronometroejemplo to javafx.fxml;
    exports com.example.cronometroejemplo;
}