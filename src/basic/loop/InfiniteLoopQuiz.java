package basic.loop;

import java.util.Scanner;

public class InfiniteLoopQuiz {
    public static void main(String[] args) {
         /*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

        Scanner sc = new Scanner(System.in);
        int cCount = 0;//정답횟수 기억할 변수
        int iCount = 0;//오답횟수 기억할 변수
        System.out.println("*** 연산 퀴즈 ***");
        System.out.println("# 종료하시려면 0을 입력하세요.");

        while (true){
            int rn1= (int)(Math.random()*100+1);
            int rn2= (int)(Math.random()*100+1);// 1~100까지 반환
            int operator = (int) (Math.random()*4); // 0~3까지 반환

            int correct =0;
            char opChar = ' ';

            switch (operator){
                case 0:
                    correct = rn1 + rn2;
                    opChar = '+';
                    break;
                case 1:
                    correct = rn1 - rn2;
                    opChar = '-';
                    break;
                case 2:
                    correct = rn1 * rn2;
                    opChar = '*';
                    break;
                case 3:
                    correct = rn1 / rn2;
                    opChar = '/';
                    break;

            }
            System.out.printf("%d %s %d = ?\n",rn1,opChar,rn2);
            int answer = sc.nextInt();

            if (answer == correct){
                System.out.println("정답입니다.");
                cCount++;
            } else if (answer == 0) {
                System.out.println("종료합니다.");
                break;
            }else {
                System.out.println("오답입니다.");
                iCount++;
            }
        }
        System.out.printf("정답횟수 : %d, 오답횟수 : %d", cCount,iCount);
        sc.close();


        /* 내방식
        Scanner sc = new Scanner(System.in);
        int o = 0;
        int x = 0;
        while (true){
            System.out.println("문제의 정답을 맞춰주세요");
            int num1 = (int) (Math.random()*100)+1;
            int num2 = (int) (Math.random()*100)+1;
            int answer = num1 + num2 ;
            System.out.printf("%d + %d = ?\n",num1,num2);
            int input = sc.nextInt();
            if(input == 0){
                break;
            }
            else if(answer == input){
                o++;
                System.out.println("정답입니다.");
            }else {
                x++;
                System.out.println("오답입니다.");
            }

        }
        System.out.printf("정답횟수 : %d, 오답횟수 : %d", o,x);*/
    }
}
