package com.example.javafx.controller;

import com.example.javafx.ViewSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    int count =0;
    @FXML
    private Label welcomeText;
    @FXML
    private Label dcount;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        count++;
        dcount.setText(String.valueOf(count));
    }


    public void onENTREPRISEButtonClick(ActionEvent actionEvent) {
        ViewSwitcher.getInstance().activate("ENTREPRISE");
    }
    public void onDOCUMENTSButtonClick(ActionEvent actionEvent) {
        ViewSwitcher.getInstance().activate("DOCUMENTS");
    }
    public void onFACTURESButtonClick(ActionEvent actionEvent) {
        ViewSwitcher.getInstance().activate("FACTURES");
    }
    public void onDEVISButtonClick(ActionEvent actionEvent) {
        ViewSwitcher.getInstance().activate("DEVIS");
    }
}