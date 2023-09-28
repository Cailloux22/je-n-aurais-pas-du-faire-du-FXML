package com.example.javafx.classes;

public class Entreprise {
    private String nom;
    private String addresse;

    public Entreprise(String nom, String addresses) {
        this.nom = nom;
        this.addresse = addresses;
    }

    public String getNom() {
        return nom;
    }

    public String getAddresses() {
        return addresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAddresses(String addresses) {
        this.addresse = addresses;
    }
}
