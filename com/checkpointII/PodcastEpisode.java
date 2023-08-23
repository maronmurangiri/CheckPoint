package com.checkpointII;

public class PodcastEpisode implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Podcast episode playing");
    }

    @Override
    public void pause() {
        System.out.println("Podcast episode paused");
    }

    @Override
    public void stop() {
        System.out.println("Podcast episode stopped");
    }

    public static void main(String[] args){

        PodcastEpisode podcastEpisode = new PodcastEpisode();
            podcastEpisode.play();
            podcastEpisode.pause();
            podcastEpisode.stop();
    }
}
