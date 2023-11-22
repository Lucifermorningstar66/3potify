import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {
    private Clip clip;
    private long clipMicrosecondPosition;

    public void playMusic (String filePath) {
        try {
            if (clip == null) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
            }

            if (!clip.isRunning()) {
                clip.setMicrosecondPosition(clipMicrosecondPosition);
                clip.start();
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void pauseMusic () {
        if (clip != null && clip.isRunning()) {
            clipMicrosecondPosition = clip.getMicrosecondPosition();
            clip.stop();
        }
    }
}