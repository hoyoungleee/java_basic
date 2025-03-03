package oop.inter;

//인터페이스를 구현하는 구현체 클래스는 반드시 모든 추상 메서드를 재정의 해야 합니다.
public class KeyboardController implements GameController {


    @Override
    public void moveCharacter(String direction) {
        System.out.println("키보드 "+ direction+ " 키를 눌러 이동");

    }


    @Override
    public void action() {
        System.out.println("스페이스바를 눌러 점프");
    }

    @Override
    public void pause() {
        System.out.println("esc 눌러 일시정지");
    }
}
