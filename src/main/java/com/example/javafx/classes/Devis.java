package com.example.javafx.classes;

import java.util.Date;

public class Devis extends Document {
    private String typeDocument;

    public Devis(Entreprise entreprise, long prixTotal, String typeDocument, Date dateCreation) {
        super(entreprise,prixTotal,dateCreation);
        this.typeDocument = "Devis";
    }

}
