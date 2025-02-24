package basic.constate;

import java.util.Scanner;

public class switchExample2 {
    public static void main(String[] args) {

        //switch 문에 들어갈 값은 실수형은 불가능 하다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();
        switch (score/10){
            case 10:
                if(score >100){
                    System.out.println("100점이 만점이라 오입력하신 듯 합니다.");
                    break;
                }
                System.out.println("만점입니다.");
                break;
            case 9:
                System.out.println("A학점입니다.");
                break;
            case 8:
                System.out.println("B학점입니다.");
                break;
            case 7:
                System.out.println("C학점입니다.");
                break;
            case 6:
                System.out.println("D학점입니다.");
                break;
            default:
                if(score > 100 || score < 0){
                    System.out.println("잘못된 점수입니다.");
                    break;
                }else {
                    System.out.println("학사경고입니다.");
                }
        }

        scanner.close();
    }
}
