package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};


        /*
       1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

       2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

       - 추가
       배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
       더 이상 지울 친구가 없다면 프로그램 종료.
       */

        while (true){
            boolean flag = false;
            System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

            if (kakao.length == 0) {
                System.out.println("삭제할 친구가 없어 프로그램을 종료합니다.");
                break;
            }
            System.out.println("삭제할 친구 이름을 입력해주세요.");
            String name = sc.next();
            if(name.equals("") && name == null){
                System.out.println("내용을 입력해주세요.");
            } else {
                for (int i = 0; i < kakao.length; i++) {
                    if(kakao[i].equals(name)){
                        for (int j = i; j < kakao.length-1; j++) {
                            kakao[j] = kakao[j+1];
                        }
                        String[] temp = new String[kakao.length-1];
                        for (int k = 0; k < temp.length; k++) {
                            temp[k] = kakao[k];
                        }
                        kakao = temp;
                        flag = true;
                    }
                }
                if(!flag) {
                    System.out.println("해당하는 이름이 없습니다. 다시 입력해주세요.");
                }else {
                    System.out.println("삭제되었습니다.");
                }
            }
        }
    }
}
