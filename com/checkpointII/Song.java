package com.checkpointII;

public class Song implements  MusicPlayer{
    @Override
    public void play() {
        System.out.println("The song is playing.....");
    }

    @Override
    public void pause() {
        System.out.println("The song has paused.");
    }

    @Override
    public void stop() {
        System.out.println("The song has stopped");
    }
    
    public static void main(String[] args){
        Song song = new Song();
            song.play();
            song.pause();
            song.stop();
    }
}
