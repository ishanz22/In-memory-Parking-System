package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;

public class AddVehicleFormController {

    public static Vehicle[] vehicleArray = new Vehicle[14];

    public JFXTextField txtVehicleNumber;
    public JFXTextField txtMaximumWeight;
    public JFXTextField txtNoOfRassengers;
    public JFXComboBox comboVehicleType;
    public AnchorPane addVehicleAncherPain;
    int nextIndex;


    public void initialize() {
        comboVehicleType.getItems().addAll(new String[]{"Van", "Bus", "Cargo Lorry"});

    }

    public void OnActionAddVehicle(ActionEvent actionEvent) throws IOException {

        if (txtVehicleNumber.getText().isEmpty()
                || comboVehicleType.getSelectionModel().getSelectedItem().toString().isEmpty()
                || txtMaximumWeight.getText().isEmpty()
                || txtNoOfRassengers.getText().isEmpty()) {
            Alert fail = new Alert(Alert.AlertType.ERROR);
            fail.setHeaderText("Empty Fields");
            fail.setContentText("Please fill all the text feilds");
            fail.showAndWait();
        } else {
            port(new Vehicle(txtVehicleNumber.getText(),
                    comboVehicleType.getSelectionModel().getSelectedItem().toString(),
                    txtMaximumWeight.getText(),
                    txtNoOfRassengers.getText()));

            for (int i = 0; i < vehicleArray.length; i++) {
                System.out.println("Vehicle list " + vehicleArray[i]);

            }

            new Alert(Alert.AlertType.CONFIRMATION, "Successfully Added").show();


        }


    }


    public void port(Vehicle v1) {
        vehicleArray[nextIndex++] = v1;
    }
}

