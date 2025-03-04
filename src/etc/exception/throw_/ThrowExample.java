package etc.exception.throw_;

import etc.exception.custom.InvalidArgumentException;

public class ThrowExample {

    static int calcTotal(int end) throws InvalidArgumentException{
        if(end <= 0){
            System.out.println("잘못된 매개값!");
            //void 일떄만 return으로 함수 종료로 활용가능.
            //return;
            //리턴타입이 정해진경우 무조건 그 타입의 데이터 리턴 강요.
            //그래서 자동으로 잡히지 않는 예외는 수동적으로 발생.
            throw new InvalidArgumentException("매개값이 거지같네요.");
        }
        int total = 0;
        for (int i = 0; i < end; i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {
        try {
            int result1 = calcTotal(100);
            int result2 = calcTotal(-120);
            System.out.println("result1 = " + result1);
            System.out.println("result2 = " + result2);
        } catch (Exception e) {
            System.out.println("매개값의 이상이 있어서 리턴이 되지 못함.");
            e.printStackTrace();
        }
    }
}
