package oop.encap;

public class PasswordManager {
    private String password;

    PasswordManager(String password){
        this.password = password;
    }
    //현재 비밀번호 가져오기
    public String getPassword() {
        return password;
    }

    //비밀번호 설정용 메서드
    public void setPassword(String password) {
        if(this.password == null || this.password.equals("")){
            System.out.println("빈값은 비밀번호로 설정할 수 없습니다.");
            return;
        }
        this.password = password;
    }

    //비밀번호 변경
    public boolean changePassword(String before_password, String want_password){
        if(this.password == null || this.password.equals("")){
            System.out.println("비밀번호를 먼저 세팅해주세요.");
            return false;
        }
        if(before_password.equals(this.password)){
            this.password = want_password;
            return true;
        } else {
            System.out.println("기존 비밀번호가 일치하지 않네요. 확인바랍니다.");
            return false;
        }
    }
}
