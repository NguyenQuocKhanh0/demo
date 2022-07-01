module sample.dmm {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.dmm to javafx.fxml;
    exports sample.dmm;
}