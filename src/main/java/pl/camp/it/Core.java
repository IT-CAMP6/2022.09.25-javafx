package pl.camp.it;

import javafx.stage.Stage;
import pl.camp.it.model.User;

public class Core {
    public User user = null;
    public Stage stage = null;

    private static final Core instance = new Core();

    private Core() {

    }

    public static Core getInstance() {
        return instance;
    }
}
