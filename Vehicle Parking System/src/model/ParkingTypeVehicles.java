package model;

public class ParkingTypeVehicles {
    private String vehicleNumber;
    private String vehicleType;
    private String driverName;
    private String ParkingSlotNumber;
    private String date;
    private String time;


    public ParkingTypeVehicles() {
    }

    public ParkingTypeVehicles(String vehicleNumber, String vehicleType, String driverName, String parkingSlotNumber, String date, String time) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
        this.ParkingSlotNumber = parkingSlotNumber;
        this.date = date;
        this.time = time;

    }



    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getParkingSlotNumber() {
        return ParkingSlotNumber;
    }

    public void setParkingSlotNumber(String parkingSlotNumber) {
        ParkingSlotNumber = parkingSlotNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    @Override
    public String toString() {
        return "ParkingTypeVehicles{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", driverName='" + driverName + '\'' +
                ", ParkingSlotNumber='" + ParkingSlotNumber + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
