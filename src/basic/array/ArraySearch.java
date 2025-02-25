package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        String[] foods = {"피자","파스타","치킨", "삼겹살"};
             /*
             - 자바에서는 문자열 동등 비교 시 '==' 연산자를
              사용하면 제대로 비교가 되지 않습니다.

             - 문자열 String 타입이 기본 데이터 타입이 아닌
              객체 참조 타입이기 때문입니다.
              객체 참조 타입은 해당 값을 직접 들고 있는 게 아니라
              객체의 주소값을 들고 있기 때문에,
              문자열이 아무리 같더라도 주소가 다르면 false를
              도출합니다.

             - 그러므로 문자열 동등 비교를 진행할 때는
             [비교문자열1.equals(비교문자열2)] 를 사용하여
             진행해야 합니다.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("찾고 싶은 음식을 입력하세요: ");
        String foodName = sc.next();
        boolean flag = false;
        for (int i = 0; i < foods.length; i++) {

            if(foods[i].equals(foodName)){
                // == 은 기본타입비교시에만 정상적으로 사용가능.
                // String은 참조타입(주소만 저장하고 값은 나중에참조)라서 비교할문자열.equals(비교할 문자열2)를 사용하여 값비교.
                System.out.println("탐색완료");
                System.out.println("인덱스: "+ i + "번");
                flag = true;
                break;
            }

        }
        if(!flag){
            System.out.println("없는 음식이에요.");
        }
        //System.out.println(Arrays.toString(foods));
    }
}
