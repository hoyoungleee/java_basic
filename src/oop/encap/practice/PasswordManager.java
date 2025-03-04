package oop.encap.practice;

public class PasswordManager {
    private String password;

    PasswordManager(String password){
        this.password = password;
    }


    //비밀번호 변경
    public boolean changePassword(String before_password, String want_password){

        if(before_password.equals(this.password)){
            this.password = want_password;
            return true;
        } else {
            System.out.println("기존 비밀번호가 일치하지 않네요. 확인바랍니다.");
            return false;
        }
    }
}
