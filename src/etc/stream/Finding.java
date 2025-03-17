package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.MENULIST;

public class Finding {
    public static void main(String[] args) {
        //메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가?
        boolean flag = MENULIST.stream().anyMatch(s -> s.isVegeterian());
        System.out.println("flag = " + flag);

        // 메뉴 목록 중 칼로리가 100이하인 요리가 하나라도 존재하는가?
        boolean flag2 = MENULIST.stream().anyMatch(d -> d.getCalories() <= 100);
        System.out.println("flag2 = " + flag2);

        // 모든 메뉴가 1000칼로리 미만인가요?
        boolean flag3 = MENULIST.stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);

        // 모든 메뉴가 1000칼로리 미만이 아닙니까?
        boolean flag4 = MENULIST.stream()
//                .allMatch(d -> d.getCalories() > 1000);// 전부 일치하는가
        .noneMatch(d -> d.getCalories() > 1000);// 전부 불일치 하는가
        System.out.println("flag4 = " + flag4);

        //음식중에 칼로리가 제일 낮은 음식이 누구에요?

        Dish dish1 = MENULIST.stream()
                .min(Comparator.comparing(dish -> dish.getCalories()))// 자바 8 이후 나옴
                .get();
        System.out.println("dish1 = " + dish1);

        //음식중에 칼로리가 제일 낮은 음식이 누구에요?

        Dish dish2 = MENULIST.stream()
                .max(Comparator.comparing(dish -> dish.getCalories()))// 자바 8 이후 나옴
                .get();
        System.out.println("dish2 = " + dish2);


    }
}
