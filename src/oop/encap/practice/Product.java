package oop.encap.practice;

public class Product {

    private String name;
    private int price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock >= 0){
            this.stock = stock;
        }
    }

    //재고관리 함수
    public void reduceStock(int quantity) {
        if(quantity < 0 || this.stock < quantity){
            System.out.println("기존 재고 수량보다 더 많은 양을 요청하셨습니다.");
            return;
        }
        this.stock -= quantity;
    }

    public void showStatus(){
        System.out.printf("제품이름 : %s, 가격 : %d, 재고 수량: %d",this.name,this.price,this.stock);
    }
}
