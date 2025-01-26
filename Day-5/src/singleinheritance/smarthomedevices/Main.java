package singleinheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {
        // creating object of child class
        ThermoState thermostate = new ThermoState(101, "On" , "High");
        // calling method to display status
        thermostate.displayStatus();
    }
}
