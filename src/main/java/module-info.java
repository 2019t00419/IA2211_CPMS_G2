module com.example.ia2211_cpms_g2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ia2211_cpms_g2 to javafx.fxml;
    exports com.example.ia2211_cpms_g2;
}