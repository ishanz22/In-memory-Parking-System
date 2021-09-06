package model;

public class Driver {
    private String driverName;
    private String nic;
    private String drivingLicenseNum;
    private String address;
    private String  contactNumber;

    public Driver() {
    }

    public Driver(String driverName, String nic, String drivingLicenseNum, String address, String contactNumber) {
        this.driverName = driverName;
        this.nic = nic;
        this.drivingLicenseNum = drivingLicenseNum;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDrivingLicenseNum() {
        return drivingLicenseNum;
    }

    public void setDrivingLicenseNum(String drivingLicenseNum) {
        this.drivingLicenseNum = drivingLicenseNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }



    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", nic='" + nic + '\'' +
                ", drivingLicenseNum='" + drivingLicenseNum + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
