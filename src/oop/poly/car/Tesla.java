package oop.poly.car;

public class Tesla extends Car {

    @Override
    void run() {
        System.out.println("테슬라가 달립니다!");

    }

    public void activeAutoPilot() {
        System.out.println("테슬라의 오토파일럿을 가동합니다.");
    }

}
