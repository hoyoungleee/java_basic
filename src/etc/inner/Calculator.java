package etc.inner;

//단하나의 추상메서드만을 가지게 강제 하는 어노테이션
@FunctionalInterface
public interface Calculator {
    // 계산 기능 명세
    int operate(int n1, int n2);
}
