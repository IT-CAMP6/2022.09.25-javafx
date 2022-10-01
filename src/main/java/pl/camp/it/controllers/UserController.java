package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import pl.camp.it.Core;

import java.io.IOException;

public class UserController {

    @FXML
    Label loginLabel;

    @FXML
    Label passwordLabel;

    @FXML
    Label ageLabel;

    public void initialize() {
        this.loginLabel.setText(Core.getInstance().user.getLogin());
        this.passwordLabel.setText(Core.getInstance().user.getPassword());
        this.ageLabel.setText("" + Core.getInstance().user.getAge());
    }

    @FXML
    public void back() throws IOException {
        Core.getInstance().user = null;

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/LoginPane.fxml"));
        AnchorPane pane = loader.load();

        Scene scene = new Scene(pane);

        Core.getInstance().stage.setScene(scene);
    }
}
