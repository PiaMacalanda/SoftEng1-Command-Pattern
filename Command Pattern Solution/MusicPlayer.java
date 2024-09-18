package commandPattern;

public class MusicPlayer implements Device {
    
    @Override
    public String switchOn() {
        return "Music Player is playing music!";
    }

    @Override
    public String switchOff() {
        return "Music Player is turned off";
    }

    public String playPlaylist(String playlist) {
        return "Music Player is playing playlist: " + playlist;
    }
}
