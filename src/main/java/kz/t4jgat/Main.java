package kz.t4jgat;

public class Main {
    public static void main(String[] args) {
        Mp3Player mp3Player = new SimpleMp3Player();
        MadeInChinaPlayer chinaPlayer = new MadeInChinaPlayer();
        chinaPlayer.runner(new PlayerAdapter(mp3Player));
    }
}


