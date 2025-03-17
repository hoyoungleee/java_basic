package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.MENULIST; 

public class Sorting {
    public static void main(String[] args) {
        
        //육류요리 중 칼로리가 낮은 순으로 정렬
        MENULIST.stream().filter(d -> d.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .toList()
                .forEach(d-> System.out.println("d = " + d));

        // 모든 메뉴들을 이름으로 내림차 정렬(zyx 순)
        System.out.println("-------------------------------------------");
        MENULIST.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .toList()
                .forEach(dish -> System.out.println(dish));


        System.out.println("-------------------------------------------");
        // 칼로리가 300 칼로리보다 큰 요리중
        // 칼로리 낮은 순으로 앞에서 3개만
        MENULIST.stream().filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(d -> d.getCalories())).limit(3).toList().forEach(System.out::println);


    }
}
