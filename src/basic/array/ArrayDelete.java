package basic.array;

import java.util.Arrays;

public class ArrayDelete{
    public static void main(String[] args) {

        // 원하는 위치의 값 삭제하기
        int[] numbers = {10,20,30,40,50,60};
        int targetIndex = 2;


        //        numbers[2] = numbers[3]; // 1, 3, 7, 7, 9, 11
        //        numbers[3] = numbers[4]; // 1, 3, 7, 9, 9, 11
        //        numbers[4] = numbers[5]; // 1, 3, 7, 9, 11, 11
        //        numbers[5] = numbers[6]; (x)
        // 타겟 인덱스를 기준으로 뒤에 데이터 한칸씩 땡겨오기 (마지막 데이터 전까지)
        for (int i = targetIndex; i < numbers.length-1; i++) {
            numbers[i] = numbers[i+1];
        }
        //기존배열보다 크기가 1개 작은 배열을 생성
        int[] temp = new int[numbers.length -1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }

        System.out.println(Arrays.toString(temp));
    }
}
