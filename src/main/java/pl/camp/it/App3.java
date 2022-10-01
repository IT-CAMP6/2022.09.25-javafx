package pl.camp.it;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Core.getInstance().stage = stage;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/LoginPane.fxml"));
        AnchorPane pane = loader.load();

        Scene scene = new Scene(pane);

        stage.setResizable(false);
        stage.setTitle("Logowanie");
        stage.setScene(scene);
        stage.show();
    }
}
