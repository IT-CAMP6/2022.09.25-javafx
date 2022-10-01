package pl.camp.it.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class SimpleController {

    @FXML
    Button przycisk1;

    @FXML
    CheckBox checkbox;

    @FXML
    Button przycisk2;

    @FXML
    public void buttonClick(ActionEvent actionEvent) {
        System.out.println("Click !!");

        if(actionEvent.getSource() instanceof Button) {
            System.out.println("Kliknięto w przycisk !!");
        } else if(actionEvent.getSource() instanceof CheckBox) {
            System.out.println("Kliknięto w checkbox !!");
        }
    }
}
