package etc.collection.list;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.addFirst("맨 앞");
        list.addLast("맨 뒤");

        System.out.println(
        list.get(1) +
        list.get(2) +
        list.get(3) +
        list.getFirst() +
        list.getLast()
                              );

        list.remove("1");
        list.removeFirst();
        System.out.println("list = " + list);

        System.out.println("--------------------------------");

        // LIFO(Last In First Out) -> stack
        // push, pop, peek

        //0번으로 추가
        list.push("춘식이");
        System.out.println("list = " + list);

        // 맨앞 삭제하면서  데이터를 얻기
        System.out.println(list.pop());
        System.out.println("list = " + list);

        // 삭제하지 않으면서 참조
        System.out.println(list.peek());
        System.out.println("list = " + list);

        // FIFO ->> First In , First Out -> Queue
        // offer, poll, peek
        list.offer("a");
        list.offer("b");
        list.offer("c");
        System.out.println("list = " + list);// 뒤에서부터 추가

        System.out.println(list.poll());//맨앞것 배출
        System.out.println("list = " + list);

        // 삭제하지 않으면서 참조
        System.out.println(list.peek());
        System.out.println("list = " + list);
    }

}
