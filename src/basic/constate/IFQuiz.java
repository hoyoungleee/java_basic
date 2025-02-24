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

        System.out.println("키를 입력해주세요.");
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
        sc.close();

    }
}
