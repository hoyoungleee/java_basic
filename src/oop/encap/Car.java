package oop.encap;

import java.util.Calendar;

public class Car {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null && brand.equals("")){
            System.out.println("빈값은 안돼요.");return;}
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null && model.equals("")){
            System.out.println("빈값은 안돼요.");return;}
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        //Calendar는 추상클래스라서 .getInstance()를 통해 인스턴스 객체 형태로 반환 받는다.
        Calendar cal = Calendar.getInstance();
        if (year > cal.get(Calendar.YEAR)|| year < 0){

        }
        this.year = year;
    }
}
