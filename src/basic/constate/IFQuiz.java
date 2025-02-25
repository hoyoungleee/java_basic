package basic.constate;

import java.util.Scanner;

public class IFQuiz {
    /*
        키가 140cm 이상, 나이가 8세 이상이어야 탑승할 수 있는
        놀이기구가 있다고 가정하고, 사용자에게 키와 나이를 입력받아서
        놀이기구 탑승 가능 / 불가능 여부를 알려주세요.
        탑승이 불가능 한 경우 불가능한 이유를 말해 주세요.
        ex)
            키가 140 미만이라 탑승이 불가능 하다,
            나이가 8세 미만이라 탑승이 불가능 하다 등,
        - 나이가 6세 이상 8세 미만인 경우 보호자 동반시 탑승이 가능하다고
        얘기해 주세요.

        놀이기구 탑승여부와 상관없이 '오늘 하루 즐거운 시간되세요~!'
        를 출력하세요.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  /*      System.out.println("키를 입력해주세요.");
        int tall = sc.nextInt();

        System.out.println("나이를 입력해주세요.");
        int age = sc.nextInt();


        if(tall < 140){
            System.out.println("키가 140 미만이라 탑승이 불가능 합니다");
        }else if(age < 8){
            System.out.println("나이가 8세 미만이라 탑승이 불가능 하다");
            if(age >= 6 && age <8){
                System.out.println("만약 탑승하려면 보호자 동반이 필요합니다.");
            }
        }
        else {
            System.out.println("재밌는 시간 되시길 바랍니다.");
        }
        System.out.println("오늘 하루 즐거운 시간되세요~!");
*/
        System.out.println("======================================");
         /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
        int max = 0;
        int mid = 0;
        int min = 0;
        System.out.println("첫번 째 정수를 입력해주세요.");
        int num1 = sc.nextInt();
        System.out.println("두번 째 정수를 입력해주세요.");
        int num2 = sc.nextInt();
        System.out.println("세번 째 정수를 입력해주세요.");
        int num3 = sc.nextInt();
/*
        if(num1 > num2 && num1 > num3){
            max = num1;
            if(num2 < num3){
                mid = num3;
                min = num2;
            }else {
                mid = num2;
                min = num3;
            }
        } else if (num2 > num3 && num2 > num1) {
            max = num2;
            if(num1 < num3){
                mid = num3;
                min = num1;
            }else {
                mid = num1;
                min = num3;
            }
        }else {
            max = num3;
            if(num2 < num1){
                mid = num1;
                min = num2;
            }else {
                mid = num2;
                min = num1;
            }
        }

        System.out.printf("max: %d, mid: %d, min: %d", max,mid,min);*/

        if(num1 > num2) {
            max = num1; mid = num2;
        }else{
            max = num2; mid = num1;
        }

        if(num3 > max){
            min = mid;
            mid = max;
            max = num3;

        } else {
            if(num3 < mid){
                min = num3;
            }
        }

        System.out.printf("max: %d, mid: %d, min: %d", max,mid,min);

        sc.close();
    }
}
