package commandPattern;

public class DecreaseTemperature implements Command {
    
    private Thermostat thermostat;
    private int degrees;

    public DecreaseTemperature(Thermostat thermostat, int degrees) {
        this.thermostat = thermostat;
        this.degrees = degrees;
    }

    @Override
    public String execute() {
        return thermostat.decreaseTemperature(degrees);
    }
}
