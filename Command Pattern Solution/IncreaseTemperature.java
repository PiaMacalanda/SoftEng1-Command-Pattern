package commandPattern;

public class IncreaseTemperature implements Command {
    
    private Thermostat thermostat;
    private int degrees;

    public IncreaseTemperature(Thermostat thermostat, int degrees) {
        this.thermostat = thermostat;
        this.degrees = degrees;
    }

    @Override
    public String execute() {
        return thermostat.increaseTemperature(degrees);
    }
}
