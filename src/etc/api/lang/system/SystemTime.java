package etc.api.lang.system;

public class SystemTime {
    public static void main(String[] args) {

        //1970년 1월 1일 자정을 기준으로 현재까지 흐른 유닉스 시간을 밀리세컨드(1/1000초) 단위로 반환
        //System.out.println(System.currentTimeMillis());

        long start = System.currentTimeMillis();

        int total = 0;
        for (int i = 0; i < 2000000000; i++) {

            total += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("실행 소요시간: " + (end-start)*0.001 + "초");

        System.out.println(System.getProperties());
    }
}
