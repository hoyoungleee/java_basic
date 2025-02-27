package oop.basic;

public class Main {

    /*
    설계도에 작성된 것만으로 구현이 안됨.
    main 함수에서 클래스를 호출하여 객체를 생생 후 써야함.
    * */

    public static void main(String[] args) {
        //생성시 생성자를 통해 초기화 하는 법
        Pen redPen = new Pen("빨강", 1000);

        redPen.write();
        redPen.priceInfo();

        //직접 지정
        //참조연산자(.)를 통해 객체로 접근한 후
        //속성을 지정하고 기능을 사용할 수 있습니다.
        Pen bluePen = new Pen();
        bluePen.color = "파랑";
        bluePen.price = 1200;

        bluePen.write();
        bluePen.priceInfo();

    }

}
