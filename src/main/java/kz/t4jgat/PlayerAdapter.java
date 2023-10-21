package kz.t4jgat;

class PlayerAdapter implements WavPlayer {
    Mp3Player mp3Player;

    public PlayerAdapter(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void playWav() {
        mp3Player.play();
    }

    @Override
    public void pauseWav() {
        mp3Player.pause();
    }

    @Override
    public void nextWav() {
        mp3Player.next();
    }

    @Override
    public void prevWav() {
        mp3Player.prev();
    }
}
