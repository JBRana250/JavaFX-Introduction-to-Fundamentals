package nz.ac.auckland.se206.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import nz.ac.auckland.se206.SceneManager;
import nz.ac.auckland.se206.SceneManager.AppUi;

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
        scene.setRoot(SceneManager.getUiRoot(AppUi.COUNTER));
    }

    @FXML 
    private void initialize() {
        System.out.println("Initializing Music Controller" + this);
    }
}
