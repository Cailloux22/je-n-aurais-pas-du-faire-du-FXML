package com.example.javafx.classes;

import java.util.Date;

public abstract class Document {
    private Entreprise entreprise;
    private long prixTotal;
    private Date dateCreation;
    public Document(Entreprise entreprise, long prixTotal, Date dateCreation) {
        this.entreprise = entreprise;
        this.prixTotal = prixTotal;
        this.dateCreation = dateCreation;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public void setPrixTotal(long prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public long getPrixTotal() {
        return prixTotal;
    }
}
