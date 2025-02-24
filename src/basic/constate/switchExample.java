package basic.constate;

import java.util.Map;
import java.util.Scanner;

public class switchExample {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("성별을 입력하세요. (M/F)");
    String gender = sc.next();

    switch (gender){
        //switch문만으로 사용자의 소문자/대문자입력 방어하기
        case "m":
        case "M":
            System.out.println("남성입니다.");
            break;
        //switch문만으로 사용자의 소문자/대문자입력 방어하기 가로버전.
        case "ㄹ": case "f": case "F":
            System.out.println("여성입니다.");
            break;
        //자바 14버전 이후 적용가능한 switch 문법 방법.
        case "ㅁ","a", "A":
        System.out.println("도라이입니다.");
        break;
        default:
            System.out.println("우리는 모두 하나.");
    }




    sc.close();
    }
}
