module com.example.trianglegraph2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trianglegraph2 to javafx.fxml;
    exports com.example.trianglegraph2;
}