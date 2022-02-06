package com.example.ia2211_cpms_g2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class test {

    @FXML
    private Label GPS;

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
    private MenuItem parkA;

    @FXML
    private MenuItem parkB;

    @FXML
    private MenuItem parkC;

    @FXML
    private Label NBuilding;

    @FXML
    private Label NBuilding1;

    @FXML
    private Label dimensions;

    @FXML
    private Label dimensions1;
//creating new objects for each parking area
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
//setting the data for th check out dropdown menu
    public void setLPlate()
    {
        //setting available spots of the active car park to null represented by dotted lines
        //while occupied places get the relevant Licence plate number
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
            LPlate3.setText(active.Spot[3]);
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
        //marking available spots in the selected car park
        //otherwise marking the number of the vehicle on the place
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
        //declaring the ID of the parking spots of standard parking spots
        for(int i=1;i<active.noStandardSpots+1;i++) {
            if (i==1){
                PSID1.setText(active.name+"_S1");
                displayType1.setText("standard");
            }
            if (i==2) {
                PSID2.setText(active.name+"_S2");
                displayType2.setText("standard");
            }
            if (i==3){
                    PSID3.setText(active.name+"_S3");
                    displayType3.setText("standard");
            }
            if (i==4) {
                PSID4.setText(active.name+"_S4");
                displayType4.setText("standard");
            }
            if (i==5) {
                PSID5.setText(active.name+"_S5");
                displayType5.setText("standard");
            }
            if (i==6) {
                PSID6.setText(active.name+"_S6");
                displayType6.setText("standard");
            }
            if (i==7) {
                PSID7.setText(active.name+"_S7");
                displayType7.setText("standard");
            }
            if (i==8) {
                PSID8.setText(active.name+"_S8");
                displayType8.setText("standard");
            }
            if (i==9) {
                PSID9.setText(active.name+"_S9");
                displayType9.setText("standard");
            }
            if (i==10){
                    PSID10.setText(active.name+"_S10");
                    displayType10.setText("standard");
            }

        }
        //declaring the ID of the parking spots of long vehicle parking spots
        for(int i=(active.noStandardSpots+1);i<active.noStandardSpots+1+active.noLongSpots;i++) {
            if (i==1){
                PSID1.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType1.setText("long vehicle");
            }
            if (i==2) {
                PSID2.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType2.setText("long vehicle");
            }
            if (i==3){
                PSID3.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType3.setText("long vehicle");
            }
            if (i==4) {
                PSID4.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType4.setText("long vehicle");
            }
            if (i==5) {
                PSID5.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType5.setText("long vehicle");
            }
            if (i==6) {
                PSID6.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType6.setText("long vehicle");
            }
            if (i==7) {
                PSID7.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType7.setText("long vehicle");
            }
            if (i==8) {
                PSID8.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType8.setText("long vehicle");
            }
            if (i==9) {
                PSID9.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType9.setText("long vehicle");
            }
            if (i==10){
                PSID10.setText(active.name+"_L"+(String.valueOf(i-active.noStandardSpots)));
                displayType10.setText("long vehicle");
            }

        }
        //declaring the ID of the parking spots of handicapped parking spots
        for(int i=(active.noStandardSpots+1+active.noLongSpots);i<active.noSpots+1;i++) {
            if (i==1){
                PSID1.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType1.setText("handicapped");
            }
            if (i==2) {
                PSID2.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType2.setText("handicapped");
            }
            if (i==3){
                PSID3.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType3.setText("handicapped");
            }
            if (i==4) {
                PSID4.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType4.setText("handicapped");
            }
            if (i==5) {
                PSID5.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType5.setText("handicapped");
            }
            if (i==6) {
                PSID6.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType6.setText("handicapped");
            }
            if (i==7) {
                PSID7.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType7.setText("handicapped");
            }
            if (i==8) {
                PSID8.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType8.setText("handicapped");
            }
            if (i==9) {
                PSID9.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType9.setText("handicapped");
            }
            if (i==10){
                PSID10.setText(active.name+"_H"+(String.valueOf(i-active.noStandardSpots- active.noLongSpots)));
                displayType10.setText("handicapped");
            }

        }

    }

//assigning values to each entity(number of parking spots,long vehicle,standard,handicapped spots.gps coordinates and other details
    @FXML
    void onClickOK(ActionEvent event) {
        Science_A.noSpots = 10;
        Science_A.noStandardSpots = 3;
        Science_A.noLongSpots = 3;
        Science_A.noHandiSpots = 4;
        Science_A.SpotGPS[1]="6°54'06.0\"N 79°51'37.0\"E";
        Science_A.SpotGPS[2]="6°54'06.1\"N 79°51'37.1\"E";
        Science_A.SpotGPS[3]="6°54'06.2\"N 79°51'37.2\"E";
        Science_A.SpotGPS[4]="6°54'06.3\"N 79°51'37.3\"E";
        Science_A.SpotGPS[5]="6°54'06.4\"N 79°51'37.4\"E";
        Science_A.SpotGPS[6]="6°54'06.5\"N 79°51'37.5\"E";
        Science_A.SpotGPS[7]="6°54'06.6\"N 79°51'37.6\"E";
        Science_A.SpotGPS[8]="6°54'06.7\"N 79°51'37.7\"E";
        Science_A.SpotGPS[9]="6°54'06.8\"N 79°51'37.8\"E";
        Science_A.SpotGPS[10]="6°54'06.9\"N 79°51'37.9\"E";
        Science_A.SpotDimensions[4]="length = 6m , width = 3m";
        Science_A.SpotDimensions[5]="length = 5m , width = 3m";
        Science_A.SpotDimensions[6]="length = 7m , width = 3m";
        Science_A.Spotbuilding[7]="canteen";
        Science_A.Spotbuilding[8]="canteen";
        Science_A.Spotbuilding[9]="Chemistry Lab";
        Science_A.Spotbuilding[10]="Chemistry Lab";

        Science_B.noSpots = 10;
        Science_B.noStandardSpots = 4;
        Science_B.noLongSpots = 2;
        Science_B.noHandiSpots = 4;
        Science_B.SpotGPS[1]="6°54'07.0\"N 79°51'38.0\"E";
        Science_B.SpotGPS[2]="6°54'07.1\"N 79°51'38.1\"E";
        Science_B.SpotGPS[3]="6°54'07.2\"N 79°51'38.2\"E";
        Science_B.SpotGPS[4]="6°54'07.3\"N 79°51'38.3\"E";
        Science_B.SpotGPS[5]="6°54'07.4\"N 79°51'38.4\"E";
        Science_B.SpotGPS[6]="6°54'07.5\"N 79°51'38.5\"E";
        Science_B.SpotGPS[7]="6°54'07.6\"N 79°51'38.6\"E";
        Science_B.SpotGPS[8]="6°54'07.7\"N 79°51'38.7\"E";
        Science_B.SpotGPS[9]="6°54'07.8\"N 79°51'38.8\"E";
        Science_B.SpotGPS[10]="6°54'07.9\"N 79°51'38.9\"E";
        Science_B.SpotDimensions[5]="length = 5m , width = 3m";
        Science_B.SpotDimensions[6]="length = 7m , width = 3m";
        Science_B.Spotbuilding[7]="Dean's Office";
        Science_B.Spotbuilding[8]="Dean's Office";
        Science_B.Spotbuilding[9]="Physics Lab";
        Science_B.Spotbuilding[10]="Physics Lab";

        Science_C.noSpots = 10;
        Science_C.noStandardSpots = 5;
        Science_C.noLongSpots = 4;
        Science_C.noHandiSpots = 1;
        Science_C.SpotGPS[1]="6°54'08.0\"N 79°51'39.0\"E";
        Science_C.SpotGPS[2]="6°54'08.1\"N 79°51'39.1\"E";
        Science_C.SpotGPS[3]="6°54'08.2\"N 79°51'39.2\"E";
        Science_C.SpotGPS[4]="6°54'08.3\"N 79°51'39.3\"E";
        Science_C.SpotGPS[5]="6°54'08.4\"N 79°51'39.4\"E";
        Science_C.SpotGPS[6]="6°54'08.5\"N 79°51'39.5\"E";
        Science_C.SpotGPS[7]="6°54'08.6\"N 79°51'39.6\"E";
        Science_C.SpotGPS[8]="6°54'08.7\"N 79°51'39.7\"E";
        Science_C.SpotGPS[9]="6°54'08.8\"N 79°51'39.8\"E";
        Science_C.SpotGPS[10]="6°54'08.9\"N 79°51'39.9\"E";
        Science_C.SpotDimensions[6]="length = 7m , width = 3m";
        Science_C.SpotDimensions[7]="length = 10m , width = 5m";
        Science_C.SpotDimensions[8]="length = 5m , width = 3m";
        Science_C.SpotDimensions[9]="length = 7m , width = 2.5m";
        Science_C.Spotbuilding[10]="Pavilion";


        Technology_A.noSpots = 10;
        Technology_A.noStandardSpots = 7;
        Technology_A.noLongSpots = 2;
        Technology_A.noHandiSpots = 1;
        Technology_A.SpotGPS[1]="6°25'06.0\"N 79°11'37.0\"E";
        Technology_A.SpotGPS[2]="6°25'06.1\"N 79°11'37.1\"E";
        Technology_A.SpotGPS[3]="6°25'06.2\"N 79°11'37.2\"E";
        Technology_A.SpotGPS[4]="6°25'06.3\"N 79°11'37.3\"E";
        Technology_A.SpotGPS[5]="6°25'06.4\"N 79°11'37.4\"E";
        Technology_A.SpotGPS[6]="6°25'06.5\"N 79°11'37.5\"E";
        Technology_A.SpotGPS[7]="6°25'06.6\"N 79°11'37.6\"E";
        Technology_A.SpotGPS[8]="6°25'06.7\"N 79°11'37.7\"E";
        Technology_A.SpotGPS[9]="6°25'06.8\"N 79°11'37.8\"E";
        Technology_A.SpotGPS[10]="6°25'06.9\"N 79°11'37.9\"E";
        Technology_A.SpotDimensions[8]="length = 7m , width = 3m";
        Technology_A.SpotDimensions[9]="length = 10m , width = 5m";
        Technology_A.Spotbuilding[10]="IAT Department Building";

        Law_A.noSpots = 10;
        Law_A.noStandardSpots = 7;
        Law_A.noLongSpots = 0;
        Law_A.noHandiSpots = 3;
        Law_A.SpotGPS[1]="6°53'06.0\"N 79°55'37.0\"E";
        Law_A.SpotGPS[2]="6°53'06.1\"N 79°55'37.1\"E";
        Law_A.SpotGPS[3]="6°53'06.2\"N 79°55'37.2\"E";
        Law_A.SpotGPS[4]="6°53'06.3\"N 79°55'37.3\"E";
        Law_A.SpotGPS[5]="6°53'06.4\"N 79°55'37.4\"E";
        Law_A.SpotGPS[6]="6°53'06.5\"N 79°55'37.5\"E";
        Law_A.SpotGPS[7]="6°53'06.6\"N 79°55'37.6\"E";
        Law_A.SpotGPS[8]="6°53'06.7\"N 79°55'37.7\"E";
        Law_A.SpotGPS[9]="6°53'06.8\"N 79°55'37.8\"E";
        Law_A.SpotGPS[10]="6°53'06.9\"N 79°55'37.9\"E";
        Law_A.Spotbuilding[8]="Dean's Office";
        Law_A.Spotbuilding[9]="Indoor Stadium";
        Law_A.Spotbuilding[10]="Canteen";

        Law_B.noSpots = 10;
        Law_B.noStandardSpots = 7;
        Law_B.noLongSpots = 2;
        Law_B.noHandiSpots = 1;
        Law_B.SpotGPS[1]="6°53'00.0\"N 79°51'00.0\"E";
        Law_B.SpotGPS[2]="6°53'00.1\"N 79°51'00.1\"E";
        Law_B.SpotGPS[3]="6°53'00.2\"N 79°51'00.2\"E";
        Law_B.SpotGPS[4]="6°53'00.3\"N 79°51'00.3\"E";
        Law_B.SpotGPS[5]="6°53'00.4\"N 79°51'00.4\"E";
        Law_B.SpotGPS[6]="6°53'00.5\"N 79°51'00.5\"E";
        Law_B.SpotGPS[7]="6°53'00.6\"N 79°51'00.6\"E";
        Law_B.SpotGPS[8]="6°53'00.7\"N 79°51'00.7\"E";
        Law_B.SpotGPS[9]="6°53'00.8\"N 79°51'00.8\"E";
        Law_B.SpotGPS[10]="6°53'00.9\"N 79°51'00.9\"E";
        Law_B.SpotDimensions[8]="length = 5m , width = 2.5m";
        Law_B.SpotDimensions[9]="length = 7m , width = 3m";
        Law_B.Spotbuilding[10]="Auditorium";

        Engineering_A.noSpots = 10;
        Engineering_A.noStandardSpots = 6;
        Engineering_A.noLongSpots = 1;
        Engineering_A.noHandiSpots = 3;
        Engineering_A.SpotGPS[1]="6°04'06.10\"N 79°56'37.10\"E";
        Engineering_A.SpotGPS[2]="6°04'06.11\"N 79°56'37.11\"E";
        Engineering_A.SpotGPS[3]="6°04'06.12\"N 79°56'37.21\"E";
        Engineering_A.SpotGPS[4]="6°04'06.13\"N 79°56'37.31\"E";
        Engineering_A.SpotGPS[5]="6°04'06.14\"N 79°56'37.41\"E";
        Engineering_A.SpotGPS[6]="6°04'06.15\"N 79°56'37.51\"E";
        Engineering_A.SpotGPS[7]="6°04'06.16\"N 79°56'37.61\"E";
        Engineering_A.SpotGPS[8]="6°04'06.17\"N 79°56'37.71\"E";
        Engineering_A.SpotGPS[9]="6°04'06.18\"N 79°56'37.81\"E";
        Engineering_A.SpotGPS[10]="6°04'06.19\"N 79°56'37.91\"E";
        Engineering_A.SpotDimensions[7]="length = 10m , width = 5m";
        Engineering_A.Spotbuilding[8]="Chemistry Lab";
        Engineering_A.Spotbuilding[9]="Physics Lab";
        Engineering_A.Spotbuilding[10]="Administration Building";

        Medicine_A.noSpots = 10;
        Medicine_A.noStandardSpots = 5;
        Medicine_A.noLongSpots = 1;
        Medicine_A.noHandiSpots = 4;
        Medicine_A.SpotGPS[1]="6°89'06.0\"N 79°51'12.0\"E";
        Medicine_A.SpotGPS[2]="6°89'06.1\"N 79°51'12.1\"E";
        Medicine_A.SpotGPS[3]="6°89'06.2\"N 79°51'12.2\"E";
        Medicine_A.SpotGPS[4]="6°89'06.3\"N 79°51'12.3\"E";
        Medicine_A.SpotGPS[5]="6°89'06.4\"N 79°51'12.4\"E";
        Medicine_A.SpotGPS[6]="6°98'06.5\"N 79°51'12.5\"E";
        Medicine_A.SpotGPS[7]="6°89'06.6\"N 79°51'12.6\"E";
        Medicine_A.SpotGPS[8]="6°89'06.7\"N 79°51'12.7\"E";
        Medicine_A.SpotGPS[9]="6°89'06.8\"N 79°51'12.8\"E";
        Medicine_A.SpotGPS[10]="6°89'06.9\"N 79°51'12.9\"E";
        Medicine_A.SpotDimensions[6]="length = 7m , width = 3m";
        Medicine_A.Spotbuilding[7]="Dean's Office";
        Medicine_A.Spotbuilding[8]="Canteen";
        Medicine_A.Spotbuilding[9]="Computer Lab";
        Medicine_A.Spotbuilding[10]="Physics Lab";

        Medicine_B.noSpots = 10;
        Medicine_B.noStandardSpots = 7;
        Medicine_B.noLongSpots = 1;
        Medicine_B.noHandiSpots = 2;
        Medicine_B.SpotGPS[1]="6°44'06.0\"N 79°41'37.0\"E";
        Medicine_B.SpotGPS[2]="6°44'06.1\"N 79°41'37.1\"E";
        Medicine_B.SpotGPS[3]="6°44'06.2\"N 79°41'37.2\"E";
        Medicine_B.SpotGPS[4]="6°44'06.3\"N 79°41'37.3\"E";
        Medicine_B.SpotGPS[5]="6°44'06.4\"N 79°41'37.4\"E";
        Medicine_B.SpotGPS[6]="6°44'06.5\"N 79°41'37.5\"E";
        Medicine_B.SpotGPS[7]="6°44'06.6\"N 79°41'37.6\"E";
        Medicine_B.SpotGPS[8]="6°44'06.7\"N 79°41'37.7\"E";
        Medicine_B.SpotGPS[9]="6°44'06.8\"N 79°41'37.8\"E";
        Medicine_B.SpotGPS[10]="6°44'06.9\"N 79°41'37.9\"E";
        Medicine_B.SpotDimensions[8]="length = 5m , width = 3m";
        Medicine_B.Spotbuilding[9]="Lecture Hall 1";
        Medicine_B.Spotbuilding[10]="Lecture Hall 2";

        UCSC_A.noSpots = 10;
        UCSC_A.noStandardSpots = 3;
        UCSC_A.noLongSpots = 3;
        UCSC_A.noHandiSpots = 4;
        UCSC_A.SpotGPS[1]="6°15'06.0\"N 79°51'03.0\"E";
        UCSC_A.SpotGPS[2]="6°15'06.1\"N 79°51'03.1\"E";
        UCSC_A.SpotGPS[3]="6°15'06.2\"N 79°51'03.2\"E";
        UCSC_A.SpotGPS[4]="6°15'06.3\"N 79°51'03.3\"E";
        UCSC_A.SpotGPS[5]="6°15'06.4\"N 79°51'03.4\"E";
        UCSC_A.SpotGPS[6]="6°15'06.5\"N 79°51'03.5\"E";
        UCSC_A.SpotGPS[7]="6°15'06.6\"N 79°51'03.6\"E";
        UCSC_A.SpotGPS[8]="6°15'06.7\"N 79°51'03.7\"E";
        UCSC_A.SpotGPS[9]="6°15'06.8\"N 79°51'03.8\"E";
        UCSC_A.SpotGPS[10]="6°15'06.9\"N 79°51'03.9\"E";
        UCSC_A.SpotDimensions[4]="length = 7m , width = 3m";
        UCSC_A.SpotDimensions[5]="length = 7m , width = 5m";
        UCSC_A.SpotDimensions[6]="length = 5m , width = 3m";
        UCSC_A.Spotbuilding[7]="Gym";
        UCSC_A.Spotbuilding[8]="Canteen";
        UCSC_A.Spotbuilding[9]="Marshal Office";
        UCSC_A.Spotbuilding[10]="Network Lab";

        Nursing_A.noSpots = 10;
        Nursing_A.noStandardSpots = 5;
        Nursing_A.noLongSpots = 3;
        Nursing_A.noHandiSpots = 2;
        Nursing_A.SpotGPS[1]="6°51'66.0\"N 79°11'37.0\"E";
        Nursing_A.SpotGPS[2]="6°51'66.1\"N 79°11'37.1\"E";
        Nursing_A.SpotGPS[3]="6°51'66.2\"N 79°11'37.2\"E";
        Nursing_A.SpotGPS[4]="6°51'66.3\"N 79°11'37.3\"E";
        Nursing_A.SpotGPS[5]="6°51'66.4\"N 79°11'37.4\"E";
        Nursing_A.SpotGPS[6]="6°51'66.5\"N 79°11'37.5\"E";
        Nursing_A.SpotGPS[7]="6°51'66.6\"N 79°11'37.6\"E";
        Nursing_A.SpotGPS[8]="6°51'66.7\"N 79°11'37.7\"E";
        Nursing_A.SpotGPS[9]="6°51'66.8\"N 79°11'37.8\"E";
        Nursing_A.SpotGPS[10]="6°51'66.9\"N 79°11'37.9\"E";
        Nursing_A.SpotDimensions[6]="length = 7m , width = 3m";
        Nursing_A.SpotDimensions[7]="length = 10m , width = 5m";
        Nursing_A.SpotDimensions[8]="length = 5m , width = 3m";
        Nursing_A.Spotbuilding[9]="Academic Building";
        Nursing_A.Spotbuilding[10]="Canteen";

        Sripalee_A.noSpots = 10;
        Sripalee_A.noStandardSpots = 7;
        Sripalee_A.noLongSpots = 3;
        Sripalee_A.noHandiSpots = 0;
        Sripalee_A.SpotGPS[1]="6°54'46.0\"N 79°51'32.0\"E";
        Sripalee_A.SpotGPS[2]="6°54'46.1\"N 79°51'38.1\"E";
        Sripalee_A.SpotGPS[3]="6°54'46.2\"N 79°51'32.2\"E";
        Sripalee_A.SpotGPS[4]="6°54'46.3\"N 79°51'34.3\"E";
        Sripalee_A.SpotGPS[5]="6°54'46.4\"N 79°51'35.4\"E";
        Sripalee_A.SpotGPS[6]="6°54'46.5\"N 79°51'75.5\"E";
        Sripalee_A.SpotGPS[7]="6°54'46.6\"N 79°51'78.6\"E";
        Sripalee_A.SpotGPS[8]="6°54'46.7\"N 79°51'97.7\"E";
        Sripalee_A.SpotGPS[9]="6°54'46.8\"N 79°51'69.8\"E";
        Sripalee_A.SpotGPS[10]="6°54'46.9\"N 79°51'60.9\"E";
        Sripalee_B.SpotDimensions[8]="length = 5m , width = 3m";
        Sripalee_B.SpotDimensions[9]="length = 7m , width = 2.5m";
        Sripalee_B.SpotDimensions[10]="length = 7m , width = 3m";

        Sripalee_B.noSpots = 10;
        Sripalee_B.noStandardSpots = 7;
        Sripalee_B.noLongSpots = 0;
        Sripalee_B.noHandiSpots = 3;
        Sripalee_B.SpotGPS[1]="6°54'90.0\"N 79°51'11.0\"E";
        Sripalee_B.SpotGPS[2]="6°54'90.1\"N 79°51'11.1\"E";
        Sripalee_B.SpotGPS[3]="6°54'90.2\"N 79°51'11.2\"E";
        Sripalee_B.SpotGPS[4]="6°54'90.3\"N 79°51'11.3\"E";
        Sripalee_B.SpotGPS[5]="6°54'90.4\"N 79°51'11.4\"E";
        Sripalee_B.SpotGPS[6]="6°54'90.5\"N 79°51'11.5\"E";
        Sripalee_B.SpotGPS[7]="6°54'90.6\"N 79°51'11.6\"E";
        Sripalee_B.SpotGPS[8]="6°54'90.7\"N 79°51'11.7\"E";
        Sripalee_B.SpotGPS[9]="6°54'90.8\"N 79°51'11.8\"E";
        Sripalee_B.SpotGPS[10]="6°54'90.9\"N 79°51'11.9\"E";
        Sripalee_B.Spotbuilding[8]="Auditorium";
        Sripalee_B.Spotbuilding[9]="Administration Building";
        Sripalee_B.Spotbuilding[10]="Theatre";

        Sripalee_C.noSpots = 10;
        Sripalee_C.noStandardSpots = 7;
        Sripalee_C.noLongSpots = 1;
        Sripalee_C.noHandiSpots = 2;
        Sripalee_C.SpotGPS[1]="6°54'96.0\"N 79°51'00.0\"E";
        Sripalee_C.SpotGPS[2]="6°54'96.1\"N 79°51'00.1\"E";
        Sripalee_C.SpotGPS[3]="6°54'96.2\"N 79°51'00.2\"E";
        Sripalee_C.SpotGPS[4]="6°54'96.3\"N 79°51'00.3\"E";
        Sripalee_C.SpotGPS[5]="6°54'96.4\"N 79°51'00.4\"E";
        Sripalee_C.SpotGPS[6]="6°54'96.5\"N 79°51'00.5\"E";
        Sripalee_C.SpotGPS[7]="6°54'96.6\"N 79°51'00.6\"E";
        Sripalee_C.SpotGPS[8]="6°54'96.7\"N 79°51'00.7\"E";
        Sripalee_C.SpotGPS[9]="6°54'96.8\"N 79°51'00.8\"E";
        Sripalee_C.SpotGPS[10]="6°54'96.9\"N 79°51'00.9\"E";
        Sripalee_C.SpotDimensions[8]="length = 5m , width = 3m";
        Sripalee_C.Spotbuilding[9]="Dean's Office";
        Sripalee_C.Spotbuilding[10]="Canteen";
//selecting the active parking area using faculty and the park name
//necessary details are set in the active park using the selected parks
        if (facultySelect.equals("Science") && parkAreaSelect.equals("A")) {
            Science_A.name = "SC_A";
            active.noSpots = Science_A.noSpots;
            active.noStandardSpots = Science_A.noStandardSpots;
            active.noLongSpots = Science_A.noLongSpots;
            active.noHandiSpots = Science_A.noHandiSpots;
            active.SpotGPS=Science_A.SpotGPS;
            active.SpotDimensions=Science_A.SpotDimensions;
            active.Spotbuilding=Science_A.Spotbuilding;
            active.name= Science_A.name;
            //type of each spot declared according to the no of spots of each type.repeated with all the parking areas
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
        }
        else if (facultySelect.equals("Science") && parkAreaSelect.equals("B")) {
            Science_B.name = "SC_B";
            active.noSpots = Science_B.noSpots;
            active.noStandardSpots = Science_B.noStandardSpots;
            active.noLongSpots = Science_B.noLongSpots;
            active.noHandiSpots = Science_B.noHandiSpots;
            active.SpotGPS=Science_B.SpotGPS;
            active.SpotDimensions=Science_B.SpotDimensions;
            active.Spotbuilding=Science_B.Spotbuilding;
            active.name= Science_B.name;
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
        }
        else if (facultySelect.equals("Science") && parkAreaSelect.equals("C")) {
            Science_C.name = "SC_C";
            active.noSpots = Science_C.noSpots;
            active.noStandardSpots = Science_C.noStandardSpots;
            active.noLongSpots = Science_C.noLongSpots;
            active.noHandiSpots = Science_C.noHandiSpots;
            active.SpotGPS=Science_C.SpotGPS;
            active.SpotDimensions=Science_C.SpotDimensions;
            active.Spotbuilding=Science_C.Spotbuilding;
            active.name= Science_C.name;
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
        }
        else if (facultySelect.equals("Technology") && parkAreaSelect.equals("A")) {
            Technology_A.name = "TC_A";
            active.noSpots = Technology_A.noSpots;
            active.noStandardSpots = Technology_A.noStandardSpots;
            active.noLongSpots = Technology_A.noLongSpots;
            active.noHandiSpots = Technology_A.noHandiSpots;
            active.SpotGPS=Technology_A.SpotGPS;
            active.SpotDimensions=Technology_A.SpotDimensions;
            active.Spotbuilding=Technology_A.Spotbuilding;
            active.name= Technology_A.name;
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
        }

        else if(facultySelect.equals("Law") && parkAreaSelect.equals("A")) {
            Law_A.name="LW_A";
            active.noSpots= Law_A.noSpots;
            active.noStandardSpots= Law_A.noStandardSpots;
            active.noLongSpots= Law_A.noLongSpots;
            active.noHandiSpots= Law_A.noHandiSpots;
            active.SpotGPS=Law_A.SpotGPS;
            active.SpotDimensions=Law_A.SpotDimensions;
            active.Spotbuilding=Law_A.Spotbuilding;
            active.name= Law_A.name;
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
        }
        else if(facultySelect.equals("Law") && parkAreaSelect.equals("B")) {
            Law_B.name="LW_B";
            active.noSpots= Law_B.noSpots;
            active.noStandardSpots= Law_B.noStandardSpots;
            active.noLongSpots= Law_B.noLongSpots;
            active.noHandiSpots= Law_B.noHandiSpots;
            active.SpotGPS=Law_B.SpotGPS;
            active.SpotDimensions=Law_B.SpotDimensions;
            active.Spotbuilding=Law_B.Spotbuilding;
            active.name= Law_B.name;
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
        }
        else if((facultySelect.equals("Engineering") && parkAreaSelect.equals("A"))){
            Engineering_A.name="EN_A";
            active.noSpots= Engineering_A.noSpots;
            active.noStandardSpots= Engineering_A.noStandardSpots;
            active.noLongSpots= Engineering_A.noLongSpots;
            active.noHandiSpots= Engineering_A.noHandiSpots;
            active.SpotGPS=Engineering_A.SpotGPS;
            active.SpotDimensions=Engineering_A.SpotDimensions;
            active.Spotbuilding=Engineering_A.Spotbuilding;
            active.name= Engineering_A.name;
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
        }
        else if(facultySelect.equals("Nursing") && parkAreaSelect.equals("A"))
        {
            Nursing_A.name="NS_A";
            active.noSpots= Nursing_A.noSpots;
            active.noStandardSpots= Nursing_A.noStandardSpots;
            active.noLongSpots= Nursing_A.noLongSpots;
            active.noHandiSpots= Nursing_A.noHandiSpots;
            active.SpotGPS=Nursing_A.SpotGPS;
            active.SpotDimensions=Nursing_A.SpotDimensions;
            active.Spotbuilding=Nursing_A.Spotbuilding;
            active.name=Nursing_A.name;
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
        }
        else if(facultySelect.equals("Medicine") && parkAreaSelect.equals("A"))
        {
            Medicine_A.name="MD_A";
            active.noSpots= Medicine_A.noSpots;
            active.noStandardSpots= Medicine_A.noStandardSpots;
            active.noLongSpots= Medicine_A.noLongSpots;
            active.noHandiSpots= Medicine_A.noHandiSpots;
            active.SpotGPS=Medicine_A.SpotGPS;
            active.SpotDimensions=Medicine_A.SpotDimensions;
            active.Spotbuilding=Medicine_A.Spotbuilding;
            active.name= Medicine_A.name;
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
        }
        else if(facultySelect.equals("Medicine") && parkAreaSelect.equals("B"))
        {
            Medicine_B.name="MD_B";
            active.noSpots= Medicine_B.noSpots;
            active.noStandardSpots= Medicine_B.noStandardSpots;
            active.noLongSpots= Medicine_B.noLongSpots;
            active.noHandiSpots= Medicine_B.noHandiSpots;
            active.SpotGPS=Medicine_B.SpotGPS;
            active.SpotDimensions=Medicine_B.SpotDimensions;
            active.Spotbuilding=Medicine_B.Spotbuilding;
            active.name= Medicine_B.name;
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
        }
        else if(facultySelect.equals("UCSC") && parkAreaSelect.equals("A"))
        {
            UCSC_A.name="UC_A";
            active.noSpots= UCSC_A.noSpots;
            active.noStandardSpots= UCSC_A.noStandardSpots;
            active.noLongSpots= UCSC_A.noLongSpots;
            active.noHandiSpots= UCSC_A.noHandiSpots;
            active.SpotGPS=UCSC_A.SpotGPS;
            active.SpotDimensions=UCSC_A.SpotDimensions;
            active.Spotbuilding=UCSC_A.Spotbuilding;
            active.name=UCSC_A.name;
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
        }
        else if(facultySelect.equals("Sripalee") && parkAreaSelect.equals("A"))
        {
            Sripalee_A.name="SP_A";
            active.noSpots= Sripalee_A.noSpots;
            active.noStandardSpots= Sripalee_A.noStandardSpots;
            active.noLongSpots= Sripalee_A.noLongSpots;
            active.noHandiSpots= Sripalee_A.noHandiSpots;
            active.SpotGPS=Sripalee_A.SpotGPS;
            active.SpotDimensions=Sripalee_A.SpotDimensions;
            active.Spotbuilding=Sripalee_A.Spotbuilding;
            active.name= Sripalee_A.name;
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
        }
        else if(facultySelect.equals("Sripalee") && parkAreaSelect.equals("B"))
        {
            Sripalee_B.name="SP_B";
            active.noSpots= Sripalee_B.noSpots;
            active.noStandardSpots= Sripalee_B.noStandardSpots;
            active.noLongSpots= Sripalee_B.noLongSpots;
            active.noHandiSpots= Sripalee_B.noHandiSpots;
            active.SpotGPS=Sripalee_B.SpotGPS;
            active.SpotDimensions=Sripalee_B.SpotDimensions;
            active.Spotbuilding=Sripalee_B.Spotbuilding;
            active.name= Sripalee_B.name;
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
        }
        else if(facultySelect.equals("Sripalee") && parkAreaSelect.equals("C"))
        {
            Sripalee_C.name="SP_C";
            active.noSpots= Sripalee_C.noSpots;
            active.noStandardSpots= Sripalee_C.noStandardSpots;
            active.noLongSpots= Sripalee_C.noLongSpots;
            active.noHandiSpots= Sripalee_C.noHandiSpots;
            active.SpotGPS=Sripalee_C.SpotGPS;
            active.SpotDimensions=Sripalee_C.SpotDimensions;
            active.Spotbuilding=Sripalee_C.Spotbuilding;
            active.name= Sripalee_C.name;
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
        }
        //set the display and check out menu using active park's details
        setLPlate();
        setDisplay();

    }

//faculty selection menu and its visual actions
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

//check in vehicle,show allocated spot and update lists and display
    @FXML
    void onClickEnter(ActionEvent event)
    {
        newVehicle.Lplate=LPlateID.getText();
        if (newVehicle.Lplate!="")
        {
            int i = 1;
            while (i < (active.noSpots+1) ){
                //generating parking spot ID according to available spots.first available spot of the correct type is selected
                if (active.Spot[i].equals(PType)) {
                    if(PType.equals("standard")){
                        PSpotDisplay.setText(active.name+"_S"+(String.valueOf(i)));
                        dimensions1.setVisible(false);
                        dimensions.setVisible(false);
                        NBuilding1.setVisible(false);
                    }
                    if(PType.equals("long vehicle")){
                        PSpotDisplay.setText(active.name+"_L"+(String.valueOf(i- active.noStandardSpots)));
                        dimensions.setText(active.SpotDimensions[i]);
                        dimensions1.setVisible(true);
                        NBuilding1.setVisible(false);
                    }
                    if(PType.equals("handicapped")){
                        PSpotDisplay.setText(active.name+"_H"+(String.valueOf(i- active.noStandardSpots- active.noLongSpots)));
                        dimensions1.setVisible(false);
                        dimensions.setVisible(false);
                        NBuilding1.setVisible(true);
                        NBuilding.setText(active.Spotbuilding[i]);
                    }
                    active.Spot[i] = newVehicle.Lplate;
                    setLPlate();
                    GPS.setText(active.SpotGPS[i]);
                    break;
                }
                else {
                    //if there are no available correct type parking spots,display no space
                    PSpotDisplay.setText("No Space");
                    GPS.setText("");
                }
                i = i + 1;
            }
            //update display values
        setDisplay();
    }
    }
//declaring the type of the park needed
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

    //setting up details for chick out function for each vehicle
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
//checkout function.remove checkout vehicles and update relevant list
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
//park number selection for each faculty
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
//clear details on entering vehicle side
    }
    @FXML
    void onClickDone(ActionEvent event) {
        PSpotDisplay.setText("");
        dimensions.setText("");
        GPS.setText("");
        NBuilding.setText("");
        LPlateID.setText("");
    }
}
