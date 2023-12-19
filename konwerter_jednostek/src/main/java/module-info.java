module com.example.konwerter_jednostek {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.konwerter_jednostek to javafx.fxml;
    exports com.example.konwerter_jednostek;
}