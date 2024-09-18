package commandPattern;

public class SetBrightness implements Command {
    private Light light;
    private int level;

    public SetBrightness(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public String execute() {
        return light.setBrightness(level);
    }
}
