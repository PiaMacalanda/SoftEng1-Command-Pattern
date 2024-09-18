package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        
        Device tv = new Tv();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
    
        RemoteControl rc = new RemoteControl();

        // for TV
        Command powerOnTv = new PowerOn(tv);
        rc.setCommand(powerOnTv);
        System.out.println(rc.execute());

        Command powerOffTv = new PowerOff(tv);
        rc.setCommand(powerOffTv);
        System.out.println(rc.execute());

        // for Light
        Command powerOnLight = new PowerOn(light);
        rc.setCommand(powerOnLight);
        System.out.println(rc.execute());

        Command setBrightness = new SetBrightness(light, 75);
        rc.setCommand(setBrightness);
        System.out.println(rc.execute());

        Command powerOffLight = new PowerOff(light);
        rc.setCommand(powerOffLight);
        System.out.println(rc.execute());

        // for Thermostat
        Command powerOnThermostat = new PowerOn(thermostat);
        rc.setCommand(powerOnThermostat);
        System.out.println(rc.execute());

        Command increaseTemp = new IncreaseTemperature(thermostat, 5);
        rc.setCommand(increaseTemp);
        System.out.println(rc.execute());

        Command decreaseTemp = new DecreaseTemperature(thermostat, 3);
        rc.setCommand(decreaseTemp);
        System.out.println(rc.execute());

        Command powerOffThermostat = new PowerOff(thermostat);
        rc.setCommand(powerOffThermostat);
        System.out.println(rc.execute());

        // for Music Player
        Command powerOnMusicPlayer = new PowerOn(musicPlayer);
        rc.setCommand(powerOnMusicPlayer);
        System.out.println(rc.execute());

        Command playPlaylist = new PlayPlaylist(musicPlayer, "Chill Vibes");
        rc.setCommand(playPlaylist);
        System.out.println(rc.execute());

        Command powerOffMusicPlayer = new PowerOff(musicPlayer);
        rc.setCommand(powerOffMusicPlayer);
        System.out.println(rc.execute());
    }
}
