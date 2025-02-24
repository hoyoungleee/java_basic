package basic.begin;

//1. Scanner 로딩 (제공되는 Scanner 클래스 정보를 현재 클래스로 가져오기)
import java.util.Scanner;
import java.util.function.Function;

public class ScannerExample {
    public static void main(String[] args) {


        inputInt();



    }
    public static void inputInt(){

        //2. Scanner 객체 생성.
        Scanner scanner = new Scanner(System.in);

        /*
         3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
         - next(): 공백이 없는 문자열을 입력받습니다.
         - nextLine(): 공백을 포함한 문자를 입력받습니다.
         - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
         ex)
            nextInt(): 정수 데이터를 입력받습니다.
            nextDouble(): 실수 데이터를 입력받습니다.
        */

        System.out.println("성별을 입력하세요.");
        String gender = scanner.next();

        //nextLine() 하기전에 다른 것을 입력받으면 버퍼에 enter 남아있어 입력하지 못하고 넘어가짐.
        // 비우기위해 한번 더 의미없는 nextLine() 진행
        scanner.nextLine();
        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();


        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();

        System.out.printf("%s인 제 이름은 %s이고, 나이는 %d입니다.\n", gender, name, age);


        //재귀함수 적용해보기
        try {
            System.out.println("정수만 입력하세요");

            int next = scanner.nextInt();
            System.out.printf("입력한 정수는 : %d입니다.", next );
        }catch (Exception exception){
            System.out.println("정수만 입력하세요");
            inputInt();
        }

        //4. 스캐너 객체를 반납
        // 객체를 반납 -> Scanner 객체를 메모리에서 해제.
        scanner.close();
    }


}
