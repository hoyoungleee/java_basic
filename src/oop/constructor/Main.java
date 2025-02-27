package oop.constructor;

public class Main {
    public static void main(String[] args) {

        //기본생성자 없었을때
        Phone basic = new Phone();
        basic.model = "폴더폰";
        basic.color = "회색";
        basic.price = 200000;
        basic.showSpec();
        //기본생성자에 미리 기본값지정했을때
        Phone basic1 = new Phone();
        basic1.showSpec();
        //지정할 값을 생성자로 보내기
        Phone basic2 = new Phone("샤오미");
        basic2.showSpec();
        //지정할 값 여러개 보내기
        Phone basic3 = new Phone("모토로라",4040);
        basic3.showSpec();
    }
}
