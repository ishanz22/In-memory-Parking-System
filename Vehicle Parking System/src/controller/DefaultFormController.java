package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;
import model.ParkingTypeVehicles;
import model.Vehicle;
import model.VehicleType;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class DefaultFormController implements Initializable {

    public AnchorPane securityAncherPain;
    public JFXTextField txtVehicleType;
    public JFXComboBox comSelectVehicle;
    public JFXComboBox comDriverName;
    public JFXTextField txtYourParkingSpot;
    public Label lbldate;
    public Label lbltime;

    int nextindex,index2;
    public static ParkingTypeVehicles parkingTypeVehicles[] = new ParkingTypeVehicles[14];
    public static ParkingTypeVehicles onDilivaryVehicle[] =new ParkingTypeVehicles[14];

    public void OnActionVehiclePark(ActionEvent actionEvent) {
        port(new ParkingTypeVehicles(comSelectVehicle.getSelectionModel().getSelectedItem().toString(),txtVehicleType.getText(), comDriverName.getSelectionModel().getSelectedItem().toString(), txtYourParkingSpot.getText(),lbldate.getText(), lbltime.getText()));
        for (int i = 0; i < parkingTypeVehicles.length; i++) {
            System.out.println("Vehicle park "+ parkingTypeVehicles[i]);
        }
        new Alert(Alert.AlertType.CONFIRMATION,"Successfuly added").show();
    }

    public void OnActionDilivaryShift(ActionEvent actionEvent) {
        port1(new ParkingTypeVehicles( comSelectVehicle.getSelectionModel().getSelectedItem().toString(),txtVehicleType.getText(), comDriverName.getSelectionModel().getSelectedItem().toString(), txtYourParkingSpot.getText(),lbldate.getText(), lbltime.getText()));
        comSelectVehicle.getSelectionModel().getSelectedItem().toString();
        for (int i = 0; i < parkingTypeVehicles.length; i++) {
            if (parkingTypeVehicles[i].getVehicleNumber().equals(comSelectVehicle.getSelectionModel().getSelectedItem().toString())) {
                break;
            }


        }
            for (int i = 0; i < onDilivaryVehicle.length; i++) {
                System.out.println(onDilivaryVehicle[1]);
            }
            new Alert(Alert.AlertType.CONFIRMATION,"Successfuly added").show();
            for (int i = 0; i < parkingTypeVehicles.length; i++) {
                System.out.println("Vehicle park "+ parkingTypeVehicles[i]);
            }
        }

    

    public void OnActionManagerLogin(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) securityAncherPain.getScene().getWindow();
        window.setScene(new Scene(load));



    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        AddVehicleFormController.vehicleArray[0] = new Vehicle("KA-4563", " Van ", "1000", " 7");
        AddVehicleFormController.vehicleArray[1] = new Vehicle("CCB-3568", " Van", " 1800", " 8");
        AddVehicleFormController.vehicleArray[2] = new Vehicle("58-3567", " Van", " 1500", " 4");
        AddVehicleFormController.vehicleArray[3] = new Vehicle("GF-4358", " Van", " 800", " 4");
        AddVehicleFormController.vehicleArray[4] = new Vehicle("YQ-3536", "Cargo Lorry", "2000", "2");
        AddVehicleFormController.vehicleArray[5] = new Vehicle("QH-3444", "Cargo Lorry ", "5000", " 4");
        AddVehicleFormController.vehicleArray[6] = new Vehicle("CBB-3566", "Cargo Lorry ", "2500", "2");
        AddVehicleFormController.vehicleArray[7] = new Vehicle("KB-3668 ", "Cargo Lorry", "2500", "2");
        AddVehicleFormController.vehicleArray[8] = new Vehicle("JJ-9878 ", "Cargo Lorry ", "3000 ", "2");
        AddVehicleFormController.vehicleArray[9] = new Vehicle("GH-5772 ", "Cargo Lorry,", "4000 ", "3");
        AddVehicleFormController.vehicleArray[10] = new Vehicle("XY-4456 ", "Cargo Lorry ", "3500 ", "2");
        AddVehicleFormController.vehicleArray[11] = new Vehicle("LM-6679", " Van", " 1500", "4");
        AddVehicleFormController.vehicleArray[12] = new Vehicle("QA-3369", " Van", "1800", " 6");
        AddVehicleFormController.vehicleArray[13] = new Vehicle("NA-3434", " Bus", " 3500", " 60");

        AddDriverFormController.driverArray[0] = new Driver("Sumith Kumara", "7835348345V", "B6474845", "Panadura", "0725637456");
        AddDriverFormController.driverArray[1] = new Driver("Amila Pathirana", "8826253734V", "B3354674", "Galle", "0717573583");
        AddDriverFormController.driverArray[2] = new Driver("Jithmal Perera ", "9283289272V", "B3674589", "Horana", "0772452457");
        AddDriverFormController.driverArray[3] = new Driver("Sumith Dissanayaka", "9425245373V", "B8366399", "Kaluthara", "0782686390");
        AddDriverFormController.driverArray[4] = new Driver("Sumanasiri Herath ", "8976544373V", "B3537538", "Beruwala", "0772534436");
        AddDriverFormController.driverArray[5] = new Driver("Awantha Fernando ", "9173537839V", "B3554789", "Colombo 5", "0714534356");
        AddDriverFormController.driverArray[6] = new Driver("Charith Sudara ", "9573536833V", "B6835836", "Baththaramulla", " 0771536662");
        AddDriverFormController.driverArray[7] = new Driver("Prashan Dineth ", "9362426738V", "B2683536", "Wadduwa", "0715353434");
        AddDriverFormController.driverArray[8] = new Driver("Chethiya Dilan ", "9162353436V", "B6836836 ", "Panadura", "0772436737");
        AddDriverFormController.driverArray[9] = new Driver("Dushantha Perera", "9255556343V", "B3334435", "Matara", "0777245343");
        AddDriverFormController.driverArray[10] = new Driver("Sumith Udayanga ", "8735354355V", "B3573783", "Galle", "0703635442");
        AddDriverFormController.driverArray[11] = new Driver("Dinesh Udara", "9026344373V", "B5343783", "Hettimulla", "0713456878");
        AddDriverFormController.driverArray[12] = new Driver("Udana Chathuranga", "9692653338V", "B7888632", "Kottawa", "0772442444");
        AddDriverFormController.driverArray[13] = new Driver("Mohommad Riaz", "9124537733V", "B3638537", "Kaluthara", "0777544222");
        AddDriverFormController.driverArray[14] = new Driver("Sandun Kumara ", "9563524267V", "B2263333", "Panadura", "0772325544");
        AddDriverFormController.driverArray[15] = new Driver("Priyanga Perera", " 9135343537V", " B3853753", " Matara", "0723344562");

        for (int i = 0; i < AddVehicleFormController.vehicleArray.length; i++) {
            comSelectVehicle.getItems().add(i, AddVehicleFormController.vehicleArray[i].getVehicleNumber());
        }
        for (Driver driver : AddDriverFormController.driverArray) {
            comDriverName.getItems().add(driver.getDriverName());
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        lbldate.setText(formatter.format(date));

        Thread t1 = new Thread(() -> {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final String time = format.format(new Date());
                Platform.runLater(() -> {
                    lbltime.setText(time);
                });
            }
        });
        t1.start();

    }



    @FXML
    public void comSelectVehicle_onAction(ActionEvent event) {
        comSelectVehicle.getSelectionModel().getSelectedItem().toString();
        for (int i = 0; i < AddVehicleFormController.vehicleArray.length; i++) {
            if (AddVehicleFormController.vehicleArray[i].getVehicleNumber().equals(comSelectVehicle.getSelectionModel().getSelectedItem().toString())) {
                txtVehicleType.setText(AddVehicleFormController.vehicleArray[i].getVehicleType());
                txtYourParkingSpot.setText(String.valueOf(i + 1));
                break;
            }
        }
    }

    public void port(ParkingTypeVehicles parkingTypeVehicles1){
        parkingTypeVehicles[nextindex++]=parkingTypeVehicles1;
    }

    public void port1(ParkingTypeVehicles parkingTypeVehicles2){
        onDilivaryVehicle[index2++]=parkingTypeVehicles2;
    }

}


