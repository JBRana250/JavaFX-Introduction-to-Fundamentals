package nz.ac.auckland.se206.controllers;

import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import nz.ac.auckland.se206.App;
import nz.ac.auckland.se206.SceneManager;
import nz.ac.auckland.se206.SceneManager.AppUi;

public class MusicPlayerController {

    MediaPlayer player;
    
    @FXML
    private Button firstSongButton;
    @FXML
    private Button secondSongButton;
    @FXML
    private Button switchButton;

    private final String firstSongPath = "/sounds/looking-forward-131923.mp3";
    private final String secondSongPath = "/sounds/risk-136788.mp3";

    @FXML
    private void playFirstSong() {
        playSong(firstSongPath);
    }

    @FXML
    private void playSecondSong() {
        playSong(secondSongPath);
    }

    private void playSong(String songPath) {
        try {
            Media sound = new Media(App.class.getResource(songPath).toURI().toString());
            if (player != null) {
                player.stop();
            }
            player = new MediaPlayer(sound);
            player.play();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
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
