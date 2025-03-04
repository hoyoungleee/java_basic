package oop.inherit.product;

public class Television extends ElectronicProduct {

    int screenSize;

    Television(String productName, double price, String manufacturer, int screenSize){
        super(productName,price,manufacturer);
        this.screenSize = screenSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.printf(", 화면사이즈: %d inches\n", screenSize);
    }
}
