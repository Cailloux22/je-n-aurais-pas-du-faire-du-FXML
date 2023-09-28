package com.example.javafx;

public enum View {
    ENTREPRISE("entreprise.fxml"),
    MAIN("hello-view.fxml"),
    DEVIS("devis.fxml"),
    FACTURES("factures.fxml"),
    DOCUMENTS("documents.fxml");
    private final String fileName;
    View(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }
}