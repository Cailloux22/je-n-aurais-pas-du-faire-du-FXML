package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));

        stage.setTitle("Hello!");
//        ViewSwitcher.getInstance().add("MAIN", fxmlLoader.load(getClass().getResource( View.MAIN.getFileName() )));
        ViewSwitcher.getInstance().add("MAIN",       FXMLLoader.load(Main.class.getResource( View.MAIN.getFileName()       )));
        ViewSwitcher.getInstance().add("DOCUMENTS",  FXMLLoader.load(Main.class.getResource( View.DOCUMENTS.getFileName()  )));
        ViewSwitcher.getInstance().add("ENTREPRISE", FXMLLoader.load(Main.class.getResource( View.ENTREPRISE.getFileName() )));
        ViewSwitcher.getInstance().add("DEVIS",      FXMLLoader.load(Main.class.getResource( View.DEVIS.getFileName()      )));
        ViewSwitcher.getInstance().add("FACTURES",   FXMLLoader.load(Main.class.getResource( View.FACTURES.getFileName()   )));
        ViewSwitcher.getInstance().activate("MAIN");
        stage.setScene(ViewSwitcher.getInstance().getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}