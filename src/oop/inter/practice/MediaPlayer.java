package oop.inter.practice;

// 미디어 플레이어 관리 클래스
public class MediaPlayer {
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        // 주어진 media를 mediaList배열에 추가
        MediaPlayable[] temp = new MediaPlayable[mediaList.length+1];
        for (int i = 0; i < mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        temp[mediaList.length] = media;

        mediaList = temp; temp =null;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable m : mediaList) {
            m.play();
        }
    }
}
