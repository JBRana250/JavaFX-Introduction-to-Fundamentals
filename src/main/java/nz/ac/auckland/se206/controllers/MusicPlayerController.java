package nz.ac.auckland.se206.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import nz.ac.auckland.se206.App;

public class MusicPlayerController {
    
    @FXML
    private Button firstSongButton;
    @FXML
    private Button secondSongButton;
    @FXML
    private Button switchButton;

    @FXML
    private void playFirstSong() {

    }

    @FXML
    private void playSecondSong() {

    }

    @FXML
    private void switchScene(ActionEvent event) {
        Button button = (Button) event.getSource();
        Scene scene = button.getScene();

        try {
            scene.setRoot(App.loadFXML("counter"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
