package basic.constate;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");
        int score = sc.nextInt();
        System.out.println("score = " + score);
        
        if(score >= 60){
            System.out.println("합격입니다.");
        }else {
            System.out.println("불합격입니다.");
        }
        System.out.println("시험고생하셨습니다.");

        sc.close();
    }
    
}
