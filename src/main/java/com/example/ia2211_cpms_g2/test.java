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
    private MenuButton LPlateSelect;

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
    private Label PSID1;

    @FXML
    private Label PSID10;

    @FXML
    private Label PSID2;

    @FXML
    private Label PSID3;

    @FXML
    private Label PSID4;

    @FXML
    private Label PSID5;

    @FXML
    private Label PSID6;

    @FXML
    private Label PSID7;

    @FXML
    private Label PSID8;

    @FXML
    private Label PSID9;

    @FXML
    private Label PSpotDisplay;

    @FXML
    private Label PSpotDisplay1;

    @FXML
    private Label TypeDisplay;

    @FXML
    private MenuButton TypeSelect;

    @FXML
    private Label displayType1;

    @FXML
    private Label displayType10;

    @FXML
    private Label displayType2;

    @FXML
    private Label displayType3;

    @FXML
    private Label displayType4;

    @FXML
    private Label displayType5;

    @FXML
    private Label displayType6;

    @FXML
    private Label displayType7;

    @FXML
    private Label displayType8;

    @FXML
    private Label displayType9;

    @FXML
    private MenuButton parkSelect;

    @FXML
    private MenuButton facultySelect1;

    @FXML
    private Label welcomeText1;

    @FXML
    private Label welcomeText2;

    @FXML
    private MenuItem parkA;

    @FXML
    private MenuItem parkB;

    @FXML
    private MenuItem parkC;

    ParkingArea active = new ParkingArea();
    ParkingArea Science_A = new ParkingArea();
    ParkingArea Science_B = new ParkingArea();
    ParkingArea Science_C = new ParkingArea();
    ParkingArea Law_A = new ParkingArea();
    ParkingArea Law_B = new ParkingArea();
    ParkingArea Technology_A = new ParkingArea();
    ParkingArea Engineering_A = new ParkingArea();
    ParkingArea Medicine_A = new ParkingArea();
    ParkingArea Medicine_B = new ParkingArea();
    ParkingArea Nursing_A = new ParkingArea();
    ParkingArea Sripalee_A = new ParkingArea();
    ParkingArea Sripalee_B = new ParkingArea();
    ParkingArea Sripalee_C = new ParkingArea();
    ParkingArea UCSC_A = new ParkingArea();

    Vehicle newVehicle= new Vehicle();
    String PType,selectedFac;
    int checkOut;
    String facultySelect,parkAreaSelect;

    public void setLPlate()
    {
        if (active.Spot[1].equals("standard") || active.Spot[1].equals("long vehicle") || active.Spot[1].equals("handicapped"))
        {
            LPlate1.setText("---------");
        }
        else{
            LPlate1.setText(active.Spot[1]);
        }
        if (active.Spot[2].equals("standard") || active.Spot[2].equals("long vehicle") || active.Spot[2].equals("handicapped"))
        {
            LPlate2.setText("---------");
        }
        else{
            LPlate2.setText(active.Spot[2]);
        }
        if (active.Spot[3].equals("standard") || active.Spot[3].equals("long vehicle") || active.Spot[3].equals("handicapped"))
        {
            LPlate3.setText("---------");
        }
        else{
            LPlate4.setText(active.Spot[3]);
        }
        if (active.Spot[4].equals("standard") || active.Spot[4].equals("long vehicle") || active.Spot[4].equals("handicapped"))
        {
            LPlate4.setText("---------");
        }
        else{
            LPlate4.setText(active.Spot[4]);
        }
        if (active.Spot[5].equals("standard") || active.Spot[5].equals("long vehicle") || active.Spot[5].equals("handicapped"))
        {
            LPlate5.setText("---------");
        }
        else{
            LPlate5.setText(active.Spot[5]);
        }
        if (active.Spot[6].equals("standard") || active.Spot[6].equals("long vehicle") || active.Spot[6].equals("handicapped"))
        {
            LPlate6.setText("---------");
        }
        else{
            LPlate6.setText(active.Spot[6]);
        }
        if (active.Spot[7].equals("standard") || active.Spot[7].equals("long vehicle") || active.Spot[7].equals("handicapped"))
        {
            LPlate7.setText("---------");
        }
        else{
            LPlate7.setText(active.Spot[7]);
        }
        if (active.Spot[8].equals("standard") || active.Spot[8].equals("long vehicle") || active.Spot[8].equals("handicapped"))
        {
            LPlate8.setText("---------");
        }
        else{
            LPlate8.setText(active.Spot[8]);
        }
        if (active.Spot[9].equals("standard") || active.Spot[9].equals("long vehicle") || active.Spot[9].equals("handicapped"))
        {
            LPlate9.setText("---------");
        }
        else{
            LPlate9.setText(active.Spot[9]);
        }
        if (active.Spot[10].equals("standard") || active.Spot[10].equals("long vehicle") || active.Spot[10].equals("handicapped"))
        {
            LPlate10.setText("---------");
        }
        else{
            LPlate10.setText(active.Spot[10]);
        }
    }

    public void setDisplay() {
        if ((active.Spot[1].equals("standard"))||(active.Spot[1].equals("long vehicle"))||(active.Spot[1].equals("handicapped"))) {
            PS1.setText("Available");
        } else {
            PS1.setText(active.Spot[1]);
        }
        if ((active.Spot[2].equals("standard"))||(active.Spot[2].equals("long vehicle"))||(active.Spot[2].equals("handicapped"))) {
            PS2.setText("Available");
        } else {
            PS2.setText(active.Spot[2]);
        }
        if ((active.Spot[3].equals("standard"))||(active.Spot[3].equals("long vehicle"))||(active.Spot[3].equals("handicapped"))) {
            PS3.setText("Available");
        } else {
            PS3.setText(active.Spot[3]);
        }
        if ((active.Spot[4].equals("standard"))||(active.Spot[4].equals("long vehicle"))||(active.Spot[4].equals("handicapped"))) {
            PS4.setText("Available");
        } else {
            PS4.setText(active.Spot[4]);
        }
        if ((active.Spot[5].equals("standard"))||(active.Spot[5].equals("long vehicle"))||(active.Spot[5].equals("handicapped"))) {
            PS5.setText("Available");
        } else {
            PS5.setText(active.Spot[5]);
        }
        if ((active.Spot[6].equals("standard"))||(active.Spot[6].equals("long vehicle"))||(active.Spot[6].equals("handicapped"))){
            PS6.setText("Available");
        } else {
            PS6.setText(active.Spot[6]);
        }
        if ((active.Spot[7].equals("standard"))||(active.Spot[7].equals("long vehicle"))||(active.Spot[7].equals("handicapped"))) {
            PS7.setText("Available");
        } else {
            PS7.setText(active.Spot[7]);
        }
        if ((active.Spot[8].equals("standard"))||(active.Spot[8].equals("long vehicle"))||(active.Spot[8].equals("handicapped"))) {
            PS8.setText("Available");
        } else {
            PS8.setText(active.Spot[8]);
        }
        if ((active.Spot[9].equals("standard"))||(active.Spot[9].equals("long vehicle"))||(active.Spot[9].equals("handicapped"))) {
            PS9.setText("Available");
        } else {
            PS9.setText(active.Spot[9]);
        }
        if ((active.Spot[10].equals("standard"))||(active.Spot[10].equals("long vehicle"))||(active.Spot[10].equals("handicapped"))){
            PS10.setText("Available");
        } else {
            PS10.setText(active.Spot[10]);
        }
        for(int i=1;i<active.noStandardSpots+1;i++) {
            if (i==1){
                PSID1.setText("S1");
                displayType1.setText("standard");
            }
            if (i==2) {
                PSID2.setText("S2");
                displayType2.setText("standard");
            }
            if (i==3){
                    PSID3.setText("S3");
                    displayType3.setText("standard");
            }
            if (i==4) {
                PSID4.setText("S4");
                displayType4.setText("standard");
            }
            if (i==5) {
                PSID5.setText("S5");
                displayType5.setText("standard");
            }
            if (i==6) {
                PSID6.setText("S6");
                displayType6.setText("standard");
            }
            if (i==7) {
                PSID7.setText("S7");
                displayType7.setText("standard");
            }
            if (i==8) {
                PSID8.setText("S8");
                displayType8.setText("standard");
            }
            if (i==9) {
                PSID9.setText("S9");
                displayType9.setText("standard");
            }
            if (i==10){
                    PSID10.setText("S10");
                    displayType10.setText("standard");
            }

        }
        for(int i=(active.noStandardSpots+1);i<active.noStandardSpots+1+active.noLongSpots;i++) {
            if (i==1){
                PSID1.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType1.setText("long vehicle");
            }
            if (i==2) {
                PSID2.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType2.setText("long vehicle");
            }
            if (i==3){
                PSID3.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType3.setText("long vehicle");
            }
            if (i==4) {
                PSID4.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType4.setText("long vehicle");
            }
            if (i==5) {
                PSID5.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType5.setText("long vehicle");
            }
            if (i==6) {
                PSID6.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType6.setText("long vehicle");
            }
            if (i==7) {
                PSID7.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType7.setText("long vehicle");
            }
            if (i==8) {
                PSID8.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType8.setText("long vehicle");
            }
            if (i==9) {
                PSID9.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType9.setText("long vehicle");
            }
            if (i==10){
                PSID10.setText("L"+(String.valueOf(i-active.noStandardSpots)));
                displayType10.setText("long vehicle");
            }

        }
        for(int i=(active.noStandardSpots+1+active.noLongSpots);i<active.noSpots+1;i++) {
            if (i==1){
                PSID1.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType1.setText("handicapped");
            }
            if (i==2) {
                PSID2.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType2.setText("handicapped");
            }
            if (i==3){
                PSID3.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType3.setText("handicapped");
            }
            if (i==4) {
                PSID4.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType4.setText("handicapped");
            }
            if (i==5) {
                PSID5.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType5.setText("handicapped");
            }
            if (i==6) {
                PSID6.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType6.setText("handicapped");
            }
            if (i==7) {
                PSID7.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType7.setText("handicapped");
            }
            if (i==8) {
                PSID8.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType8.setText("handicapped");
            }
            if (i==9) {
                PSID9.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType9.setText("handicapped");
            }
            if (i==10){
                PSID10.setText("H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType10.setText("handicapped");
            }

        }

    }


    @FXML
    void onClickOK(ActionEvent event) {
        Science_A.noSpots = 10;
        Science_A.noStandardSpots = 3;
        Science_A.noLongSpots = 3;
        Science_A.noHandiSpots = 4;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Science_B.noSpots = 10;
        Science_B.noStandardSpots = 4;
        Science_B.noLongSpots = 2;
        Science_B.noHandiSpots = 4;
        Science_B.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_B.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_B.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_B.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_B.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_B.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_B.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_B.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_B.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_B.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Science_C.noSpots = 10;
        Science_C.noStandardSpots = 5;
        Science_C.noLongSpots = 4;
        Science_C.noHandiSpots = 1;
        Science_C.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_C.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_C.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_C.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_C.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_C.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_C.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_C.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_C.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_C.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Technology_A.noSpots = 10;
        Technology_A.noStandardSpots = 7;
        Technology_A.noLongSpots = 2;
        Technology_A.noHandiSpots = 1;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Law_A.noSpots = 10;
        Law_A.noStandardSpots = 7;
        Law_A.noLongSpots = 0;
        Law_A.noHandiSpots = 3;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Law_B.noSpots = 10;
        Law_B.noStandardSpots = 7;
        Law_B.noLongSpots = 2;
        Law_B.noHandiSpots = 1;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Engineering_A.noSpots = 10;
        Engineering_A.noStandardSpots = 6;
        Engineering_A.noLongSpots = 1;
        Engineering_A.noHandiSpots = 3;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Medicine_A.noSpots = 10;
        Medicine_A.noStandardSpots = 5;
        Medicine_A.noLongSpots = 1;
        Medicine_A.noHandiSpots = 4;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Medicine_B.noSpots = 10;
        Medicine_B.noStandardSpots = 7;
        Medicine_B.noLongSpots = 1;
        Medicine_B.noHandiSpots = 2;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        UCSC_A.noSpots = 10;
        UCSC_A.noStandardSpots = 3;
        UCSC_A.noLongSpots = 3;
        UCSC_A.noHandiSpots = 4;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Nursing_A.noSpots = 10;
        Nursing_A.noStandardSpots = 5;
        Nursing_A.noLongSpots = 3;
        Nursing_A.noHandiSpots = 2;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Sripalee_A.noSpots = 10;
        Sripalee_A.noStandardSpots = 9;
        Sripalee_A.noLongSpots = 3;
        Sripalee_A.noHandiSpots = 0;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Sripalee_B.noSpots = 10;
        Sripalee_B.noStandardSpots = 7;
        Sripalee_B.noLongSpots = 0;
        Sripalee_B.noHandiSpots = 3;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        Sripalee_C.noSpots = 10;
        Sripalee_C.noStandardSpots = 7;
        Sripalee_C.noLongSpots = 1;
        Sripalee_C.noHandiSpots = 2;
        Science_A.Spotdimensions[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.Spotdimensions[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.Spotdimensions[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.Spotdimensions[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.Spotdimensions[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.Spotdimensions[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.Spotdimensions[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.Spotdimensions[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.Spotdimensions[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.Spotdimensions[10]="6°54'06.9\"N 79°51'37.9\"E";

        if (facultySelect == "Science" && parkAreaSelect == "A") {
            Science_A.name = "Science_A";
            active.noSpots = Science_A.noSpots;
            active.noStandardSpots = Science_A.noStandardSpots;
            active.noLongSpots = Science_A.noLongSpots;
            active.noHandiSpots = Science_A.noHandiSpots;
            if (Science_A.Spot[0].equals("ID")) {
                Science_A.Spot[0] = Science_A.name;
                for (int j = 1; j < (Science_A.noStandardSpots + 1); j++) {
                    Science_A.Spot[j] = "standard";
                }
                for (int j = (Science_A.noStandardSpots + 1); j < (Science_A.noStandardSpots + Science_A.noLongSpots + 1); j++) {
                    Science_A.Spot[j] = "long vehicle";
                }
                for (int j = (Science_A.noStandardSpots + Science_A.noLongSpots + 1); j < (Science_A.noSpots + 1); j++) {
                    Science_A.Spot[j] = "handicapped";
                }
            }
            active.Spot = Science_A.Spot;
            selectedFac = active.name;
            setLPlate();
            setDisplay();
        }
        else if (facultySelect == "Science" && parkAreaSelect == "B") {
            Science_B.name = "Science_B";
            active.noSpots = Science_B.noSpots;
            active.noStandardSpots = Science_B.noStandardSpots;
            active.noLongSpots = Science_B.noLongSpots;
            active.noHandiSpots = Science_B.noHandiSpots;
            if (Science_B.Spot[0].equals("ID")) {
                Science_B.Spot[0] = Science_B.name;
                for (int j = 1; j < (Science_B.noStandardSpots + 1); j++) {
                    Science_B.Spot[j] = "standard";
                }
                for (int j = (Science_B.noStandardSpots + 1); j < (Science_B.noStandardSpots + Science_B.noLongSpots + 1); j++) {
                    Science_B.Spot[j] = "long vehicle";
                }
                for (int j = (Science_B.noStandardSpots + Science_B.noLongSpots + 1); j < (Science_B.noSpots + 1); j++) {
                    Science_B.Spot[j] = "handicapped";
                }
            }
            active.Spot = Science_B.Spot;
            selectedFac = active.name;
            setLPlate();
            setDisplay();
        }
        else if (facultySelect == "Science" && parkAreaSelect == "C") {
            Science_C.name = "Science_C";
            active.noSpots = Science_C.noSpots;
            active.noStandardSpots = Science_C.noStandardSpots;
            active.noLongSpots = Science_C.noLongSpots;
            active.noHandiSpots = Science_C.noHandiSpots;
            if (Science_C.Spot[0].equals("ID")) {
                Science_C.Spot[0] = Science_C.name;
                for (int j = 1; j < (Science_C.noStandardSpots + 1); j++) {
                    Science_C.Spot[j] = "standard";
                }
                for (int j = (Science_C.noStandardSpots + 1); j < (Science_C.noStandardSpots + Science_C.noLongSpots + 1); j++) {
                    Science_C.Spot[j] = "long vehicle";
                }
                for (int j = (Science_C.noStandardSpots + Science_C.noLongSpots + 1); j < (Science_C.noSpots + 1); j++) {
                    Science_C.Spot[j] = "handicapped";
                }
            }
            active.Spot = Science_C.Spot;
            selectedFac = active.name;
            setLPlate();
            setDisplay();
        }
        else if (facultySelect == "Technology" && parkAreaSelect == "A") {
            Technology_A.name = "Technology_A";
            active.noSpots = Technology_A.noSpots;
            active.noStandardSpots = Technology_A.noStandardSpots;
            active.noLongSpots = Technology_A.noLongSpots;
            active.noHandiSpots = Technology_A.noHandiSpots;
            if (Technology_A.Spot[0].equals("ID")) {
                Technology_A.Spot[0] = Technology_A.name;
                for (int j = 1; j < (Technology_A.noStandardSpots + 1); j++) {
                    Technology_A.Spot[j] = "standard";
                }
                for (int j = (Technology_A.noStandardSpots + 1); j < (Technology_A.noStandardSpots + Technology_A.noLongSpots + 1); j++) {
                    Technology_A.Spot[j] = "long vehicle";
                }
                for (int j = (Technology_A.noStandardSpots + Technology_A.noLongSpots + 1); j < (Technology_A.noSpots + 1); j++) {
                    Technology_A.Spot[j] = "handicapped";
                }
            }
            active.Spot = Technology_A.Spot;
            selectedFac = active.name;
            setLPlate();
            setDisplay();
        }

        else if(facultySelect == "Law" && parkAreaSelect == "A") {
            Law_A.name="Law_A";
            active.noSpots= Law_A.noSpots;
            active.noStandardSpots= Law_A.noStandardSpots;
            active.noLongSpots= Law_A.noLongSpots;
            active.noHandiSpots= Law_A.noHandiSpots;
            if(Law_A.Spot[0].equals("ID")){
                Law_A.Spot[0]= Law_A.name;
                for (int j = 1; j < (Law_A.noStandardSpots + 1); j++) {
                    Law_A.Spot[j] = "standard";
                }
                for (int j = (Law_A.noStandardSpots + 1); j < (Law_A.noStandardSpots + Law_A.noLongSpots + 1); j++) {
                    Law_A.Spot[j] = "long vehicle";
                }
                for (int j = (Law_A.noStandardSpots + Law_A.noLongSpots + 1); j < (Law_A.noSpots + 1); j++) {
                    Law_A.Spot[j] = "handicapped";
                }
            }
            active.Spot= Law_A.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if(facultySelect == "Law" && parkAreaSelect == "B") {
            Law_B.name="Law_B";
            active.noSpots= Law_B.noSpots;
            active.noStandardSpots= Law_B.noStandardSpots;
            active.noLongSpots= Law_B.noLongSpots;
            active.noHandiSpots= Law_B.noHandiSpots;
            if(Law_B.Spot[0].equals("ID")){
                Law_B.Spot[0]= Law_B.name;
                for (int j = 1; j < (Law_B.noStandardSpots + 1); j++) {
                    Law_B.Spot[j] = "standard";
                }
                for (int j = (Law_B.noStandardSpots + 1); j < (Law_B.noStandardSpots + Law_B.noLongSpots + 1); j++) {
                    Law_B.Spot[j] = "long vehicle";
                }
                for (int j = (Law_B.noStandardSpots + Law_B.noLongSpots + 1); j < (Law_B.noSpots + 1); j++) {
                    Law_B.Spot[j] = "handicapped";
                }
            }
            active.Spot= Law_B.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if((facultySelect=="Engineering" && parkAreaSelect=="A")){
            Engineering_A.name="Engineering_A";
            active.noSpots= Engineering_A.noSpots;
            active.noStandardSpots= Engineering_A.noStandardSpots;
            active.noLongSpots= Engineering_A.noLongSpots;
            active.noHandiSpots= Engineering_A.noHandiSpots;
            if(Engineering_A.Spot[0].equals("ID")){
                Engineering_A.Spot[0]= Engineering_A.name;
                for (int j = 1; j < (Engineering_A.noStandardSpots + 1); j++) {
                    Engineering_A.Spot[j] = "standard";
                }
                for (int j = (Engineering_A.noStandardSpots + 1); j < (Engineering_A.noStandardSpots + Engineering_A.noLongSpots + 1); j++) {
                    Engineering_A.Spot[j] = "long vehicle";
                }
                for (int j = (Engineering_A.noStandardSpots + Engineering_A.noLongSpots + 1); j < (Engineering_A.noSpots + 1); j++) {
                    Engineering_A.Spot[j] = "handicapped";
                }
            }
            active.Spot= Engineering_A.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if(facultySelect=="Nursing" && parkAreaSelect=="A")
        {
            Nursing_A.name="Nursing_A";
            active.noSpots= Nursing_A.noSpots;
            active.noStandardSpots= Nursing_A.noStandardSpots;
            active.noLongSpots= Nursing_A.noLongSpots;
            active.noHandiSpots= Nursing_A.noHandiSpots;
            if(Nursing_A.Spot[0].equals("ID")){
                Nursing_A.Spot[0]= Nursing_A.name;
                for (int j = 1; j < (Nursing_A.noStandardSpots + 1); j++) {
                    Nursing_A.Spot[j] = "standard";
                }
                for (int j = (Nursing_A.noStandardSpots + 1); j < (Nursing_A.noStandardSpots + Nursing_A.noLongSpots + 1); j++) {
                    Nursing_A.Spot[j] = "long vehicle";
                }
                for (int j = (Nursing_A.noStandardSpots + Nursing_A.noLongSpots + 1); j < (Nursing_A.noSpots + 1); j++) {
                    Nursing_A.Spot[j] = "handicapped";
                }
            }
            active.Spot= Nursing_A.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if(facultySelect=="Medicine" && parkAreaSelect=="A")
        {
            Medicine_A.name="Medicine_A";
            active.noSpots= Medicine_A.noSpots;
            active.noStandardSpots= Medicine_A.noStandardSpots;
            active.noLongSpots= Medicine_A.noLongSpots;
            active.noHandiSpots= Medicine_A.noHandiSpots;
            if(Medicine_A.Spot[0].equals("ID")){
                Medicine_A.Spot[0]= Medicine_A.name;
                for (int j = 1; j < (Medicine_A.noStandardSpots + 1); j++) {
                    Medicine_A.Spot[j] = "standard";
                }
                for (int j = (Medicine_A.noStandardSpots + 1); j < (Medicine_A.noStandardSpots + Medicine_A.noLongSpots + 1); j++) {
                    Medicine_A.Spot[j] = "long vehicle";
                }
                for (int j = (Medicine_A.noStandardSpots + Medicine_A.noLongSpots + 1); j < (Medicine_A.noSpots + 1); j++) {
                    Medicine_A.Spot[j] = "handicapped";
                }
            }
            active.Spot= Medicine_A.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if(facultySelect=="Medicine" && parkAreaSelect=="B")
        {
            Medicine_B.name="Medicine_B";
            active.noSpots= Medicine_B.noSpots;
            active.noStandardSpots= Medicine_B.noStandardSpots;
            active.noLongSpots= Medicine_B.noLongSpots;
            active.noHandiSpots= Medicine_B.noHandiSpots;
            if(Medicine_B.Spot[0].equals("ID")){
                Medicine_B.Spot[0]= Medicine_B.name;
                for (int j = 1; j < (Medicine_B.noStandardSpots + 1); j++) {
                    Medicine_B.Spot[j] = "standard";
                }
                for (int j = (Medicine_B.noStandardSpots + 1); j < (Medicine_B.noStandardSpots + Medicine_B.noLongSpots + 1); j++) {
                    Medicine_B.Spot[j] = "long vehicle";
                }
                for (int j = (Medicine_B.noStandardSpots + Medicine_B.noLongSpots + 1); j < (Medicine_B.noSpots + 1); j++) {
                    Medicine_B.Spot[j] = "handicapped";
                }
            }
            active.Spot= Medicine_B.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if(facultySelect=="UCSC" && parkAreaSelect=="A")
        {
            UCSC_A.name="UCSC";
            active.noSpots= UCSC_A.noSpots;
            active.noStandardSpots= UCSC_A.noStandardSpots;
            active.noLongSpots= UCSC_A.noLongSpots;
            active.noHandiSpots= UCSC_A.noHandiSpots;
            if(UCSC_A.Spot[0].equals("ID")){
                UCSC_A.Spot[0]= UCSC_A.name;
                for (int j = 1; j < (UCSC_A.noStandardSpots + 1); j++) {
                    UCSC_A.Spot[j] = "standard";
                }
                for (int j = (UCSC_A.noStandardSpots + 1); j < (UCSC_A.noStandardSpots + UCSC_A.noLongSpots + 1); j++) {
                    UCSC_A.Spot[j] = "long vehicle";
                }
                for (int j = (UCSC_A.noStandardSpots + UCSC_A.noLongSpots + 1); j < (UCSC_A.noSpots + 1); j++) {
                    UCSC_A.Spot[j] = "handicapped";
                }
            }
            active.Spot= UCSC_A.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if(facultySelect=="Sripalee" && parkAreaSelect=="A")
        {
            Sripalee_A.name="Sripalee Campus";
            active.noSpots= Sripalee_A.noSpots;
            active.noStandardSpots= Sripalee_A.noStandardSpots;
            active.noLongSpots= Sripalee_A.noLongSpots;
            active.noHandiSpots= Sripalee_A.noHandiSpots;
            if(Sripalee_A.Spot[0].equals("ID")){
                Sripalee_A.Spot[0]= Sripalee_A.name;
                for (int j = 1; j < (Sripalee_A.noStandardSpots + 1); j++) {
                    Sripalee_A.Spot[j] = "standard";
                }
                for (int j = (Sripalee_A.noStandardSpots + 1); j < (Sripalee_A.noStandardSpots + Sripalee_A.noLongSpots + 1); j++) {
                    Sripalee_A.Spot[j] = "long vehicle";
                }
                for (int j = (Sripalee_A.noStandardSpots + Sripalee_A.noLongSpots + 1); j < (Sripalee_A.noSpots + 1); j++) {
                    Sripalee_A.Spot[j] = "handicapped";
                }
            }
            active.Spot= Sripalee_A.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if(facultySelect=="Sripalee" && parkAreaSelect=="B")
        {
            Sripalee_B.name="Sripalee Campus";
            active.noSpots= Sripalee_B.noSpots;
            active.noStandardSpots= Sripalee_B.noStandardSpots;
            active.noLongSpots= Sripalee_B.noLongSpots;
            active.noHandiSpots= Sripalee_B.noHandiSpots;
            if(Sripalee_B.Spot[0].equals("ID")){
                Sripalee_B.Spot[0]= Sripalee_B.name;
                for (int j = 1; j < (Sripalee_B.noStandardSpots + 1); j++) {
                    Sripalee_B.Spot[j] = "standard";
                }
                for (int j = (Sripalee_B.noStandardSpots + 1); j < (Sripalee_B.noStandardSpots + Sripalee_B.noLongSpots + 1); j++) {
                    Sripalee_B.Spot[j] = "long vehicle";
                }
                for (int j = (Sripalee_B.noStandardSpots + Sripalee_B.noLongSpots + 1); j < (Sripalee_B.noSpots + 1); j++) {
                    Sripalee_B.Spot[j] = "handicapped";
                }
            }
            active.Spot= Sripalee_B.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }
        else if(facultySelect=="Sripalee" && parkAreaSelect=="C")
        {
            Sripalee_C.name="Sripalee Campus";
            active.noSpots= Sripalee_C.noSpots;
            active.noStandardSpots= Sripalee_C.noStandardSpots;
            active.noLongSpots= Sripalee_C.noLongSpots;
            active.noHandiSpots= Sripalee_C.noHandiSpots;
            if(Sripalee_C.Spot[0].equals("ID")){
                Sripalee_C.Spot[0]= Sripalee_C.name;
                for (int j = 1; j < (Sripalee_C.noStandardSpots + 1); j++) {
                    Sripalee_C.Spot[j] = "standard";
                }
                for (int j = (Sripalee_C.noStandardSpots + 1); j < (Sripalee_C.noStandardSpots + Sripalee_C.noLongSpots + 1); j++) {
                    Sripalee_C.Spot[j] = "long vehicle";
                }
                for (int j = (Sripalee_C.noStandardSpots + Sripalee_C.noLongSpots + 1); j < (Sripalee_C.noSpots + 1); j++) {
                    Sripalee_C.Spot[j] = "handicapped";
                }
            }
            active.Spot= Sripalee_C.Spot;
            selectedFac=active.name;
            setLPlate();
            setDisplay();
        }

    }


    @FXML
    void onSelectTech(ActionEvent event) {
        facultySelect="Technology";
        facultySelect1.setText("Technology");
        parkSelect.setText("Select Parking Area");
        parkA.setVisible(true);
        parkB.setVisible(false);
        parkC.setVisible(false);

    }
    @FXML
    void onSelectScience(ActionEvent event) {
        facultySelect="Science";
        facultySelect1.setText("Science");
        parkSelect.setText("Select Parking Area");
        parkA.setVisible(true);
        parkB.setVisible(true);
        parkC.setVisible(true);
    }
    @FXML
    void onSelectLaw(ActionEvent event) {
        facultySelect="Law";
        facultySelect1.setText("Law");
        parkSelect.setText("Select Parking Area");
        parkA.setVisible(true);
        parkB.setVisible(true);
        parkC.setVisible(false);
    }
    @FXML
    void onSelectEngineering(ActionEvent event) {
        facultySelect="Engineering";
        facultySelect1.setText("Engineering");
        parkSelect.setText("Select Parking Area");
        parkA.setVisible(true);
        parkB.setVisible(false);
        parkC.setVisible(false);
    }
    @FXML
    void onSelectMedicine(ActionEvent event) {
        facultySelect="Medicine";
        facultySelect1.setText("Medicine");
        parkSelect.setText("Select Parking Area");
        parkA.setVisible(true);
        parkB.setVisible(true);
        parkC.setVisible(false);
    }
    @FXML
    void onSelectUCSC(ActionEvent event) {
        facultySelect="UCSC";
        facultySelect1.setText("UCSC");
        parkSelect.setText("Select Parking Area");
        parkA.setVisible(true);
        parkB.setVisible(false);
        parkC.setVisible(false);
    }
    @FXML
    void onSelectNursing(ActionEvent event) {
        facultySelect="Nursing";
        facultySelect1.setText("Nursing");
        parkSelect.setText("Select Parking Area");
        parkA.setVisible(true);
        parkB.setVisible(false);
        parkC.setVisible(false);
    }
    @FXML
    void onSelectSripalee(ActionEvent event) {
        facultySelect="Sripalee";
        facultySelect1.setText("Sripalee");
        parkSelect.setText("Select Parking Area");
        parkA.setVisible(true);
        parkB.setVisible(false);
        parkC.setVisible(false);
    }


    @FXML
    void onClickEnter(ActionEvent event)
    {
        newVehicle.Lplate=LPlateID.getText();
        if (newVehicle.Lplate!="")
        {
            int i = 1;
            while (i < (active.noSpots+1) ){
                if (active.Spot[i].equals(PType)) {
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
                    setLPlate();
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
        checkOut=1;
        LPlateSelect.setText(active.Spot[1]);
        PSpotDisplay1.setText(PSID1.getText());
        TypeDisplay.setText(displayType1.getText());
    }

    @FXML
    void onSelectV10(ActionEvent event) {
        checkOut=10;
        LPlateSelect.setText(active.Spot[10]);
        PSpotDisplay1.setText(PSID10.getText());
        TypeDisplay.setText(displayType1.getText());
    }

    @FXML
    void onSelectV2(ActionEvent event) {
        checkOut=2;
        LPlateSelect.setText(active.Spot[2]);
        PSpotDisplay1.setText(PSID2.getText());
        TypeDisplay.setText(displayType2.getText());
    }

    @FXML
    void onSelectV3(ActionEvent event) {
        checkOut=3;
        LPlateSelect.setText(active.Spot[3]);
        PSpotDisplay1.setText(PSID3.getText());
        TypeDisplay.setText(displayType3.getText());
    }

    @FXML
    void onSelectV4(ActionEvent event) {
        checkOut=4;
        LPlateSelect.setText(active.Spot[4]);
        PSpotDisplay1.setText(PSID4.getText());
        TypeDisplay.setText(displayType4.getText());
    }

    @FXML
    void onSelectV5(ActionEvent event) {
        checkOut=5;
        LPlateSelect.setText(active.Spot[5]);
        PSpotDisplay1.setText(PSID5.getText());
        TypeDisplay.setText(displayType5.getText());
    }

    @FXML
    void onSelectV6(ActionEvent event) {
        checkOut=6;
        LPlateSelect.setText(active.Spot[6]);
        PSpotDisplay1.setText(PSID6.getText());
        TypeDisplay.setText(displayType6.getText());
    }

    @FXML
    void onSelectV7(ActionEvent event) {
        checkOut=7;
        LPlateSelect.setText(active.Spot[7]);
        PSpotDisplay1.setText(PSID7.getText());
        TypeDisplay.setText(displayType7.getText());
    }

    @FXML
    void onSelectV8(ActionEvent event) {
        checkOut=8;
        LPlateSelect.setText(active.Spot[8]);
        PSpotDisplay1.setText(PSID8.getText());
        TypeDisplay.setText(displayType8.getText());
    }

    @FXML
    void onSelectV9(ActionEvent event) {
        checkOut=9;
        LPlateSelect.setText(active.Spot[9]);
        PSpotDisplay1.setText(PSID9.getText());
        TypeDisplay.setText(displayType9.getText());
    }

    @FXML
    void onClickCheckOut(ActionEvent event) {
        if(checkOut<(active.noStandardSpots+1)) {
            active.Spot[checkOut] ="standard";
        }
        else if(checkOut<(active.noStandardSpots+ active.noLongSpots+1))
        {
            active.Spot[checkOut] ="long vehicle";
        }
        else{
            active.Spot[checkOut] ="handicapped";
        }
        if (selectedFac== Science_A.name){
            Science_A.Spot= active.Spot;
        }
        setDisplay();
        setLPlate();
        LPlateSelect.setText("Select Vehicle");
        PSpotDisplay1.setText("");
        TypeDisplay.setText("");
    }

    @FXML
    void onSelectA(ActionEvent event) {
        parkAreaSelect="A";
        parkSelect.setText("A");

    }

    @FXML
    void onSelectB(ActionEvent event) {
        parkAreaSelect="B";
        parkSelect.setText("B");
    }

    @FXML
    void onSelectC(ActionEvent event) {
        parkAreaSelect="C";
        parkSelect.setText("C");

    }
}
