package controller;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;

import java.io.IOException;
import java.net.URL;

public class AddDriverFormController {
    public AnchorPane addDriverAncherpain;
    public JFXTextField txtDriverName;
    public JFXTextField txtNIC;
    public JFXTextField txtDrivingLicenseNumber;
    public JFXTextField txtContactNumber;
    public JFXTextArea txtAddress;

    public static Driver[] driverArray = new Driver[16];
    int nextIndex;

    public void OnActionAddDriver(ActionEvent actionEvent) throws IOException {

//        if (driverArray[nextIndex]==null) {
//            if (txtDriverName.getText().isEmpty() || txtNIC.getText().isEmpty() || txtDrivingLicenseNumber.getText().isEmpty() || txtAddress.getText().isEmpty() || txtContactNumber.getText().isEmpty()) {
//                new Alert(Alert.AlertType.ERROR, "Please full all the text feilds ").show();
//                return;
//            }



//            port(new Driver(txtDriverName.getText(),
//                    txtNIC.getText(),
//                    txtDrivingLicenseNumber.getText(),
//                    txtAddress.getText(),
//                    txtContactNumber.getText()));
//        for (int i = 0; i < driverArray.length ; i++) {
//            System.out.println("driver list "+ driverArray[i]);
//
//        }
//
//            new Alert(Alert.AlertType.CONFIRMATION, "Successfully added ").show();

//        if(driverArray[nextIndex]==null) {
           if (txtDriverName.getText().isEmpty() || txtNIC.getText().isEmpty() || txtDrivingLicenseNumber.getText().isEmpty() || txtAddress.getText().isEmpty() || txtContactNumber.getText().isEmpty()){
            Alert fail= new Alert(Alert.AlertType.ERROR);
            fail.setHeaderText("Empty Fields");
            fail.setContentText("Please fill all the text feilds");
            fail.showAndWait();
        } else {

            port(new Driver(txtDriverName.getText(),
                    txtNIC.getText(),
                    txtDrivingLicenseNumber.getText(),
                    txtAddress.getText(),
                    txtContactNumber.getText()));
        for (int i = 0; i < driverArray.length ; i++) {
            System.out.println("driver list "+ driverArray[i]);

        }

            new Alert(Alert.AlertType.CONFIRMATION, "Successfully added ").show();
        }


    }

    public void port(Driver  d1){
            driverArray[nextIndex++] = d1;
    }
}

