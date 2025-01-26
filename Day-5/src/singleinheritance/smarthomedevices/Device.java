package singleinheritance.smarthomedevices;

public class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayInfo(){
        System.out.println("Device Id : " + deviceId);
        System.out.println("Device status : " + status);

    }
}
