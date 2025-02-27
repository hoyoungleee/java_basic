package oop.this_;

public class Player {

    // 필드
    String nickName;
    int level;
    int hp;

    Player() {
        System.out.println("Player의 기본생성자 호출");
        level =1;
        hp = 50;

    }
    Player(String nickName) {
        System.out.println("Player의 2번 생성자 호출");
        System.out.println("this = " + this);
        level =1;
        hp = 50;
        this.nickName = nickName;
        //this를 사용하지 않을거라면 인자에 받는 매개변수명을 필드와 같지 않게 한다.

    }

    /*@Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }*/
}
