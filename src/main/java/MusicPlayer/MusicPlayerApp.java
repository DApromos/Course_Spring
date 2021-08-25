package MusicPlayer;

public class MusicPlayerApp {
    private Music music;

    //IoC
    public MusicPlayerApp(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
