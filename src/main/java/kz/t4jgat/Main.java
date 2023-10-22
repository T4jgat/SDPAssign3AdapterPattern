package kz.t4jgat;

public class Main {
    public static void main(String[] args) {
        Mp3Player mp3Player = new SimpleMp3Player(); // player which can play only mp3
        MadeInChinaPlayer chinaPlayer = new MadeInChinaPlayer(); // player which can play mp3 and wav beacause of adapter
        chinaPlayer.runner(new PlayerAdapter(mp3Player)); // adapting interfaces
    }
}


