package com.example.javafx.controller;

import com.example.javafx.FactureManager;
import com.example.javafx.ViewSwitcher;
import com.example.javafx.classes.Entreprise;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class EntrepriseController {
    @FXML
    private TextField name;
    @FXML
    private TextField addresse;
    public void create(ActionEvent actionEvent) {
        Entreprise entreprise = new Entreprise(name.getText(),addresse.getText());
        FactureManager.getInstance().addEntreprise(entreprise);
        ViewSwitcher.getInstance().activate("MAIN");
    }


}
