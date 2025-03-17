package etc.lambda;

import java.util.List;

//enum 을 static 화 하여 import 하면 하단 상수의 이름 혹은 메서드만 기입해도 오류 없음.
import static etc.lambda.Color.*;

public class Main {
    public static void main(String[] args) {
        // 사과 바구니 생성
        // List.of -> 고정형 리스트 생성 (Arrays.asList와 유사)
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("+++++++++++++++++++녹색사과만 필터링 +++++++++++++++++++++");

        List<Apple> greenApples = FilterApple.filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println("greenApple = " + greenApple);
        }

        System.out.println("+++++++++++++++++++가벼운 사과만 필터링 +++++++++++++++++++++");

        List<Apple> list1 = FilterApple.filterApple(appleBasket, new LightApplePredicate());
        for (Apple lightApple : list1) {
            System.out.println("lightApple = " + lightApple);
        }

        System.out.println("+++++++++++++++++++원하는 조건 사과만 필터링(익명클래스) +++++++++++++++++++++");
        //빨강 또는 노랑 사과만 필터링
        // 새로운 조건 생길때마다 클래스나 함수 만들기 너무 복잡하니
        // 메서드 선언할 떄 이름없는 클래스를 즉석에서 선언하여 보내주자 => 익명클래스
        List<Apple> list2 = FilterApple.filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        } );
        for (Apple filteredApple : list2) {
            System.out.println("filteredApple = " + filteredApple);
        }

        System.out.println("+++++++++++++++++++원하는 조건 사과만 필터링(람다식) +++++++++++++++++++++");

        // 녹색이면서 100g 이하인 사과만 필터링
        //우리는 이제 익명클래스를 통해, 새 클래스파일 생성 없이 즉석에서 보낼 수 있음
        //근데... 생각해보니, 어쩌피 인터페이스에 추상메서드 하나인데
        // 그럼 이름을 굳이 언급할 필요가 있나? -> 람다식으로 작성하면 어떨까?

        List<Apple> list3 = FilterApple.filterApple(
                appleBasket,
                (apple -> apple.getColor() == GREEN && apple.getWeight() <= 100)
        );
        for (Apple filteredApple : list3) {
            System.out.println("filteredApple = " + filteredApple);
        }

        System.out.println("+++++++++++++++++++원하는 조건 사과만 필터링(람다식) +++++++++++++++++++++");
        // 색깔이 빨강 혹은 초록이면서, 무게는 150g 미만이어야 한다.
        List<Apple> list4 = FilterApple.filterApple(appleBasket,
                (apple -> (apple.getColor() == RED || apple.getColor() == GREEN) && apple.getWeight() <150)
//          인자를 여러개 할 경우((apple,.....) ->
//          and가 or 보다 연산 순서가 빨라서 괄호 씌움
//          (apple.getColor() == RED || apple.getColor() == GREEN) && apple.getWeight() <150)
                );
        for (Apple filteredApple : list4) {
            System.out.println("filteredApple = " + filteredApple);
        }

        System.out.println("+++++++++++++++++++여러가지 타입의 객체를 필터링(람다식) +++++++++++++++++++++");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //홀수만 필터링 해주세요.
        List<Integer> filter1 = FilterApple.filter(numbers,
                (num -> num % 2 != 0)
        );
        System.out.println("filter1 = " + filter1);


        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살", "파스타");

        List<String> filterFood = FilterApple.filter(foods,
                food -> food.length() > 2);

        for (String s : filterFood) {
            System.out.println("s = " + s);
        }

        System.out.println("-----------------------------------------------------");
        // 이번에는 사과의 색상만 싹 뽑아서 리스트로 받자.
        List<Color> colors = MappingApple.mappingAppleByColor(appleBasket);
        System.out.println("colors = " + colors);

        System.out.println("-----------------------------------------------------");

        //사과의 무게만 뽑기
        List<Integer> map1 = MappingApple.map(appleBasket,
                new GenericFuntion<Apple, Integer>() {
                    @Override
                    public Integer apply(Apple apple) {
                        return apple.getWeight();
                    }
                }
        );
        System.out.println("map1 = " + map1);


        System.out.println("-------------------숫자를 제곱으로 리턴---------------------------");

        List<Integer> map2 = MappingApple.map(numbers, n -> n*n);
        System.out.println("map2 = " + map2);

        System.out.println("-------------------음식을 주면 첫글자만 뽑아와---------------------------");
        List<Character> map3 = MappingApple.map(foods, food -> food.charAt(0));
        System.out.println("map3 = " + map3);


    }
}
