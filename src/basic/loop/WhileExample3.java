package basic.loop;

import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
             # 사용자에게 구구단 단수를 입력받아서
             해당 단수의 구구단을 출력해 보세요.
             ex)

             구구단을 입력하세요: 4
             *** 구구단 4 단 ***
             4 x 1 = 4
             4 x 2 = 8
             4 x 3 = 12
             4 x 4 = 16
             .
             .
             .
             4 x 9 = 36
         */
        System.out.println("구구단 숫자를 입력해주세요.");
        int num = sc.nextInt();
        int i = 1;
        System.out.printf("*** 구구단 %d 단 ***\n", num);
        while (i <= 9){
            if(num < 2 || num>9){
                System.out.println("구구단의 범위를 벗어났습니다.");
                break;
            }
            int answer =0;
            answer = num * i;

            System.out.printf("%d x %d = %d\n", num,i,answer);
            i++;
        }
        sc.close();
    }
}
