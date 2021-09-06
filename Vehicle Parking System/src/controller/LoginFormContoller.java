package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;

public class LoginFormContoller {
    public AnchorPane securityFormAncherPain;
    public JFXTextField txtUserName;
    public JFXPasswordField txtPassword;



    public void OnActionCancle(ActionEvent actionEvent) throws IOException {

        URL resource = this.getClass().getResource("../view/DefaultForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)securityFormAncherPain.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OnActionLogin(ActionEvent actionEvent) throws IOException {
        final String username = "admin";
        final String password = "1234";
        String getName=txtUserName.getText();
        String getPassword=txtPassword.getText();

            if (getName.equals(username) && getPassword.equals(password)) {
                URL resource = this.getClass().getResource("../view/ManagerForm.fxml");
                Parent load = FXMLLoader.load(resource);
                Stage window = (Stage) securityFormAncherPain.getScene().getWindow();
                window.setScene(new Scene(load));
            }else{
                new Alert(Alert.AlertType.ERROR,"Chek the username or the password is incorrect").show();
                setText();
            }


        }
    public void setText(){
        txtUserName.setText("");
        txtPassword.setText("");
    }



}
