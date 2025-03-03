package oop.abs;
/*
- 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
 프로그래머의 오버라이딩 실수를 방지할 수 있고, 부모 클래스에서
 메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
 구현하기가 편합니다.

- 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
*/
public class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle("빨강", 5.0 );
        Shape c2 = new Circle("빨강", 3.0 );
        Triangle t1 = new Triangle("노랑",3.0, 4.0, 5.0);
        Triangle t2 = new Triangle("노랑",7.0, 4.0, 6.0);

        // 추상 클래스는 구현되지 않으면 스스로 객체 생성이 불가능 하다.
        // 자식객체를 통해 실체화가가능합니다.(객체 생성이 안되는 것 아님.)
        //Shape s1 = new Shape();

        Shape[] shapes = {c1,c2,t1,t2};
        for (Shape s : shapes) {
            s.displayInfo();
        }
    }
}
