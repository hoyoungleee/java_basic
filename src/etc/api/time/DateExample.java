package etc.api.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date.getMonth());

        System.out.println("|======================");

        // 현재 날짜 정보 (연, 월, 일)
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        // 현재 시간 정보 (시, 분, 초)
        LocalTime now1 = LocalTime.now();
        System.out.println("now1 = " + now1);

        // 현재 날짜와 시간 정보 얻기 (연, 월, 일, 시, 분, 초)
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("now2 = " + now2);


        System.out.println("==================================");

        //특정 날짜와 시간 정보 얻기
        LocalDateTime localDateTime = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println("localDateTime = " + localDateTime);

        // 연, 월, 일 따로 추출
        int year = now2.getYear();
        System.out.println("year = " + year);

        //문자 형태의 월 리턴
        Month month = now2.getMonth();
        System.out.println("month = " + month);

        // 정수 형태의 월 리턴
        int monthValue = now2.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        //일 추출
        int dayOfMonth = now2.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        // 요일 추출
        DayOfWeek dayOfWeek = now2.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        // 일년 중 몇번째 날인가?
        int dayOfYear = now2.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);

        // 지금으로부터 3일 뒤
        LocalDateTime localDateTime1 = now2.plusDays(3);
        System.out.println("localDateTime1 = " + localDateTime1);

        // 지금으로부터 1년 2개월 7일뒤
        //하나의 함수가 완료되면 값취급. 거기에 함수를 이어써서 변수의 사용을 줄임(메소드 체이닝)
        LocalDateTime plusDays = now2.plusYears(1).plusMonths(2).plusDays(7);
        System.out.println("plusDays = " + plusDays);

        // 지금부터 9개월 23일전
        LocalDateTime localDateTime2 = now2.minusMonths(9).minusDays(23);
        System.out.println("localDateTime2 = " + localDateTime2);

        // 사이 날짜 연산
        LocalDate b = LocalDate.of(2020, 12, 30);
        LocalDate f = LocalDate.of(2022, 9, 14);
        //해당 날짜 간 일 차이
        long between = ChronoUnit.DAYS.between(b, f);
        System.out.println("between = " + between);

        //해당 날짜 간 주 차이
        long between2 = ChronoUnit.WEEKS.between(b, f);
        System.out.println("between = " + between2);

        //해당 날짜 간 월 차이
        long between3 = ChronoUnit.MONTHS.between(b, f);
        System.out.println("between = " + between3);

        //해당 날짜 간 연 차이
        long between4 = ChronoUnit.YEARS.between(b, f);
        System.out.println("between = " + between4);

        System.out.println("=======================================");

        System.out.println(now2);

        // 날짜 포맷 변경하기
        //yyyy(년), MM(월), dd(일), E(요일), a(오전,오후), hh(12시간기준), HH(24시간), mm(분),  ss(초)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");

        //준비한 DateTimeFormatter 객체를 format()의 매개값으로 전달.
        String formatDate = now2.format(dtf);
        System.out.println("formatDate = " + formatDate);


    }
}
