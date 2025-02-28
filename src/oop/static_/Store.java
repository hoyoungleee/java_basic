package oop.static_;

public class Store {
    private static int totalSales;//총 판매액

    public static void addSales(int amount) {

        totalSales += amount;
    }

    public static int getTotalSales() {
        return totalSales;
    }
    public static void setTotalSales(int totalSales) {
        Store.totalSales = totalSales;
    }




}
