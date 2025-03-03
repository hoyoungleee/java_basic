package oop.inter;

//인터페이스를 구현하는 구현체 클래스는 반드시 모든 추상 메서드를 재정의 해야 합니다.
//인터페이스는 동시에 다중 구현도 가능합니다.
public class JoystickController implements Vibration, AdvancedController {

    @Override
    public void specialAction() {

    }

    @Override
    public void customizeButton(String config) {

    }

    @Override
    public void moveCharacter(String direction) {
        System.out.println("조이스틱 "+ direction+ " 키를 눌러 이동");

    }


    @Override
    public void action() {
        System.out.println("A버튼을 눌러 점프");
    }

    @Override
    public void pause() {
        System.out.println("start 버튼을 눌러 일시정지");
    }

    @Override
    public void vibrate(int intensity) {

    }

    @Override
    public void offVibrate() {

    }
}
