package oop.modi.member.pac1;

public class A {
    //필드
    public int f1;
    int f2; //default
    private int f3;


    //생성자
    public A(){}
    public A(double d){}
    private A(boolean b){}

    //메서드
    public void m1(){}
    void m2(){}
    private void m3(){}

    void test(){
        this.f1 = 10;
        this.f2 = 20;
        this.f3 = 30;// 같은 클래스라 허용

        this.m1();
        this.m2();
        this.m3();

        new A(10);
        new A(3.14);
        new A(false);

    }
}
