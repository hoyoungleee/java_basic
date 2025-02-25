package basic.loop;

import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {
        /*
         # 무한 루프

         - 무한 루프는 반복 횟수를 정하지 않고 무한하게 반복문을
          실행하는 구조입니다.

         - 처음 반복문을 구성할 때, 개발자가 사전에 정확한 반복 횟수를
          파악할 수 없다면, 무한루프를 일단 구성해 두고
          특정 조건을 통해 종료할 수 있도록 코드를 설계합니다.

         - 일반적으로 정확한 반복 횟수를 알고 있다면 for문을 사용하고,
          정확한 반복 횟수를 모른다면 while을 통한 무한 루프를 형성하여
          사용합니다. while(true), for(;;)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("문제의 정답을 알려주세요.");
        outer: while (true){
            System.out.println("만든사람의 이름은? 1.장영실, 2.이순신, 3.이호영");
            int answer = sc.nextInt();
            switch (answer){
                case 1 -> System.out.println("틀렸습니다. 다시 해보세요.");
                case 2 -> System.out.println("틀렸습니다. 다시 해보세요.");
                case 3 -> {
                    System.out.println("맞았습니다.");
                    break outer;
                }
                default -> System.out.println("올바른선택지를 입력하세요.");
            }
        } sc.close();

    }

}
