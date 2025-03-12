package etc.enum_;

public class Main {


    public static void main(String[] args) {
        Devoloper kim = new Devoloper();
        kim.setName("김춘식");
        kim.setCareer(3);
        kim.setLang(Language.JAVA);

        Devoloper park = new Devoloper();
        park.setName("박영희");
        park.setCareer(5);
        park.setLang(Language.JAVASCRIPT);

        System.out.println("kim의 lang"+ kim.getLang().getName());
        System.out.println("park의 lang"+ park.getLang().getName());

        System.out.printf("%s의 주력 언어는  컴파일 언어인가? %s\n", kim.getName(), String.valueOf(kim.getLang().isCompileLang()));
        System.out.printf("%s의 주력 언어는  컴파일 언어인가? %s\n", park.getName(), String.valueOf(park.getLang().isCompileLang()) );


        // values() : 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴.
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println("value = " + value);
        }

        //ordinal(): 열거형 타입에 열거되어 있는 순서를 정수값으로 리턴
        System.out.println("park = " + park.getLang().ordinal());

        // valueOf("str") : 매개값으로 전달된 문자열과 일치하는 요소를 리턴
        System.out.println(Language.valueOf("CPP"));
//        System.out.println(Language.valueOf("melong"));

    }
}
