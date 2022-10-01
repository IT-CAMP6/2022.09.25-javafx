package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import pl.camp.it.Core;
import pl.camp.it.model.User;

import java.io.IOException;
import java.util.Random;

public class LoginController {

    @FXML
    TextField loginTextField;

    @FXML
    PasswordField passwordField;

    @FXML
    public void login() throws IOException {
        String login = this.loginTextField.getText();
        String password = this.passwordField.getText();

        if(login.equals("admin") && password.equals("admin")) {
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            Random random = new Random();
            user.setAge(random.nextInt(100));
            Core.getInstance().user = user;

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/fxml/UserPane.fxml"));
            AnchorPane pane = loader.load();

            Scene scene = new Scene(pane);

            Core.getInstance().stage.setScene(scene);
        } else {
            this.loginTextField.setStyle("-fx-text-inner-color: #ff4338;");
            this.passwordField.setStyle("-fx-text-inner-color: #ff4338;");
        }
    }
}
