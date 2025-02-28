package oop.encap;

public class BankAccount {
    private int balance;//잔고
    private String accountNumber;//계좌번호
    private String accountHolder;//계좌주인

    BankAccount(String accountNumber, String accountHolder , int balance){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }



    //잔액 조회
    public int getBalance() {
        return balance;
    }

    //입금 메서드
    public void deposit(int balance) {
        if(balance <= 0){
            System.out.println("올바른 입금 값을 입력하세요.");
        }
        this.balance += balance;
    }
    //출금 메서드
    public void withdraw(int balance) {
        if(this.balance < balance || balance < 0){
            System.out.println("올바른 출금 값을 입력하세요.");
        }
                this.balance -= balance;

    }

}
