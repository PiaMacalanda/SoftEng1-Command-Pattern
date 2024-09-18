package commandPattern;

public class Light implements Device {
    @Override
    public String switchOn() {
        return "Light is turned on!";
    }

    @Override
    public String switchOff() {
        return "Light is turned off";
    }

    public String setBrightness(int level) {
        return "Light brightness set to " + level + "%";
    }
}