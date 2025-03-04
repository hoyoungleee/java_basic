package oop.encap.practice;

public class BankAccount {
    private long balance;//잔고
    private String accountNumber;//계좌번호
    private String accountHolder;//계좌주인

    //객체 생성에 필요한 값을 모두 전달받음. (main을 보고 판단)
    BankAccount(String accountNumber, String accountHolder , long balance){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }



    //잔액 조회
    public long getBalance() {
        return balance;
    }

    //입금 메서드
    public void deposit(long money) {
        if(money <= 0){
            System.out.println("올바른 입금 값을 입력하세요.");
        }
        this.balance += balance;
    }
    //출금 메서드
    public void withdraw(long money) {
        if(this.balance < money || money < 0){
            System.out.println("올바른 출금 값을 입력하세요.");
        }
                this.balance -= money;

    }

}
