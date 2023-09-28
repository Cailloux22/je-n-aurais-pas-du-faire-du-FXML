package com.example.javafx.classes;

import com.example.javafx.classes.Document;
import com.example.javafx.classes.Entreprise;

import java.util.Date;

public class Facture extends Document {
    private String typeDocument;
    private String echeance;
    private String numFacture;
    private long numCommande;

    public Facture(Entreprise entreprise, long prixTotal, String typeDocument, String echeance, String numFacture, Date dateCreation, long numCommande) {
        super(entreprise, prixTotal,dateCreation);
        this.typeDocument = "Facture";
        this.echeance = echeance;
        this.numFacture = numFacture;
        this.numCommande = numCommande;
    }
}
