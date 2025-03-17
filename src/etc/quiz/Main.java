package etc.quiz;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        List<Transaction> tr2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());///가변 리스트로 받기
//                .collect(Collectors.toSet());///셋으로 받기

        tr2021.forEach(System.out::println);

        System.out.println("===================================================");

        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        List<String> cities = transactions.stream()
                .map(trs -> trs.getTrader().getCity())
                .distinct()
                .collect(toList());

        System.out.println("cities = " + cities);

        System.out.println("===================================================");

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        transactions.stream()                                    // equalsIgnoreCase 대소문자 구분 없이 글자만 비교
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                        .map(trs -> trs.getTrader())
                                .sorted(Comparator.comparing(trader -> trader.getName()))
                                        .toList()
                                                .forEach(trader -> System.out.println(trader));


        System.out.println("===================================================");

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환

        List<String> list = transactions.stream()
                .map(trs -> trs.getTrader().getName())
                .distinct()
                .sorted() //정렬기준 따로 줄필요 없음 -> 이름만 mapping 했기 때문
                .toList();
        System.out.println(list);


        System.out.println("===================================================");

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions.stream()
                .anyMatch(trs -> trs.getTrader().getCity().equalsIgnoreCase("milan"));
        System.out.println("flag1 = " + flag1);


        System.out.println("===================================================");
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.

        int sum = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .mapToInt(transaction -> transaction.getValue())
                .sum();
        System.out.println("sum = " + sum);


        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?

        int max = transactions.stream()
                .mapToInt(trs -> trs.getValue())
                .max()
                .getAsInt();
        System.out.println("max = " + max);


        System.out.println("===================================================");
        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        int min = transactions.stream()
                .mapToInt(trs -> trs.getValue())
                .min()
                .getAsInt();
        System.out.println("min = " + min);
        transactions.stream()
                        .filter(trs -> trs.getValue() == min)
                                .toList()
                                        .forEach(transaction -> System.out.println("transaction = " + transaction));

        System.out.println("===================================================");
        // 연습 9. 거래액이 500이상인 거래들만 필터링 하고 출력

        transactions.stream()
                        .filter(transaction -> transaction.getValue() >= 500)
                                .toList()
                                        .forEach(transaction -> System.out.println("transaction = " + transaction));
        System.out.println("===================================================");
        // 연습 10. 가장 작은 거래액보다
        // 큰 거래액을 가진 거래의 평균
        //출력값 : 752.0
        double asDouble = transactions.stream()
                .filter(trs -> trs.getValue() > min)
                .mapToInt(trs -> trs.getValue())
                .average()
                .getAsDouble();

        System.out.println("asDouble = " + asDouble);

        System.out.println("===================================================");

        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래정보를 연도별로 그룹화 해서 출력하세요.

        /*
        Year: 2021
        {Trader: Brian in Cambridge, year: 2021, value: 300}
        {Trader: Raoul in Cambridge, year: 2021, value: 400}
        ...

        Year: 2022
        {Trader: Raoul in Cambridge, year: 2022, value: 1000}
        ...
         */
                // key: 거래연도, value: 거래내역을 담은 리스트
       /* HashMap<Integer, List<Transaction>> groupByYearMap = new HashMap<>();

        List<Transaction> trs2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .toList();

        List<Transaction> trs2022 = transactions.stream()
                .filter(trs -> trs.getYear() == 2022)
                .toList();

        groupByYearMap.put(2021, trs2021);
        groupByYearMap.put(2022, trs2022);*/

        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .collect(Collectors.groupingBy(transaction -> transaction.getYear()));

            // Map을 foreach 반복처리할때 매개변수를 두개선언
            // value가 List 이기 떄문에 한번더 forEach로 반복 처리
            cambridgeTrsMap.forEach((key, value) -> {
                System.out.println("year = " + key);
                value.forEach(transaction -> System.out.println(transaction));
            });
    }
}

