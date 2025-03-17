package etc.stream;

import java.util.List;

import static etc.stream.Menu.MENULIST;

public class Filtering {
    public static void main(String[] args) {


        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> dishList = MENULIST.stream()
                .filter(dish -> dish.isVegeterian())
                //.filter(Dish::isVegeterian) // 메서드 참조식 방식
                .toList();
/*        for (Dish dish : dishList) {
            System.out.println("dish = " + dish);

        }*/
        dishList.forEach(d -> System.out.println(d));
//        dishList.forEach(System.out::println); //메서드 참조식


        System.out.println("-----------------------------------------------");

        //메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링 해서출력
        MENULIST.stream().filter(d -> d.getCalories() < 600 && d.getType() == Dish.Type.MEAT).toList().forEach(c -> System.out.println(c));//람다식
        MENULIST.stream().filter(d -> d.getCalories() < 600 && d.getType() == Dish.Type.MEAT).toList().forEach(System.out::println);//메서드 참조식
        System.out.println("-----------------------------------------------");

        // 메뉴 목록에서 요리 이름이 4글자인 것만 필터링해서 출력
        MENULIST.stream()
                .filter(m -> m.getName().length() == 4)
                .toList()
                .forEach(System.out::println);

        // 칼로리가 300칼로리 이상 인 요리중에 앞에 세걔만
        MENULIST.stream().filter(dish -> dish.getCalories() > 300)
                .limit(3) //필터링 대상에서 제약 조건
                .toList()
                .forEach(System.out::println);

        // 300칼로리보다 높은 요리 중 처음 2개 제끼고 필터링

        MENULIST.stream().filter(dish -> dish.getCalories() > 300)
                .skip(2) //맨 앞 두개 제외
                .toList()
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        List<Integer> list = List.of(1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 6, 6);

        //리스트에서 짝수만 필터링해라 (중복은 제거해서)
        list.stream().filter(n -> n%2==0)
                .distinct() // 중복제거
                .toList()
                .forEach(n -> System.out.println(n));

    }

}
