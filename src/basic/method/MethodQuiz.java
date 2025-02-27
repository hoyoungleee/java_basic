package basic.method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz {
    static String[] foods = {"chicken", "pasta", "beef"};

    // 배열 내부 한눈에 보기
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // foods 배열에서 특정 데이터의 인덱스를 반환
    // 메서드 이름: indexOf, 매개변수: 음식이름(String)
    static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    // 특정 요소가 배열에 포함되어 있는지의 여부를 확인하는 메서드를 작성하세요.
    static boolean isInclude(String searchTarget){
        int idx = indexOf(searchTarget);
        if(idx == -1){
            System.out.println("찾는 요소가 배열에 없습니다.");
            return false;
        }else {
            System.out.printf("찾는 요소가 %d번째에 존재합니다.\n", idx);
            return true;
        }
        //return indexOf(searchTarget) != -1; 으로 써도 True , False 반환 위처럼 길게 안써도 됨.
    }



    // foods 배열에 데이터를 끝에 추가하는 메서드를 작성하세요.
    static void push(String newFood){
        String[] temp = new String[foods.length+1];
        int i = 0;
        for (String s : foods) {
            temp[i] = s;
            i++;
        }
        temp[foods.length] = newFood;
        foods = temp; temp =null;
        System.out.println("끝에 입력되었습니다.");
        System.out.print("현재 Food들");
        System.out.println(Arrays.toString(foods));
    }


    // 특정 인덱스가 범위 내의 올바른 인덱스인지를 확인하는 메서드를 작성하세요.
    // 작성이 완료되면 타 메서드에서 활용할 수 있을 것입니다.
    static boolean isOutOfBounds(int targetIndex){
        if(targetIndex > foods.length-1 || targetIndex < 0){
            return false;
        }else {
            return true;
        }
    }



    // 원하는 인덱스 위치에 요소를 삽입하는 메서드를 작성하세요.
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.
    static void insert(int targetIndex, String newFoodName){
        boolean flag = isOutOfBounds(targetIndex);
        if(!flag){
            if(targetIndex<0){
                System.out.println("입력하신 숫자는 배열범위를 벗어납니다.");
            }else {
                String[] temp = new String[targetIndex+1];
                for (int i = 0; i < foods.length; i++) {
                    temp[i] = foods[i];
                }
                for (int j = foods.length-1; j >= targetIndex; j--) {
                    temp[j+1] = temp[j];
                }
                temp[targetIndex] = newFoodName;
                foods = temp; temp =null;
                System.out.println("삽입되었습니다.");
                System.out.print("현재 Food들");
                System.out.println(Arrays.toString(foods));
            }
        }else{
            String[] temp = new String[foods.length+1];
            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }
            for (int j = foods.length-1; j >= targetIndex; j--) {
                temp[j+1] = temp[j];
            }
            temp[targetIndex] = newFoodName;
            foods = temp; temp =null;
            System.out.println("삽입되었습니다.");
            System.out.print("현재 Food들");
            System.out.println(Arrays.toString(foods));
        }

    }



    // 원하는 인덱스 위치의 요소를 수정하는 메서드를 작성하세요.
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.
    void modify(int targetIndex, String newFoodName){

        try {
            boolean flag = isOutOfBounds(targetIndex);
            if(!flag){
                System.out.println("입력하신 숫자는 배열범위를 벗어납니다.");
            }else{
                foods[targetIndex] = newFoodName;
                System.out.println("수정되었습니다.");
                System.out.print("현재 Food들");
                System.out.println(Arrays.toString(foods));
            }
        } catch (RuntimeException e) {
            System.out.println("수정하던 중 문제가 발생하였습니다. 관리자에게 문의하세요.");
            throw new RuntimeException(e);
        }
    }


    // 특정 인덱스의 요소를 삭제하는 메서드를 작성하세요.
    void remove(String deleteTarget){

        try{
            int targetIdx = Integer.parseInt(deleteTarget);
            boolean flag = isOutOfBounds(targetIdx);
            if(!flag){
                System.out.println("입력하신 숫자는 배열범위를 벗어납니다.");
            }else{
                String[] temp = new String[foods.length-1];
                for (int i = targetIdx; i < temp.length; i++) {
                    foods[i] = foods[i+1];
                }
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = foods[i];
                }
                foods = temp; temp =null;

                System.out.println("삭제되었습니다.");
                System.out.print("현재 Food들");
                System.out.println(Arrays.toString(foods));
            }
        } catch (Exception e) {
            System.out.println("비우던 중 문제가 발생하였습니다. 관리자에게 문의하세요.");
            throw new RuntimeException(e);
        }
    }


    // 배열 내부를 깔끔하게 비워버리는 메서드를 작성하세요. (삭제 반복 x)
    void clear(){
        try {
            String[] temp = new String[]{};
            foods = temp; temp = null;
            System.out.println("내용을 비웠습니다.");
            System.out.print("현재 Food들");
            System.out.println(Arrays.toString(foods));
        } catch (Exception e) {
            System.out.println("비우던 중 문제가 발생하였습니다. 관리자에게 문의하세요.");
            throw new RuntimeException(e);
        }

    }



    static int isCorrect (String str){
        if(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4")){
           int select = Integer.parseInt(str);
           return select;
        }else {
            System.out.println("올바른 값을 입력해주세요.");
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodQuiz mq = new MethodQuiz();
        String name = "";
        int idx = 0;
        System.out.print("현재 Food들");
        System.out.println(Arrays.toString(foods));

        try {
            while (true) {
                System.out.println("음식 배열 제거기입니다. 하고자 하는 업무를 선택해주세요.");
                System.out.println("1. 배열요소 수정");
                System.out.println("2. 배열요소 삭제");
                System.out.println("3. 배열요소 끝에 삽입");
                System.out.println("4. 배열요소 원하는 위치에 삽입");
                System.out.println("5. 배열정리");

                String  choice = sc.next();
                int select = isCorrect(choice) ;


                switch (select) {
                    case 1:
                        System.out.println("수정할 인덱스 위치를 입력해주세요.");
                        idx = sc.nextInt();
                        sc.nextLine();
                        System.out.println("수정할 내용을 입력해주세용.");
                        String udName = sc.nextLine();
                        mq.modify(idx, udName);
                        break;
                    case 2:
                        System.out.println("삭제할 인덱스 위치를 입력해주세요.");
                        String strIdx = sc.next();
                        mq.remove(strIdx);
                        break;
                    case 3:
                        System.out.println("끝에 입력할 음식이름을 입력해주세요.");
                        name = sc.next();
                        push(name);
                        break;
                    case 4:
                        System.out.println("삽입을 원하는 위치를 입력해주세요.");
                        idx = sc.nextInt();
                        System.out.println("입력할 음식이름을 입력해주세요.");
                        name = sc.next();
                        insert(idx, name);
                        break;
                    case 5:
                        mq.clear();
                        break;
                    default:
                        System.out.println("1~5 안에서만 선택해주세요.");
                }
            }
        } catch(Exception e){

            throw new RuntimeException(e);
        }
    }
}
