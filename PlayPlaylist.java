package commandPattern;

public class PlayPlaylist implements Command {
    
    private MusicPlayer musicPlayer;
    private String playlist;

    public PlayPlaylist(MusicPlayer musicPlayer, String playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    @Override
    public String execute() {
        return musicPlayer.playPlaylist(playlist);
    }
}
