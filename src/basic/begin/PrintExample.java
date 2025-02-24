package basic.begin;

public class PrintExample {
    public static void main(String[] args) {
        //서식 문자를 이용해서 문자열을 일단 완성시킨 후
        //서식문자에 들어갈 문자값을 대입한다.

        int month =12;
        int day  = 25;
        String anni = "크리스마스";
        //12월 25일은 크리스마스 입니다. (서식문자 안 쓸 경우)
        System.out.println(month+"월 "+day+"일은 "+anni+" 입니다.");

        /*
         # 포맷팅 서식 문자 종류
         %d: 부호가 있는 정수 데이터 (decimal)
         %f: 실수 데이터 (floation point)
         %s: 문자열 (String)

         # 탈출 코드 (escape code) -> printf에만 동작하는 게 아니에요.
         - 반드시 따옴표 내에 위치해야 합니다
         - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
         \n: 줄 개행 명령
         \t: 가로 공백 (스페이스 4칸)
     */
        System.out.printf("%d월 %d일은 %s 입니다.\n", month,day,anni);



        // 실수를 표현하는 서식문자 %f -> 기본 6자리까지 표현
        // %.[자리수를 지정하는 숫자]f -> 원하는 자리수까지 표현.(반올림 지원)
        // %라는 문자 자체를 표현할 때는 %% 쓰시면 됩니다.
        /**
         *
         * 입력	출력
         * \	error
         * \\	\
         * \'	'
         * \"	"
         * (	(
         * \(	error
         * /	/
         * \/	error
         */
        double doub = 12312.123;

        System.out.printf("실수 출력하기 %f",doub);
        //실수 보여줄 자리수 지정하기(%.2f)
        System.out.printf("실수 출력하기 %.2f",doub);


        //문자 그대로의 특수 문자를 보여주고 싶을 때(%%)
        System.out.printf("실수 출력하기 %.2f%%",doub);

    }
}
