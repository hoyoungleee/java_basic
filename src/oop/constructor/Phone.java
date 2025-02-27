package oop.constructor;

public class Phone {

    String model;
    String color;
    int price;
     /*
     # 생성자 (Constructor)

     1. 생성자는 객체를 생성하는 역할을 하며, 그렇기 때문에
      클래스 내부에 반드시 하나 이상 존재해야 합니다.

     2. 만약 생성자가 하나도 존재하지 않는다면 JVM이 자동으로
      매개변수가 하나도 존재하지 않는 가장 기본 형태의 생성자를
      (default constructor)를 하나 만들어 줍니다.

     3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게
      작성하여 선언하고, 리턴 타입이 존재하지 않습니다.

     4. 생성자 내부에는 객체가 생성되자마자 해야 할 로직들을
      기술할 수 있습니다.
     */
    Phone(){
        model = "갤럭시";
        color = "흰색";
        price = 100;
    }
    /*
     # 생성자 오버로딩 (중복 선언)

     1. 생성자는 중복해서 여러 개 선언이 가능합니다.
     2. 단, 생성자의 매개변수의 타입, 개수, 순서 중 하나가 달라야
        중복을 인정합니다.
     */
    Phone(String device){
        model = device;
        color = "흰색";
        price = 100;
    }
    Phone(String device, int money){
        model = device;
        price = money;
        color = "흰색";


    }

    void showSpec(){
        System.out.println("*** 핸드폰의 정보 ***");
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price + "원");
    }
}
