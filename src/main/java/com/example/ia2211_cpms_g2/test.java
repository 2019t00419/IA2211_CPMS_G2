package com.example.ia2211_cpms_g2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class test {

    faculty Faculty =new faculty();
    CarPark FacultyCarPark = new CarPark();
    Vehicle newVehicle= new Vehicle();
    @FXML
    private Label welcomeText1;

    @FXML
    private MenuButton facSelect;

    @FXML
    void onSelectScience(ActionEvent event) {
        Faculty.name="science";
        Faculty.noSpots=2;
        facSelect.setText(Faculty.name);
        welcomeText1.setText(String.valueOf(Faculty.noSpots));
    }

    @FXML
    void onSelectTech(ActionEvent event) {
        Faculty.name="Technology";
        Faculty.noSpots=20;
        facSelect.setText(Faculty.name);
        welcomeText1.setText(String.valueOf(Faculty.noSpots));

    }
    @FXML
    void onSelectLaw(ActionEvent event) {
        Faculty.name="Law";
        Faculty.noSpots=30;
        facSelect.setText(Faculty.name);
        welcomeText1.setText(String.valueOf(Faculty.noSpots));

    }


    @FXML
    void onClickEnter(ActionEvent event) {
      //  newVehicle.Lplate= LPlateID.getText();
        welcomeText1.setText(newVehicle.Lplate);

    }


}
