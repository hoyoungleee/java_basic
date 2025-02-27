package oop.pac;

import oop.pac.fruits.Apple;
import oop.pac.fruits.Banana;
import oop.pac.fruits.Melon;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Melon melon = new Melon();
        // 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 떄는
        // 반드시 패키지 경로를 직접 표시해 주어야 합니다.
        oop.pac.juice.Apple apple1 = new oop.pac.juice.Apple();

    }
}
