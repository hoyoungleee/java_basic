package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         - 다중 catch문은 실제로 에러가 발생하면
          위에서부터 순서대로 catch문을 검색하면서 내려오기 때문에
          부모 타입의 예외를 자식 타입의 예외보다 위에 작성하시면 안됩니다.

         - catch 옆에 괄호에 예외 타입을 여러 개 작성하고 싶은 경우는
          | 기호를 사용하여 타입을 나열해 주시면, 하나의 catch 블록으로
          여러 타입의 예외를 동시에 처리할 수 있습니다.
          (java 7버전부터 가능한 문법)
         */
        try {
            int[] arr = new int[5];

            System.out.println("정수 : ");
            //정수입력에 문자가 들어올 경우
            int num = scanner.nextInt();

            //나누는 수에 0이 들어왔을 경우
            int result = 100 /num;

            //배열 크기를 벗어난 수가 입력될 경우
            System.out.println(arr[result]);

            String s = null;
            //주소를 참조하여야 하는데 null은 주소가 없어서 nullPointException
            s.equals("메롱");
        } catch (InputMismatchException |ArithmeticException e){
            System.out.println("올바르게 입력하세요.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 벗어났어요.");
        } catch (NullPointerException e){
            System.out.println("주소가 null입니다.");
        } catch (Exception e){
            System.out.println("알 수 없는 예외");
            e.printStackTrace();
        } finally {
            System.out.println("예외 발생 여부와 상관 없이 항상 실행되는 문장!");
        }

    }


}
