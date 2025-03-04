package oop.inherit.product;

public class ElectronicProduct {
    String productName;
    double price;
    String manufacturer;

    ElectronicProduct(String productName, double price, String manufacturer) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    void displayInfo(){
        System.out.printf("%s, 가격: %.1f, %s",productName, price,manufacturer);
    }

}
