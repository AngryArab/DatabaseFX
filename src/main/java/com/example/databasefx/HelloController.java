package com.example.databasefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onDropButtonClick(ActionEvent actionEvent) {
    }

    public void onCreateTableButtonClick(ActionEvent actionEvent) {
    }

    public void onaddbuttonclick(ActionEvent actionEvent) {
    }

    public void onDeleteButtonClick(ActionEvent actionEvent) {
    }

    public void onSearchButtonClick(ActionEvent actionEvent) {
    }
}