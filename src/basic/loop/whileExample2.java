package basic.loop;

public class whileExample2 {
    public static void main(String[] args) {
        /*
        //48 ~ 150 사이정수 중 8의 배수만 가로로 출력해 보세요.

        int i =48;
        int answer = 0;
        while(i<=150){

            if(i%8 == 0){
                System.out.print(i + " ");
            }
            //begin / end / step 부터 작성하면 실수 줄일 수 있음.
            i++;
        }

        System.out.println();


        // 1~100까지의 정수중 4의 배수이면서
        //8의 배수는 아닌 수를 가로로 출력해보세요.
        int j =1;
        int answer2 = 0;
        while(j<=100){

            if(j %4 == 0 && j%8 != 0){
                System.out.print(j + " ");
            }
            //begin / end / step 부터 작성하면 실수 줄일 수 있음.
            j++;
        }
*/
        System.out.println();

        // 1~30000 까지의 정수 중 258의 배수는 몇개인지 출력.
        int z =1;
        int answer3 = 0;
        while(z<=30000){

            if(z % 258 == 0){
                answer3++;
            }
            //begin / end / step 부터 작성하면 실수 줄일 수 있음.
            z++;
        }
        System.out.println("answer3 = " + answer3);

        // 1000의 약수(나누어떨어지는 수)의 개수를 출력하세요.
        int a = 1000;
        int answer4 = 0;
        while(a > 0){
            if(1000%a == 0){
                answer4++;
            }
            a--;
        }
        System.out.println("answer4 = " + answer4);

    }
}
