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

    @FXML
    private Label PSpotDisplay;



    faculty active = new faculty();
    faculty Science = new faculty();
    faculty Law = new faculty();
    faculty Technology= new faculty();
    faculty Engineering= new faculty();
    faculty Medicine= new faculty();
    faculty Nursing= new faculty();
    faculty Sripalee= new faculty();
    faculty UCSC= new faculty();

    Vehicle newVehicle= new Vehicle();
    String PType;


    public void setDisplay() {
        if ((active.Spot[1] == "standard")||(active.Spot[1] == "long vehicle")||(active.Spot[1] == "handicapped")) {
            PS1.setText("Available");
        } else {
            PS1.setText(active.Spot[1]);
        }
        if ((active.Spot[2] == "standard")||(active.Spot[2] == "long vehicle")||(active.Spot[2] == "handicapped")) {
            PS2.setText("Available");
        } else {
            PS2.setText(active.Spot[2]);
        }
        if ((active.Spot[3] == "standard")||(active.Spot[3] == "long vehicle")||(active.Spot[3] == "handicapped")) {
            PS3.setText("Available");
        } else {
            PS3.setText(active.Spot[3]);
        }
        if ((active.Spot[4] == "standard")||(active.Spot[4] == "long vehicle")||(active.Spot[4] == "handicapped")) {
            PS4.setText("Available");
        } else {
            PS4.setText(active.Spot[4]);
        }
        if ((active.Spot[5] == "standard")||(active.Spot[5] == "long vehicle")||(active.Spot[5] == "handicapped")) {
            PS5.setText("Available");
        } else {
            PS5.setText(active.Spot[5]);
        }
        if ((active.Spot[6] == "standard")||(active.Spot[6] == "long vehicle")||(active.Spot[6] == "handicapped")){
            PS6.setText("Available");
        } else {
            PS6.setText(active.Spot[6]);
        }
        if ((active.Spot[7] == "standard")||(active.Spot[7] == "long vehicle")||(active.Spot[7] == "handicapped")) {
            PS7.setText("Available");
        } else {
            PS7.setText(active.Spot[7]);
        }
        if ((active.Spot[8] == "standard")||(active.Spot[8] == "long vehicle")||(active.Spot[8] == "handicapped")) {
            PS8.setText("Available");
        } else {
            PS8.setText(active.Spot[8]);
        }
        if ((active.Spot[9] == "standard")||(active.Spot[9] == "long vehicle")||(active.Spot[9] == "handicapped")) {
            PS9.setText("Available");
        } else {
            PS9.setText(active.Spot[9]);
        }
        if ((active.Spot[10] == "standard")||(active.Spot[10] == "long vehicle")||(active.Spot[10] == "handicapped")){
            PS10.setText("Available");
        } else {
            PS10.setText(active.Spot[10]);
        }
    }


    @FXML
    void onSelectScience(ActionEvent event) {
        Science.name="Science";
        active.noSpots=Science.noSpots=10;
        active.noStandardSpots=Science.noStandardSpots=3;
        active.noLongSpots=Science.noLongSpots=3;
        active.noHandiSpots=Science.noHandiSpots=4;
        if(Science.Spot[0]=="ID"){
            Science.Spot[0]= Science.name;
            for (int j = 1; j < (Science.noStandardSpots + 1); j++) {
                Science.Spot[j] = "standard";
            }
            for (int j = (Science.noStandardSpots + 1); j < (Science.noStandardSpots + Science.noLongSpots + 1); j++) {
                Science.Spot[j] = "long vehicle";
            }
            for (int j = (Science.noStandardSpots + Science.noLongSpots + 1); j < (Science.noSpots + 1); j++) {
                Science.Spot[j] = "handicapped";
            }
        }
        active.Spot=Science.Spot;
        facSelect.setText(Science.name);

    }

    @FXML
    void onSelectTech(ActionEvent event) {
        Technology.name="Technology";
        active.noSpots=Technology.noSpots=10;
        active.noStandardSpots=Technology.noStandardSpots=7;
        active.noLongSpots=Technology.noLongSpots=2;
        active.noHandiSpots=Technology.noHandiSpots=1;
        if(Technology.Spot[0]=="ID")
        {
            Technology.Spot[0]= Technology.name;
            for(int j=1;j<(Technology.noStandardSpots+1);j++)
            {
                Technology.Spot[j]="standard";
            }
            for(int j=(Technology.noStandardSpots+1);j<(Technology.noStandardSpots+ Technology.noLongSpots+1);j++)
            {
                Technology.Spot[j]="long vehicle";
            }
            for(int j= (Technology.noStandardSpots+ Technology.noLongSpots+1);j<(Technology.noSpots+1);j++)
            {
                Technology.Spot[j]="handicapped";
            }
        }
        active.Spot=Technology.Spot;
        facSelect.setText(Technology.name);

    }
    @FXML
    void onSelectLaw(ActionEvent event) {
        Law.name="Law";
        active.noSpots=Law.noSpots=10;
        active.noStandardSpots=Law.noStandardSpots=7;
        active.noLongSpots=Law.noLongSpots=2;
        active.noHandiSpots=Law.noHandiSpots=1;
        Law.Spot[0]= Law.name;
        active.Spot=Law.Spot;
        facSelect.setText(Law.name);
    }
    @FXML
    void onSelectEngineering(ActionEvent event) {
        Engineering.name="Engineering";
        active.noSpots=Engineering.noSpots=10;
        active.noStandardSpots=Engineering.noStandardSpots=7;
        active.noLongSpots=Engineering.noLongSpots=2;
        active.noHandiSpots=Engineering.noHandiSpots=1;
        Engineering.Spot[0]= Engineering.name;
        active.Spot=Engineering.Spot;
        facSelect.setText(Engineering.name);
    }
    @FXML
    void onSelectMedicine(ActionEvent event) {
        Medicine.name="Medicine";
        active.noSpots=Medicine.noSpots=10;
        active.noStandardSpots=Medicine.noStandardSpots=7;
        active.noLongSpots=Medicine.noLongSpots=2;
        active.noHandiSpots=Medicine.noHandiSpots=1;
        Medicine.Spot[0]= Medicine.name;
        active.Spot=Medicine.Spot;
        facSelect.setText(Medicine.name);
    }

    @FXML
    void onSelectUCSC(ActionEvent event) {
        UCSC.name="UCSC";
        active.noSpots=UCSC.noSpots=10;
        active.noStandardSpots=UCSC.noStandardSpots=7;
        active.noLongSpots=UCSC.noLongSpots=2;
        active.noHandiSpots=UCSC.noHandiSpots=1;
        UCSC.Spot[0]= UCSC.name;
        active.Spot=UCSC.Spot;
        facSelect.setText(UCSC.name);
    }
    @FXML
    void onSelectNursing(ActionEvent event) {
        Nursing.name="Nursing";
        active.noSpots=Nursing.noSpots=10;
        active.noStandardSpots=Nursing.noStandardSpots=7;
        active.noLongSpots=Nursing.noLongSpots=2;
        active.noHandiSpots=Nursing.noHandiSpots=1;
        Nursing.Spot[0]= Nursing.name;
        active.Spot=Nursing.Spot;
        facSelect.setText(Nursing.name);
    }
    @FXML
    void onSelectSripalee(ActionEvent event) {
        Sripalee.name="Sripalee Campus";
        active.noSpots=Sripalee.noSpots=10;
        active.noStandardSpots=Sripalee.noStandardSpots=7;
        active.noLongSpots=Sripalee.noLongSpots=2;
        active.noHandiSpots=Sripalee.noHandiSpots=1;
        Sripalee.Spot[0]= Sripalee.name;
        active.Spot=Sripalee.Spot;
        facSelect.setText(Sripalee.name);
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
                    if(PType=="standard"){
                        PSpotDisplay.setText("S"+(String.valueOf(i)));
                    }
                    if(PType=="long vehicle"){
                        PSpotDisplay.setText("L"+(String.valueOf(i- active.noStandardSpots)));
                    }
                    if(PType=="handicapped"){
                        PSpotDisplay.setText("H"+(String.valueOf(i- active.noStandardSpots- active.noLongSpots)));
                    }
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
                    PSpotDisplay.setText("no space");
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
