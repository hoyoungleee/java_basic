package basic.operator;

public class ConditionalOperator {
    /*
         # 3항 연산자
         - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
         - (조건식 ? 좌항 : 우항);
         - 조건식을 비교하여 true일 경우에는 좌항이,
          false일 경우에는 우항의 값이 도출됩니다.
    */


    public static void main(String[] args) {
        int x=50 , y = 30;

        String result = x>y ? "x는 y보다  큽니다." : "x는 y보다 작습니다.";
        System.out.println("result = " + result);

        // 연산자의 우선순위. 순위가 높은 순으로 먼저 실행 됨.
        // 괄호 -> 참조(.) -> 단항 -> 이항 -> 삼항 -> 대입
        //난수(랜덤값)을 발생시키는 메서드 Math.random();
        //0.0 이상 1.0 미만 실수 난수값을 반환해줍니다. 0.0 <= x < 1.0
        double random = Math.random();
        System.out.println("random = " + random);

        //1~10까지의 정수 난수를 발생
        int v = (int) (Math.random() * 10 + 1);
        System.out.println("v = " + v);

    }
}
