package com.example.javafx;

import com.example.javafx.classes.Entreprise;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactureManager {
    public static final Scanner SCANNER = new Scanner(System.in);
    private List<Entreprise> listEntreprise=new ArrayList<>( );
    private static FactureManager instance;
    private FactureManager(){
    }

    public static FactureManager getInstance() {
        if (instance == null) {
            instance = new FactureManager();
        }

        return instance;
    }
    public static void start() {
        boolean badAnswer = true;
        while (badAnswer) {
            System.out.println("1 - enregistrer une nouvelle Entreprise");
            System.out.println("2 - créer un devis");
            System.out.println("3 - créer une facture");
            System.out.println("4 - voir la liste des documents");
            System.out.println("5 - generer un document");
            System.out.println("6 - quitter");
            try {
                int rep = Integer.parseInt(SCANNER.nextLine());
                switch (rep) {
                    case 1:


                        break;
                    case 2:

                        break;
                    case 3:


                        break;
                    case 4:


                        break;
                    case 5:


                        break;

                    case 6:
                        badAnswer = false;
                        System.out.println("STOP");
                        break;
                    default:
                        System.out.println("Veuillez saisir un chiffre valide");
                        System.out.println(rep);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Veuillez saisir un chiffre valide");
            }
        }
    }


    public List<Entreprise> getListEntreprise() {
        return listEntreprise;
    }
    public void  addEntreprise(Entreprise e){

        System.out.println("entreprise "+e +"ajouté");
        this.listEntreprise.add(e);
    }
}
