package oop.static_.practice;

public class Store {
    private static int totalSales;//총 판매액

    public static void addSales(int amount) {

        totalSales += amount;
    }

    public static int getTotalSales() {
        return totalSales;
    }

}
