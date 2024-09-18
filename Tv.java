package commandPattern;

public class Tv implements Device {

    @Override
    public String switchOn() {
        return "Tv is switched-on!";
    }

    @Override
    public String switchOff() {
        return "Tv is switched-off";
    }
}
