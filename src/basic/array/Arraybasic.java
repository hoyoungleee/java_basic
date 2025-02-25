package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraybasic {
    public static void main(String[] args) {
        // 배열의 특징
        // 1. 동종모임 구조: 같은 데이터 타입끼리만 배열에 담을 수 있다.
        // 2. 크기가 불변임: 크기를 동적으로 늘리거나 줄일 수 없다.

        // 배열의 생성순서

        // 1. 배열 변수 선언
        int[] numbers;

        // 2. 배열 객체 생성
        numbers = new int[5];
        System.out.println("numbers = " + numbers);

        // 3. 배열 내부 초기화
        // 인덱스를 지목해서 데이터를 할당.
        // 인덱스는 0부터 시작해서 1식 증가.
        numbers[0]=50;
        numbers[1]=77;
        numbers[2]= (int) 3.14;// int배열이라 실수값안됨. 소수점 버리고 형변환.
        numbers[3]=numbers[0];
        numbers[4]=50;

        //4. 배열 내용 순회
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]는 %d\n ", i , numbers[i]);
        }

        // 배열의 순회 foreach (향상된 for문). 범위를 지정하지 못하는게 단점.
        for(int num: numbers){
            System.out.println("num = " + num);
        }

        // 배열 내부를 문자열 형태로 간결하게 콘솔에 출력
        System.out.println(Arrays.toString(numbers));

        // 배열 한번에 만들기
        int[] pointList = new int[]{10,20,30,40};
        System.out.println("pointList = " + pointList);

        // 만약 배열 변수 선언과 동시에 값을 초기화 할때
        // 처음 만들 때 한번만 가능한 문법(내용 갯수에 맞게 고정길이 설정. 변경불가)
        String[] animalList = {"cat","dog","bear"};

        // 같은 변수이름로 내용 변경 및 개수 변환 필요시
        animalList = new String[]{"chicken","swallow","tiger","shark"};

        System.out.println("==================================================");

        //배열을 생성만 하고 값을 안넣으면?
        //각 타입의 기본값으로 미리 초기화됨.
        //기본값: 정수 0, 실수 0.0, 논리 false, 문자 (char) 공백, 기타 null
        byte[] bArr = new byte[3];
        double[] dArr = new double[6];
        boolean[] blArr = new boolean[3];
        String[] sArr = new String[3];

        // 배열을 새로 생성 후 아직 값을 지정하지 않았지만 초기값으로 지정되어 있다.
        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(blArr));
        System.out.println(Arrays.toString(sArr));

    }
}
