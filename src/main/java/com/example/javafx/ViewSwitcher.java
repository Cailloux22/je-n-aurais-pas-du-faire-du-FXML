package com.example.javafx;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

public class ViewSwitcher {
    private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene main ;

    private static ViewSwitcher instance;

    private ViewSwitcher() {
        this.main= new Scene(new Pane());
    }
    public static ViewSwitcher getInstance() {
        if (instance == null) {
            instance = new ViewSwitcher();
        }

        return instance;
    }
    public Scene getScene(){
        return main;
    }
    public void add(String name, Pane pane){
        screenMap.put(name, pane);
    }

    public void removeScreen(String name){
        screenMap.remove(name);
    }

    public void activate(String name){
        main.setRoot( screenMap.get(name) );
    }
}