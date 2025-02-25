package basic.loop;

public class LoopNesting2 {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
 */
        /*
             *
            **
           ***
          ****
         *****
         */
        for (int i = 0; i < 5; i++) {
            //별찍기 전에 공백부터 만드는 for문
            for(int k=4; k >= i; k--){
                System.out.print(" ");
            }

            //별찍는 for문
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        /*
        *****
         ****
          ***
           **
            *
        */

        for (int i = 1; i <= 5; i++) {
            //별찍기 전에 공백부터 만드는 for문
            for(int k=0; k < i-1; k++){
                System.out.print(" ");
            }

            //별찍는 for문
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         *****
         ****
         ***
         **
         *
         */

        for (int i = 1; i <= 5; i++) {
            //별찍는 for문
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            //별찍기 전에 공백부터 만드는 for문
            for(int k=0; k < i-1; k++){
                System.out.print(" ");
            }


            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++");
        /*
             *
            ***
           *****
          *******
         *********
        */
        for (int i = 1; i <= 5; i++) { // 1부터 N까지 반복
            // 공백 출력 (왼쪽 정렬)
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            // 별 출력 (홀수 개수: 1, 3, 5, ...)
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
