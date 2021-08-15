package MusicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextMusic.xml");

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayerApp musicPlayer = new MusicPlayerApp(music);
        musicPlayer.playMusic();

        context.close();
    }
}
