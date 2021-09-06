package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ParkingTypeVehicles;

import java.io.IOException;
import java.net.URL;

public class ManagerFormController {
    public AnchorPane mangerFormTableAncherPain;
    public JFXComboBox cmbancherpainchange;
    public AnchorPane context;

    private void setUi(String location) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.
                load(this.getClass().
                        getResource("../view/" + location + ".fxml")));
    }



    public void OnActionAddVehicle(ActionEvent actionEvent) throws IOException {

                Scene scene =
                new Scene(FXMLLoader.load(getClass()
                        .getResource("../view/AddVehicleForm.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void OnActionAddDriver(ActionEvent actionEvent) throws IOException {
        Scene scene =
                new Scene(FXMLLoader.load(getClass()
                        .getResource("../view/AddDriverForm.fxml")));
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void OnActionLogOutButton(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) this.context.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass()
                .getResource("../view/DefaultForm.fxml"))));
        window.centerOnScreen();


    }

    public void OnActionInParking(ActionEvent actionEvent) throws IOException {
        setUi("VehicleForm");
    }

    public void OnActionOnDelivery(ActionEvent actionEvent) throws IOException {
        setUi("DriverForm");
    }
}
