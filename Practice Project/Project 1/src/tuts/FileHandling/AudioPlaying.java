package tuts.FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class AudioPlaying {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scan = new Scanner(System.in);

        File file = new File("Rick Astley - Never Gonna Give You Up (Official Music Video).wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String response = "";
        while (!response.equals("q")) {
            System.out.println("p = play, s = stop, r = reset, q = quit");
            System.out.print("Enter Music Command: ");
            response = scan.next();
            response.toLowerCase();
            switch (response) {
                case "p":
                    clip.start();
                    break;
                case "s":
                    clip.stop();
                    break;
                case "q":
                    clip.close();
                    break;
                case "r":
                    clip.setFramePosition(0);
                    break;

                default:
                    System.out.println("Not a valid response;");
                    break;
            }

        }
        scan.close();
        System.out.println("GET ROLLING!");

    }
}
