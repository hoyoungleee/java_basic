package etc.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    //사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples){
        List<Color> colorList = new ArrayList<>();

        for (Apple apple : apples) {
            Color color = apple.getColor();
            System.out.println("color = " + color);
            colorList.add(color);
        }
        return colorList;
    }

    //어떤 리스트를 받아도 매핑이 가능한 전역 메서드를 선언해보자.
    public static <X,Y> List<Y> map(List<X> list, GenericFuntion<X, Y> mapper){
        List<Y> mapList = new ArrayList<>();
        for (X x : list) {
            //X에서 Y를 추출하는 동작이 반복 -> 이 동작을 파라미터화 하자.
            Y y = mapper.apply(x);
            mapList.add(y);
        }
        return mapList;
    }

}
