package week6;
/*
클래스와는 달리 인터페이스의 모든 필드는 public static final이어야 하며
- static은 알다시피 클래스 변수이다.
- 그러므로 static final은 객체(인스턴스)가 아닌 클래스에 존재하는 단 하나의 상수이다.
- 즉 객체마다 값이 바뀌는 것이 아닌 클래스에 존재하는 상수이므로 선언과 동시에 초기화를 해 주어야하는 클래스 상수이다.
모든 메소드는 public abstract이어야 합니다.
이 부분은 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있습니다.
이렇게 생략된 제어자는 컴파일 시 자바 컴파일러가 자동으로 추가해 줍니다.
 */
public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
