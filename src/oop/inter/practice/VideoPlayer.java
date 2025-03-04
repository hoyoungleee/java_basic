package oop.inter.practice;

public class VideoPlayer implements MediaPlayable{

    @Override
    public void play() {
        System.out.println("비디오가 재생됩니다.");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
