package com.example.ia2211_cpms_g2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.effect.Light;

public class test {

    @FXML
    private TextField LPlateID;

    @FXML
    private MenuButton facSelect;

    @FXML
    private Label welcomeText1;

    @FXML
    private Label welcomeText2;


    faculty Faculty =new faculty();
    CarPark FacultyCarPark = new CarPark();
    Vehicle newVehicle= new Vehicle();

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
        Faculty.noSpots=2;
        facSelect.setText(Faculty.name);
        welcomeText1.setText(String.valueOf(Faculty.noSpots));

    }
    @FXML
    void onSelectLaw(ActionEvent event) {
        Faculty.name="Law";
        Faculty.noSpots=2;
        facSelect.setText(Faculty.name);
        welcomeText1.setText(String.valueOf(Faculty.noSpots));

    }


    @FXML
    void onClickEnter(ActionEvent event) {
        newVehicle.Lplate=LPlateID.getText();
        FacultyCarPark.Spot[1]="yes";
        FacultyCarPark.Spot[0]="yes";
        int i=0;
        while (i<2) {
            if (FacultyCarPark.Spot[i] == "no") {
                welcomeText1.setText(String.valueOf(i));
                break;
            }
            else {
                welcomeText1.setText("no space");
            }
            i=i+1;
        }
        /*while (i<(Faculty.noSpots)){
        if (FacultyCarPark.Spot[i]=="no"){
            welcomeText1.setText(String.valueOf(i));

        }
       else {welcomeText1.setText("no");}
       i=i+1;}*/

    }


}
