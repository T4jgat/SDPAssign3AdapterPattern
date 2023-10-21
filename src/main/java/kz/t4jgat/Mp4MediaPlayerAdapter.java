package kz.t4jgat;

public class Mp4MediaPlayerAdapter extends Mp4Player implements MediaPlayer{
    @Override
    public void play() {
        this.playMp4();
    }

    @Override
    public void stop() {
        this.stopMp4();
    }

    @Override
    public void pause() {
        this.pauseMp4();
    }
}
