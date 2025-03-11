package etc.collection.list;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
             # ArrayList
             - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
             - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
             - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.

             # List 클래스
             - 객체의 모음이기 때문에 기본 타입들은 Wrapper 클래스로 타입 강제 명시
         */
//        String[] nick = new String[50];

        //<> -> 제네릭 (타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
        List<String> nick = new ArrayList<>();

        // add(객체) : 리스트에 객체를 추가하는 메서드.
        nick.add("하이용");
        String str = "야옹이";
        nick.add(str);
        nick.add(new String("개구리"));
        nick.add(new String("쨱쨱이"));
        nick.add(new String("고등어"));

        System.out.println("nick = " + nick);

        //add(인덱스, 객체) : 원하는 위치에 객체 삽입
        nick.add(3,"호랑이");
        System.out.println("nick = " + nick);

        //get(인덱스): 리스트 내부 해당 인덱스 객체를 참조
        System.out.println(nick.get(2));

        //size() : 리스트의 크기 반환
        System.out.println(nick.size());

        // set(인덱스, 수정할 객체) : 리스트 내부의 객체를 수정
        nick.set(2, "용가리");
        System.out.println("nick = " + nick);

        //리스트 반복문 처리
        for (int i = 0; i < nick.size(); i++) {
            System.out.println(nick.get(i));

        }

        System.out.println("-------------------------");
        for (String s : nick) {
            System.out.println("s = " + s);

        }

        // contains(객체) : 리스트 내부의 객체 존재여부 파악. boolean으로 반환
        System.out.println(nick.contains("이호영"));

        // indexOf() : 특정 객체의 인덱스 탐색, 없으면 -1 리턴
        int idx = nick.indexOf("호랑이");
        System.out.println("idx = " + idx);

        // remove(객체 or 인덱스) : 리스트 내부 객체 삭제

        nick.remove("고등어");
        nick.remove(0);
        System.out.println("nick = " + nick);

        //clear() : 리스트 내부 전체 삭제

        nick.clear();
        System.out.println("nick = " + nick);

        // isEmpty() : 리스트가 비어있는지 여부 확인
        System.out.println(nick.isEmpty());


        System.out.println("-------------------------------");
        /*
           # 컬렉션 객체들은 Collections의 기능을 사용할 수 있습니다.
           Collections는 컬렉션 객체들의 부가 기능들을 제공합니다.
        */

        List<Integer> score  = new ArrayList<>();

        // 원래라면 객체 생성해야하나 오토 박싱/ 언박싱 지원
        //score.add(new Integer(645));
        score.add(65);

        //리스트 생성과 동시에 초기화하기
        //asList로 만든 리스트는 크기가 고정이라 add(), remove() 안 됌.
        List<Integer> list = Arrays.asList(1,23,4,1241,1123);
//        list.add(11);
        System.out.println("list = " + list);


        //한번에 객체 많이 추가하기
        Collections.addAll(score, 1,34,5345,3453,345345,345);
        System.out.println("score = " + score);
    }
}
