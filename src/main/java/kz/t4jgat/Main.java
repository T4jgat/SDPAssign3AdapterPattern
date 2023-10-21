package kz.t4jgat;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new Mp4MediaPlayerAdapter();

        player.play();
        player.stop();
        player.pause();
    }
}