package basic.datatype;

public class CastingExample3 {
    public static void main(String[] args) {
        char c = 'b';
        int i = 2;

        int intResult = c + i;
        char charResult = (char) (c + i);

        System.out.println("intResult = " + intResult);
        System.out.println("charResult = " + charResult);
        
        /// /////////////// int와  int의 연산은 int 연산전 원하는 데이터 타입으로 형변환 후 진행
        
        int k=10;
        double d = k/4;
        System.out.println("d = " + d);
    }
}
