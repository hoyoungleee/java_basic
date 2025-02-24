package basic.operator;

public class UnaryOperator {
    public static void main(String[] args) {
        //증감 연산자 (++, --)
        //변수의 값을 단순히 하나 오리거나 내릴 때 사용합니다.
        int i = 1;
        i = i + 1;
        int k = i--;//선연산 후증감
        int j = ++i;//선증감 후연산
        int g = --i;

    }
}
