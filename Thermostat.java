package commandPattern;

public class Thermostat implements Device {
    @Override
    public String switchOn() {
        return "Thermostat is set to a comfortable temperature!";
    }

    @Override
    public String switchOff() {
        return "Thermostat is turned off";
    }

    public String increaseTemperature(int degrees) {
        return "Thermostat temperature increased by " + degrees + " degrees!";
    }

    public String decreaseTemperature(int degrees) {
        return "Thermostat temperature decreased by " + degrees + " degrees!";
    }
}
