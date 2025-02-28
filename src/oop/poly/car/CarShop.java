package oop.poly.car;

public class CarShop {

    /*
       Mammals
          |
        Person
          |
       Student

       Mammals m = new Student();
       m instanceof Person -> ??? (true)
       
       instanceof는 동등비교가 아닌 우항 타입으로 대입되고 오류가 있는지를 판단. 혼동 주의
       그래서 애초에 제일 마지막 자식 클래스로 비교하던가 instanceof를 여러번 더 써서
       유효성을 구분해야한다. 
    */
    public void carPrice(Car c){
        if(c instanceof Sonata){
            System.out.println("소나타 9000원");
        } else if(c instanceof Tesla){
            System.out.println("테슬라 9000원");

        }else if(c instanceof Porsche){
            System.out.println("포르쉐 9000원");

        }
    }
}
