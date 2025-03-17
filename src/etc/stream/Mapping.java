package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.MENULIST;

public class Mapping {// map : 리스트에서 원하는 데이터만 추출
    // original : [ {}, {}, {}, {}, {} ]
    // filter   : [ {}, {}, {} ]
    // map      : [ "", "", "", "", "" ]
    public static void main(String[] args) {

        // 요리 이름만 출력해주세요.

        MENULIST.stream().map(m -> m.getName()).toList().forEach(s -> System.out.println(s));
        // toList(): 자바 16부터 쓸 수 있음. 불변 리스트 -> 수정안됨.
        ///  collect(Collector.toList()) : 자바 8 부터 존재하던 방식 -> 수정 자유로움.
        MENULIST.stream().map(m -> m.getName()).collect(Collectors.toList()).forEach(s -> System.out.println(s));

        List<String> words = List.of("safari", "chrome", "ms edge", "opera", "firefox");

        // 문자들의 길이만 추출
        List<Integer> list = words.stream().map(String::length).toList();
//        list.add(50); //그냥 toList() 크기 변경안됨
        System.out.println(list);

        List<Integer> list2 = words.stream().map(String::length).collect(Collectors.toList());
        list2.add(50); //.collect(Collectors.toList) 크기 변경 자유로움
        System.out.println(list2);

        System.out.println("---------------------------------");

        // 메뉴 목록에서 메뉴 이름과 칼로리만 추출해서
        // 새로운 객체로 포장해서 받고 싶음.
        List<SimpleDish> simpleDishes = MENULIST.stream().map(SimpleDish::new).toList();
        simpleDishes.forEach(System.out::println);

        System.out.println("---------------------------------");

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */

        MENULIST.stream().filter(s -> s.getCalories()> 500).map(DishDetail::new).collect(Collectors.toList()).forEach(System.out::println);

        //칼로리 총합계 더하기
        int sum = MENULIST.stream().mapToInt(s -> s.getCalories()).sum();
        System.out.println(sum);

        //육류 평균 칼로리 구하기
        double asDouble = MENULIST.stream().filter(dish -> dish.getType() == Dish.Type.MEAT).mapToInt(d -> d.getCalories()).average().getAsDouble();
        System.out.printf("%.1f",asDouble);
    }

}
