package basic.loop;

public class WhileExample {
    public static void main(String[] args) {
        /*
             # while문의 진행 순서.
             1. 제어변수를 선언함. (시작값이 정해짐)
             2. while문의 조건식을 검사해서 true면 반복문이 시작.
              false라면 반복문 종료.
             3. while문 블록 내부가 한 번 진행되면(끝까지 내려가면)
              다시 조건식을 검사하여 true라면 반복문 계속 진행,
              false라면 반복문 종료.
             4. 반복문 내에는 증감식을 배치해서 제어변수의 값을 조정.
         */

        //반복문을 제어하기 위한 제어변수(begin - 시작값)
        int i = 1;
        while (i <= 10){ // 논리형 조건식 (end) -> 제어변수의 끝을 지정.
            System.out.println("안녕하세요. 반갑습니다.");
            i++; //증감식(step) -> 끝값에 도달하기 위한 제어변수의 조작. 초반에 기입안하는 실수많이함. 기입 안하면 무한루프.
        }
        System.out.println("==============================================");

        int answer = 0;
        //1~10 합계 구하기
        int j = 1;//begin
        while (j <= 10){//end
            //복합대입연산자 활용. 기존값에 계속 누적하여 새로운 연산 진행.
            answer += j;
            j++;//step
        }
        System.out.println("answer = " + answer);
        System.out.println("j = " + j);
    }
}
