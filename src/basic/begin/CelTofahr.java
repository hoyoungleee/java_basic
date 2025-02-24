package basic.begin;

import java.util.Scanner;

public class CelTofahr {
     /*
         사용자에게 섭씨온도를 실수로 입력받아서
         화씨온도로 변환하여 출력하는 로직을 작성하세요.
         변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
         화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
         # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
    */
     public static void main(String[] args) {
         changeHeat();
     }
     public static void changeHeat(){

         Scanner sc = new Scanner(System.in);
         System.out.println("변환할 섭씨온도(℃)를 입력해주세요.");
         double output;
         try {
             double input = sc.nextDouble();
             System.out.printf("입력받은 섭씨온도는 %.1f℃ 입니다.\n", input);
             //섭씨온도 화씨온도 변환공식
             //(섭씨온도°C × 9/5) + 32 = 96.8°F
             output = (input * 9/5) + 32;
             System.out.printf("변환된 화씨온도는 %.1fＦ 입니다.\n", output);

         }catch (Exception exception){
             System.out.println("입력하신 내용에 오류가 있습니다. 재입력 해주세요.");
             changeHeat();
         }

         sc.close();
         System.out.println("프로그램 종료 및 스캐너 객체 닫음.");
     }
}
