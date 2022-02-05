package com.example.ia2211_cpms_g2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class test {

    @FXML
    private MenuItem LPlate1;

    @FXML
    private MenuItem LPlate10;

    @FXML
    private MenuItem LPlate2;

    @FXML
    private MenuItem LPlate3;

    @FXML
    private MenuItem LPlate4;

    @FXML
    private MenuItem LPlate5;

    @FXML
    private MenuItem LPlate6;

    @FXML
    private MenuItem LPlate7;

    @FXML
    private MenuItem LPlate8;

    @FXML
    private MenuItem LPlate9;

    @FXML
    private TextField LPlateID;

    @FXML
    private Label LPlateIDisplay;

    @FXML
    private MenuButton LPlateSelect;

    @FXML
    private MenuButton TypeSelect;

    @FXML
    private MenuButton facSelect;

    @FXML
    private Label welcomeText1;

    @FXML
    private Label welcomeText2;

    @FXML
    private Label PS1;

    @FXML
    private Label PS10;

    @FXML
    private Label PS2;

    @FXML
    private Label PS3;

    @FXML
    private Label PS4;

    @FXML
    private Label PS5;

    @FXML
    private Label PS6;

    @FXML
    private Label PS7;

    @FXML
    private Label PS8;

    @FXML
    private Label PS9;


    faculty active = new faculty();
    faculty Science = new faculty();
    faculty Law = new faculty();
    faculty Technology= new faculty();
    Vehicle newVehicle= new Vehicle();
    String PType;


    public void setDisplay() {
        if (active.Spot[1] == "standard") {
            PS1.setText("Available");
        } else {
            PS1.setText(active.Spot[1]);
        }
        if (active.Spot[2] == "standard") {
            PS2.setText("Available");
        } else {
            PS2.setText(active.Spot[2]);
        }
        if (active.Spot[3] == "standard") {
            PS3.setText("Available");
        } else {
            PS3.setText(active.Spot[3]);
        }
        if (active.Spot[4] == "standard") {
            PS4.setText("Available");
        } else {
            PS4.setText(active.Spot[4]);
        }
        if (active.Spot[5] == "standard") {
            PS5.setText("Available");
        } else {
            PS5.setText(active.Spot[5]);
        }
        if (active.Spot[6] == "standard") {
            PS6.setText("Available");
        } else {
            PS6.setText(active.Spot[6]);
        }
        if (active.Spot[7] == "standard") {
            PS7.setText("Available");
        } else {
            PS7.setText(active.Spot[7]);
        }
        if (active.Spot[8] == "long vehicle") {
            PS8.setText("Available");
        } else {
            PS8.setText(active.Spot[8]);
        }
        if (active.Spot[9] == "long vehicle") {
            PS9.setText("Available");
        } else {
            PS9.setText(active.Spot[9]);
        }
        if (active.Spot[10] == "handicapped") {
            PS10.setText("Available");
        } else {
            PS10.setText(active.Spot[10]);
        }
    }

    @FXML
    void onSelectScience(ActionEvent event) {
        Science.name="Science";
        active.noSpots=Science.noSpots=10;
        Science.Spot[0]= Science.name;
        active.Spot=Science.Spot;
        facSelect.setText(Science.name);

    }

    @FXML
    void onSelectTech(ActionEvent event) {
        Technology.name="Technology";
        active.noSpots=Technology.noSpots=10;
        Technology.Spot[0]= Technology.name;
        active.Spot=Technology.Spot;
        facSelect.setText(Technology.name);
    }
    @FXML
    void onSelectLaw(ActionEvent event) {
        Law.name="Law";
        active.noSpots=Law.noSpots=10;
        Law.Spot[0]= Law.name;
        active.Spot=Law.Spot;
        facSelect.setText(Law.name);
    }


    @FXML
    void onClickEnter(ActionEvent event)
    {
        newVehicle.Lplate=LPlateID.getText();
        if (newVehicle.Lplate!="")
        {
            int i = 1;
            while (i < (active.noSpots+1) ){
                if (active.Spot[i] ==PType) {
                    welcomeText1.setText(String.valueOf(i));
                    active.Spot[i] = newVehicle.Lplate;
                    LPlate1.setText(active.Spot[1]);
                    LPlate2.setText(active.Spot[2]);
                    LPlate3.setText(active.Spot[3]);
                    LPlate4.setText(active.Spot[4]);
                    LPlate5.setText(active.Spot[5]);
                    LPlate6.setText(active.Spot[6]);
                    LPlate7.setText(active.Spot[7]);
                    LPlate8.setText(active.Spot[8]);
                    LPlate9.setText(active.Spot[9]);
                    LPlate10.setText(active.Spot[10]);
                    break;
                }
                else {
                    welcomeText1.setText("no space");
                }
                i = i + 1;
            }
        }
        welcomeText2.setText(active.Spot[0]+" "+active.Spot[1]+" "+active.Spot[2]+" "+active.Spot[3]+" "+active.Spot[4]+" "+active.Spot[5]+" "+active.Spot[6]+" "+active.Spot[7]+" "+active.Spot[8]+" "+active.Spot[9]+" "+active.Spot[10]);
        LPlateID.setText("");
        setDisplay();
    }

    @FXML
    void onSelectStandard(ActionEvent event) {
        PType="standard";
        TypeSelect.setText("Standard");
    }
    @FXML
    void onSelectLong(ActionEvent event) {
        PType="long vehicle";
        TypeSelect.setText("Long Vehicle");
    }
    @FXML
    void onSelectHandi(ActionEvent event) {
        PType="handicapped";
        TypeSelect.setText("Handicapped");
    }
    @FXML
    void onSelectV1(ActionEvent event) {

    }

    @FXML
    void onSelectV10(ActionEvent event) {

    }

    @FXML
    void onSelectV2(ActionEvent event) {

    }

    @FXML
    void onSelectV3(ActionEvent event) {

    }

    @FXML
    void onSelectV4(ActionEvent event) {

    }

    @FXML
    void onSelectV5(ActionEvent event) {

    }

    @FXML
    void onSelectV6(ActionEvent event) {

    }

    @FXML
    void onSelectV7(ActionEvent event) {

    }

    @FXML
    void onSelectV8(ActionEvent event) {

    }

    @FXML
    void onSelectV9(ActionEvent event) {

    }

}
