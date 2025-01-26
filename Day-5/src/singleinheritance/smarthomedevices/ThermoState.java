package singleinheritance.smarthomedevices;

public class ThermoState extends Device{
    String temperatureSetting;

    ThermoState(int deviceId, String status, String temperatureSetting){
        // inheriting constructor using super keyword
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus(){
        // inheriting method using super keyword
        super.displayInfo();
        System.out.println("Temperature setting : " + temperatureSetting);
    }
}
