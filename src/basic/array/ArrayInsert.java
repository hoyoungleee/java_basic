package basic.array;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr =  {10,20,50,90,100,150};
        int newNumber = 66;
        int targetIndex = 2;

        //50과 90사이에 66을 삽입하고 싶다.
        int temp = 0;
        int[] tempArr = new int[arr.length + 1];
        //데이터 복사
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }

        // 3. 삽입위치에서 데이터를 뒤로 한 칸씩 이동시키자.
        //이동 순서는 끝에서부터 시작해야 한다.
        for (int i = arr.length; i >= targetIndex; i--) {
            tempArr[i] = tempArr[i-1];
        }

        // 4. 새로운 데이터를 타겟 인덱스에 할당
        tempArr[targetIndex] = newNumber;

        // 5. 주소값 이전
        arr = tempArr ; tempArr = null;

        System.out.println(Arrays.toString(arr));
    }
}
