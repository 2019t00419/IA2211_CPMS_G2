package com.example.ia2211_cpms_g2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;

public class test {
    faculty Faculty =new faculty();
    CarPark FacultyCarPark = new CarPark();

    @FXML
    private Label welcomeText1;

    @FXML
    private MenuButton facSelect;

    @FXML
    void onSelectScience(ActionEvent event) {
        Faculty.name="science";
        FacultyCarPark.noSpots=2;
        facSelect.setText(Faculty.name);
        welcomeText1.setText(String.valueOf(FacultyCarPark.noSpots));
    }

    @FXML
    void onSelectTech(ActionEvent event) {
        Faculty.name="Technology";
        FacultyCarPark.noSpots=20;
        facSelect.setText(Faculty.name);
        welcomeText1.setText(String.valueOf(FacultyCarPark.noSpots));

    }
    @FXML
    void onSelectLaw(ActionEvent event) {
        Faculty.name="Law";
        FacultyCarPark.noSpots=30;
        facSelect.setText(Faculty.name);
        welcomeText1.setText(String.valueOf(FacultyCarPark.noSpots));

    }


}
