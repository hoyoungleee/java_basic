package basic.datatype;

public class CastingExample2 {
    public static void main(String[] args) {
        
        int i = 72;
        char c = (char) i;
        System.out.println("c = " + c);

        double d = 4.123123;
        int j = (int)d ;
        System.out.println("j = " + j);

        int k= 1000;
        byte b = (byte) k;
        System.out.println("b = " + b);
    }
}
