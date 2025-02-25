package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요. (+, -, *, /)
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약, 사용자가 나눗셈을 선택 했을 때 0으로 나누려는 시도를 한다면
         연산할 수 없는 입력값이라고 얘기 해 주세요.
        */
        int  answer = 0;
        boolean flag = false;
        System.out.println("연산할 첫번째 정수를 입력해주세요.");
        int inputNum = sc.nextInt();

        System.out.println("연산자를 입력해주세요.");
        String inputOperator = sc.next();

        System.out.println("연산할 두번째 정수를 입력해주세요.");
        int inputNum2 = sc.nextInt();

        switch (inputOperator){
            case "+":
                answer =  inputNum + inputNum2;
                break;
            case "-":
                answer =  inputNum - inputNum2;
                break;
            case "*":
                answer =  inputNum * inputNum2;
                break;
            case "/":
                if(inputNum2 == 0){
                    System.out.println("연산할 수 없는 입력값");
                    flag = true;
                    break;
                }
                answer =  inputNum / inputNum2;
                break;
            default:
                System.out.println("연산자를 올바르게 입력해주세요.");
                break;

        }
        if(!flag){//flag == false
            System.out.println("연산결과 = " + answer);
        }

        sc.close();
    }
}
