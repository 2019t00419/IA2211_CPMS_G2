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
    private Label TypeDisplay;

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
    private Label PSpotDisplay1;


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
    String PType,selectedFac;
    int checkOut;

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
    void onSelectScience(ActionEvent event) {
        Science.name="Science";
        active.noSpots=Science.noSpots=10;
        active.noStandardSpots=Science.noStandardSpots=3;
        active.noLongSpots=Science.noLongSpots=3;
        active.noHandiSpots=Science.noHandiSpots=4;
        if(Science.Spot[0].equals("ID")){
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
        selectedFac=active.name;
        setLPlate();
        setDisplay();
    }


    @FXML
    void onSelectTech(ActionEvent event) {
        Technology.name="Technology";
        active.noSpots=Technology.noSpots=10;
        active.noStandardSpots=Technology.noStandardSpots=7;
        active.noLongSpots=Technology.noLongSpots=2;
        active.noHandiSpots=Technology.noHandiSpots=1;
        if(Technology.Spot[0].equals("ID"))
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
        selectedFac=active.name;
        setLPlate();
        setDisplay();
    }
    @FXML
    void onSelectLaw(ActionEvent event) {
        Law.name="Law";
        active.noSpots=Law.noSpots=10;
        active.noStandardSpots=Law.noStandardSpots=6;
        active.noLongSpots=Law.noLongSpots=0;
        active.noHandiSpots=Law.noHandiSpots=4;
        if(Law.Spot[0].equals("ID")){
            Law.Spot[0]= Law.name;
            for (int j = 1; j < (Law.noStandardSpots + 1); j++) {
                Law.Spot[j] = "standard";
            }
            for (int j = (Law.noStandardSpots + 1); j < (Law.noStandardSpots + Law.noLongSpots + 1); j++) {
                Law.Spot[j] = "long vehicle";
            }
            for (int j = (Law.noStandardSpots + Law.noLongSpots + 1); j < (Law.noSpots + 1); j++) {
                Law.Spot[j] = "handicapped";
            }
        }
        active.Spot=Law.Spot;
        facSelect.setText(Law.name);
        selectedFac=active.name;
        setLPlate();
        setDisplay();
    }
    @FXML
    void onSelectEngineering(ActionEvent event) {
        Engineering.name="Engineering";
        active.noSpots=Engineering.noSpots=10;
        active.noStandardSpots=Engineering.noStandardSpots=3;
        active.noLongSpots=Engineering.noLongSpots=5;
        active.noHandiSpots=Engineering.noHandiSpots=2;
        if(Engineering.Spot[0].equals("ID")){
            Engineering.Spot[0]= Engineering.name;
            for (int j = 1; j < (Engineering.noStandardSpots + 1); j++) {
                Engineering.Spot[j] = "standard";
            }
            for (int j = (Engineering.noStandardSpots + 1); j < (Engineering.noStandardSpots + Engineering.noLongSpots + 1); j++) {
                Engineering.Spot[j] = "long vehicle";
            }
            for (int j = (Engineering.noStandardSpots + Engineering.noLongSpots + 1); j < (Engineering.noSpots + 1); j++) {
                Engineering.Spot[j] = "handicapped";
            }
        }
        active.Spot=Engineering.Spot;
        facSelect.setText(Engineering.name);
        selectedFac=active.name;
        setLPlate();
        setDisplay();
    }
    @FXML
    void onSelectMedicine(ActionEvent event) {
        Medicine.name="Medicine";
        active.noSpots=Medicine.noSpots=10;
        active.noStandardSpots=Medicine.noStandardSpots=5;
        active.noLongSpots=Medicine.noLongSpots=2;
        active.noHandiSpots=Medicine.noHandiSpots=3;
        if(Medicine.Spot[0].equals("ID")){
            Medicine.Spot[0]= Medicine.name;
            for (int j = 1; j < (Medicine.noStandardSpots + 1); j++) {
                Medicine.Spot[j] = "standard";
            }
            for (int j = (Medicine.noStandardSpots + 1); j < (Medicine.noStandardSpots + Medicine.noLongSpots + 1); j++) {
                Medicine.Spot[j] = "long vehicle";
            }
            for (int j = (Medicine.noStandardSpots + Medicine.noLongSpots + 1); j < (Medicine.noSpots + 1); j++) {
                Medicine.Spot[j] = "handicapped";
            }
        }
        active.Spot=Medicine.Spot;
        facSelect.setText(Medicine.name);
        selectedFac=active.name;
        setLPlate();
        setDisplay();
    }

    @FXML
    void onSelectUCSC(ActionEvent event) {
        UCSC.name="UCSC";
        active.noSpots=UCSC.noSpots=10;
        active.noStandardSpots=UCSC.noStandardSpots=7;
        active.noLongSpots=UCSC.noLongSpots=3;
        active.noHandiSpots=UCSC.noHandiSpots=0;
        if(UCSC.Spot[0].equals("ID")){
            UCSC.Spot[0]=UCSC.name;
            for (int j = 1; j < (UCSC.noStandardSpots + 1); j++) {
                UCSC.Spot[j] = "standard";
            }
            for (int j = (UCSC.noStandardSpots + 1); j < (UCSC.noStandardSpots + UCSC.noLongSpots + 1); j++) {
                UCSC.Spot[j] = "long vehicle";
            }
            for (int j = (UCSC.noStandardSpots + UCSC.noLongSpots + 1); j < (UCSC.noSpots + 1); j++) {
                UCSC.Spot[j] = "handicapped";
            }
        }
        active.Spot=UCSC.Spot;
        facSelect.setText(UCSC.name);
        selectedFac=active.name;
        setLPlate();
        setDisplay();
    }
    @FXML
    void onSelectNursing(ActionEvent event) {
        Nursing.name="Nursing";
        active.noSpots=Nursing.noSpots=10;
        active.noStandardSpots=Nursing.noStandardSpots=5;
        active.noLongSpots=Nursing.noLongSpots=1;
        active.noHandiSpots=Nursing.noHandiSpots=4;
        if(Nursing.Spot[0].equals("ID")){
            Nursing.Spot[0]= Nursing.name;
            for (int j = 1; j < (Nursing.noStandardSpots + 1); j++) {
                Nursing.Spot[j] = "standard";
            }
            for (int j = (Nursing.noStandardSpots + 1); j < (Nursing.noStandardSpots + Nursing.noLongSpots + 1); j++) {
                Nursing.Spot[j] = "long vehicle";
            }
            for (int j = (Nursing.noStandardSpots + Nursing.noLongSpots + 1); j < (Nursing.noSpots + 1); j++) {
                Nursing.Spot[j] = "handicapped";
            }
        }
        active.Spot=Nursing.Spot;
        facSelect.setText(Nursing.name);
        selectedFac=active.name;
        setLPlate();
        setDisplay();
    }
    @FXML
    void onSelectSripalee(ActionEvent event) {
        Sripalee.name="Sripalee Campus";
        active.noSpots=Sripalee.noSpots=10;
        active.noStandardSpots=Sripalee.noStandardSpots=9;
        active.noLongSpots=Sripalee.noLongSpots=0;
        active.noHandiSpots=Sripalee.noHandiSpots=1;
        if(Sripalee.Spot[0].equals("ID")){
            Sripalee.Spot[0]= Sripalee.name;
            for (int j = 1; j < (Sripalee.noStandardSpots + 1); j++) {
                Sripalee.Spot[j] = "standard";
            }
            for (int j = (Sripalee.noStandardSpots + 1); j < (Sripalee.noStandardSpots + Sripalee.noLongSpots + 1); j++) {
                Sripalee.Spot[j] = "long vehicle";
            }
            for (int j = (Sripalee.noStandardSpots + Sripalee.noLongSpots + 1); j < (Sripalee.noSpots + 1); j++) {
                Sripalee.Spot[j] = "handicapped";
            }
        }
        active.Spot=Sripalee.Spot;
        facSelect.setText(Sripalee.name);
        selectedFac=active.name;
        setLPlate();
        setDisplay();
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
        if (selectedFac== Science.name){
            Science.Spot= active.Spot;
        }
        setDisplay();
        setLPlate();
        LPlateSelect.setText("Select Vehicle");
        PSpotDisplay1.setText("");
        TypeDisplay.setText("");
    }

}
