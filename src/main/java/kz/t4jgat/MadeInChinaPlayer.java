package kz.t4jgat;

import java.util.Scanner;

class MadeInChinaPlayer {
    Scanner sc = new Scanner(System.in);
    public void runner(WavPlayer wavPlayer) {
        System.out.println("""
                [1] Play
                [2] Pause
                [3] Next
                [4] Prev""");

        int action = sc.nextInt();
        switch (action) {
            case 1 -> wavPlayer.playWav();
            case 2 -> wavPlayer.pauseWav();
            case 3 -> wavPlayer.nextWav();
            case 4 -> wavPlayer.prevWav();
        }
    }
}
