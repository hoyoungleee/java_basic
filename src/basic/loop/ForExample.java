package basic.loop;

import java.util.Scanner;

public class ForExample {
    /*
    while문 방식
    * int a = 1000;
        int answer4 = 0;
        while(a > 0){
            if(1000%a == 0){
                answer4++;
            }
            a--;
        }
    * */
    public static void main(String[] args) {
        int total = 0;
        for(int j= 1; j<10; j++){
            total += j;
        }

        // 1~ 200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력
        for (int j = 0; j < 200; j++) {
            if(j % 6 == 0 && j % 12 != 0){
                System.out.print(" " + j);
            }
        }

        System.out.println("\n======================================");

        // 정수를 하나 입력받아서
        // 입력받은 정수까지의 팩토리얼 값을 구하세요.
        // 팩토리얼이란 5!  -> 5 X 4 X 3 X 2 X 1
        System.out.println("팩토리얼 값을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("양수값만 입력해주세요.");
            return;
        }
        int answer = num;
        for (int z = num-1; z > 0; z--) {
            answer = answer * z ;
        }
        System.out.println("answer = " + answer);
        sc.close();
    }
}
