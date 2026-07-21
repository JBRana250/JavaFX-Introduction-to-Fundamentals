package nz.ac.auckland.se206.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import nz.ac.auckland.se206.App;

public class CounterController {

    private int count = 0;

    @FXML
    private Button incrementButton;
    @FXML
    private Button decrementButton;
    @FXML
    private Button resetButton;
    @FXML
    private Button switchButton;
    @FXML
    private Label numberLabel;

    @FXML
    private void increment() {
        count++;
        updateLabel();
    }

    @FXML
    private void decrement() {
        count--;
        updateLabel();
    }

    @FXML
    private void reset() {
        count = 0;
        updateLabel();
    }

    @FXML
    private void updateLabel() {
        numberLabel.setText(String.valueOf(count));
    }

    @FXML
    private void switchScene(ActionEvent event) {
        Button button = (Button) event.getSource();
        Scene scene = button.getScene();

        try {
            scene.setRoot(App.loadFXML("musicplayer"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}