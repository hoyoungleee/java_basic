package basic.method;

public class MethodExample2 {
    /*
    # 매개 변수 (parameter, argument)

    1. 매개변수는 메서드를 호출할 때, 메서드 실행에 필요한 값들을
     메서드 내부로 전달하는 매개체 역할을 합니다.

    2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
     메서드의 실행 결과는 달라질 수 있습니다.

    3. 매개값을 몇 개 받아서 사용할지는 메서드를 선언할 때 선언부에서
     ()안에 미리 개수와 타입을 지정합니다.

    4. 매개변수의 이름을 지을 때는 호출자가 선언부로 돌아와서
    매개값을 확인하지 않게, 어떠한 값을 담는 변수인지
    그 뜻을 알기 쉽게 지어주면 서로에게 좋습니다.

    5. 매개변수를 하나도 선언하지 않을 수도 있습니다. 이 때는 메서드의 선언부에
     () 내부를 비워둡니다. 그리고 호출할 때도 ()를 비워서 호출합니다.
*/
    //메서드의 선언! (static은 뒤에서)
    static int calcTotal(int start, int end){
        int total = 0;
        for (int i = start; i < end; i++) {
            total += i;
        }
        return total;
    }

    //가변 파라미터 (인자수를 따로 지정하지 않고 쉼표로 구분하여 보내면 배열 형태로 받아옴)
    static double calcTotal2(int... nums){
        double total = 0.0;
        for (int num : nums) {
            total += num;
        }
        double avg = total/nums.length;
        return avg;
    }
    public static void main(String[] args) {

    }
}
