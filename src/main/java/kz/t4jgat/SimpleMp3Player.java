package kz.t4jgat;

// Player which can only play music in mp3 format
class SimpleMp3Player implements Mp3Player {

    @Override
    public void play() {
        System.out.println("Play music...");
    }

    @Override
    public void pause() {
        System.out.println("Pause music...");
    }

    @Override
    public void next() {
        System.out.println("Next track...");
    }

    @Override
    public void prev() {
        System.out.println("Previous track...");
    }
}
