package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		  소수: 약수가 1과 자기 자신만 있는 수.
		 */
        System.out.println("2 이상의 정수를 입력하여 소수를 판별하세요.");

        int inputNum = sc.nextInt();
        if(inputNum <=1){
            System.out.println("해당 정수는 소수를 판별할 수 없습니다.");
        }

        int i = 2;
/*
             int cnt = 0;
             while (i <= inputNum){
            if(inputNum % i == 0){
                cnt++;
            }
            i++;
        }
        if(cnt == 1 ){
            System.out.println("입력하신 정수는 소수에 부합합니다.");
        }
        else {
            System.out.println("입력하신 정수는 소수가 아닙니다.");

        }
        */
        while (inputNum % i != 0){
            i++;
        }
        System.out.printf("%d는 %s\n", inputNum, inputNum == i ? "소수입니다.":"소수가 아닙니다.");
        sc.close();
    }
}
/*
* 소수는 대부분 짝을 이룬다 (적은수를 나눈 몫도 곧 약수가 됨)
* 그래서 큰 수의 소수를 찾을 때 절반정도 범위에서 약수가 나오지 않는다면 그 수는 소수다.
* 연산 절약을 위한 알고리즘*/