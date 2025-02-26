package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드
            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */
        System.out.println("#먹고싶은 음식을 입력하세요.");
        System.out.println("#입력을 중지하려면 <그만> 이라고 입력하세요.");

        //음식이름을 저장할 배열 -> 초기에는 입력값이 없으니 빈 배열로 생성.

        String[] foodList = {};

        while (true){
            System.out.print("> ");
            String newFood = sc.next();
            if(newFood.equals("그만")) break;

            //기존 배열보다 큰 새배열
            String[] temp = new String[foodList.length +1];

            for (int i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }

            //새 음식을 끝 인덱스에 추가;
            temp[temp.length -1] = newFood;

            //주소값 이전
            foodList = temp; temp = null;
        }
        System.out.println(Arrays.toString(foodList));
        sc.close();


        /*내방식
        String[] foods = new String[1];
        boolean start = false;
        while (true){
            try {
                System.out.println("음식명을 입력해주세요.\n 종료를 원하시면 \"그만\"을 입력해주세요.");
                String foodName = sc.next();

                if(foodName.equals("그만")){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                else if(foodName.equals("") || foodName ==null){
                    System.out.println("입력된 값이 없습니다.");
                    break;
                } else {
                    String[] temp;
                    if(!start){
                        temp = new String[]{foodName};
                        start = true;
                    }else {
                        temp = new String[foods.length+1];
                        for (int i = 0; i <= foods.length; i++) {
                            if(i < foods.length){
                                temp[i] = foods[i];
                            }else {
                                temp[i] = foodName;
                            }
                        }
                    }
                    foods = temp;
                    System.out.println(Arrays.toString(foods));
                }
            }catch (Exception exception){
                System.out.println("올바른 음식명을 입력해주세요.");
            }
        }*/




    }
}
