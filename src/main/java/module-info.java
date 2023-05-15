module com.example.javafxdemo.tp1_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxdemo.tp1_javafx to javafx.fxml;
    exports com.example.javafxdemo.tp1_javafx;
    exports com.example.td1;
    exports com.example.td2;
    opens com.example.td3 to javafx.fxml;
    exports com.example.td3;
    exports com.example.td2.exercice6;
    exports com.example.td2.exercice5;
    exports com.example.td2.exercice4;
}