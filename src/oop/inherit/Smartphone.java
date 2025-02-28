package oop.inherit;

public class Smartphone extends ElectronicProduct {

    int storageCapacity;

    Smartphone(String productName, double price, String manufacturer, int storageCapacity){
        super(productName,price,manufacturer);
        this.storageCapacity = storageCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.printf(", 저장용량: %d\n", storageCapacity);
    }
}
