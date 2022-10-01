package pl.camp.it;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button1 = new Button("Przycisk");

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Kliknięto w przycisk !!!");
            }
        });

        Button button2 = new Button("Przycisk2");

        button2.setOnAction(e -> System.out.println("Przycisk 2 !!!"));

        FlowPane pane = new FlowPane();
        pane.getChildren().add(button1);
        pane.getChildren().add(button2);

        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Aplikacja");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.show();
    }
}
