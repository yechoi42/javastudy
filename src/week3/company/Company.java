package week3.company;

/*
Singleton 패턴이란?
클래스가 최초 한번만 메모리를 할당하고(static)
그 메모리에 객체를 만들어 사용하는 디자인 패턴

왜 사용할까?
- 한번 생성 후 재사용, 메모리 낭비 방지
- 전역성으로 띄어 다른 객체와 공유

문제점은?
- 다른 객체간의 결함도가 높아져서 객체 지향 설계 원칙에 어긋남
- 생성 방식에 따라 멀티쓰레드 환경에서 취약할 수 있음

참고: https://elfinlas.github.io/2019/09/23/java-singleton/
 */

public class Company {

    private Company()  {}

    /*
    CompanyHolder는 getInstance() 메소드가 호출되기 전에는 참조되지 않음
    getInstance() 메소드가 호출될 때 싱글톤 객체 생성해 리턴
    instance가 static 변수이기 때문에 클래스 로딩 시점에 한번만 호출
    final 키워드로 값이 다시 할당되지 않음
     */
    private static class CompanyHolder {
        private static final Company instance = new Company();
    }

    public static Company getInstance() {
        return CompanyHolder.instance;
    }
}
