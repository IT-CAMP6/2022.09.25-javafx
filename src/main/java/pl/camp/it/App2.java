package pl.camp.it;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/Pane1.fxml"));
        FlowPane flowPane = loader.load();
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();
    }
}
