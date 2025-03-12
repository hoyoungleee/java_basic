package etc.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        /*
        # Map
        - Key / Value가 한 세트를 이루는 자료구조
        - Key값을 통해 Value를 참조하는 방식 (인덱스 x)
        - Key는 중복 저장을 허용하지 않음.
         */

        // Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 선언.
        Map<String, String> map = new HashMap<>();

        // Map에 데이터를 추가 : put(key, value)
        map.put("멍멍이", "홍길동");
        map.put("야옹이", "김철수");
        map.put("짹짹이", "박영희");
        System.out.println("map = " + map);

        // Key를 중복사용하는 경우
        map.put("멍멍이", "김춘식"); //key 중복
        map.put("어흥이", "홍길동"); // value 중복
        System.out.println("map = " + map);

        //map에 키 유무 확인 하는 함수 : containsKey(key)
        // value 얻기 : get(key)
        if(map.containsKey("메롱이")){
            String nick = "메롱이";
            System.out.printf("별명이 %s인 학생의 이름은 %s입니다.\n", nick, map.get(nick));
        }else {
            System.out.println("그런 별명 없습니다.");
        }

        //keySet(): 키만모여있는 set 반환
        //values(): 값 모음 반환
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }

        //Map 객체를 삭제 : remove(Key)
        map.remove("멍멍이");

        map.clear();

        //Collections의 메서드는 Collection 인터페이스 타입을 전달 받기 떄문에
        //Map에서는 사용이 힘듦
//        Collections.addAll(map, 1,2,3,4);


    }
}
