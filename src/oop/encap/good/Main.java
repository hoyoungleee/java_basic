package oop.encap.good;

public class Main {
    public static void main(String[] args) {
        MyBirth my = new MyBirth();

        //private 변수라 접근되지 못함.
        //my.year = 1231;

        my.setYear(1992);
        System.out.println(my.getYear());
        my.setMonth(12);
        System.out.println(my.getMonth());
        my.setDay(1);
        System.out.println(my.getDay());
        my.birthInfo();
    }
}
