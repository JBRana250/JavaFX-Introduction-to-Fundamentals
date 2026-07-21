package nz.ac.auckland.se206;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.Parent;

public class SceneManager {
    public enum AppUi {
        MUSIC_PLAYER, COUNTER
    }

    private static Map<AppUi, Parent> sceneMap = new HashMap<>();

    public static void AddUi(AppUi appUi, Parent uiRoot) {
        sceneMap.put(appUi, uiRoot);
    }

    public static Parent getUiRoot(AppUi appUi) {
        return sceneMap.get(appUi);
    }
}