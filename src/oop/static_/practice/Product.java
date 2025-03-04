package oop.static_.practice;

import static oop.static_.practice.Store.addSales;

public class Product {
    String productName;
    int price;

    Product(String productName, int price){
        this.productName= productName;
        this.price = price;
    }

    public void sellProduct(){
        addSales(this.price);
    }
}
