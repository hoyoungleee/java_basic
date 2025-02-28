package oop.modi.cls.pac1;

//public 접근제한자는 접근 제한이 없다.(어디서나 접근 가능)
public class B {
    // 클래스 A의 접근제한자는 default.
    // 동일 패키지 내부의 클래스는 접근을 허용
    A a = new A();
}
