package com.alfin.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author Alfin Liunardi Senjaya 1672034
 *
 */

public class DemoMainController {
    @FXML
    private TextField txtInput;
    @FXML
    private Label lblOutput;

    @FXML
    private void sendQueryAction(ActionEvent actionEvent){
        if(!txtInput.getText().trim().isEmpty()){
            lblOutput.setText(txtInput.getText().trim());
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill input");
            alert.showAndWait();
        }
    }
}
