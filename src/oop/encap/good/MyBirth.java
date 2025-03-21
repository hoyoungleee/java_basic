package oop.encap.good;

import java.util.PropertyPermission;

public class MyBirth {

    // 외부에서 변수에 직접 접근할 수 없도록 필드에 private 제한을 붙임.
    private int year;
    private int month;
    private int day;

    /*
     - 정보 은닉은 데이터에 접근 제한을 걸어서 정보를 보호하는 것이 목적이지만
      private을 설정했더니 데이터 접근 자체가 불가능해집니다.

     - 따라서 데이터의 유효성을 검증할 수 있는 제어문이 포함된
      메서드를 사용하여 데이터의 접근을 허용하도록 설계하는데,
      이 때 사용하는 메서드를 getter / setter 메서드라고 부릅니다.

      # setter method

     1. setter는 숨겨진 변수에 값을 저장하기 위한 메서드 입니다.

     2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여
      적절한 데이터만 멤버변수에 저장시키고, 접근제한자는
      public으로 설정하여 외부에서 누구나 사용할 수 있게 합니다.

     3. 메서드 이름은 일반적으로 set + 필드이름 으로 설정합니다.
     */


    /*
         # getter method

         1. getter는 숨겨진 변수의 값을 참조할 때 사용하는 메서드입니다.

         2. setter와 마찬가지로 public제한을 통해 외부에 메서드를 공개하고,
          이름은 일반적으로 get + 멤버변수이름 으로 지정합니다.
         */
    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if(year < 1900 || year > 2025){
            System.out.println("잘못된 연도 입력입니다.");
            return;
        }
        this.year = year;
    }

    /*
     - month와 day의 setter / getter 메서드를 선언하세요.
     - month: 1 ~ 12
     - day: 1 ~ 31
     - getter 메서드는 따로 비밀번호 등 권한 검사 없이
      바로 return 속성값 해 주세요.
     */
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12){
            System.out.println("잘못된 월 입력입니다.");
            return;
        }
        this.month = month;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month == 0){
            System.out.println("일을 입력하기 전 년도와 월은 선행입력입니다.");
            return;

        } else {
            if(!isValidateMonth(day)){
                this.day = day;
            };
        }
    }

    private boolean isValidateMonth(int day) {
        if(day < 1 || day > 31){
            System.out.println("잘못된 일 입력입니다.");
            return true;
        } else if (this.month == 2) {
            if(year % 4 == 0 && year /100 !=0 && day > 29){
                System.out.println("윤년에는 29일 초과할 수 없습니다.");
            }
            else{
                System.out.println("평년은 28일까지밖에 없습니다.");
                return true;
            }
        } else if (this.month%2 != 0) {
            if(day > 30) {
                System.out.println( "해당월은 30일 까지입니다.");
                return true;
            }
        }
        return false;
    }
    /*
     - 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들을
      캡슐화 라고 합니다. (encapsulation)
      데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위함 입니다.
     */

    void birthInfo(){
        if(year != 0 || month != 0 || day != 0){
            System.out.printf("생일은 %d년 %d월 %d일 입니다.", this.year,this.month,this.day);
        }
    }


}
