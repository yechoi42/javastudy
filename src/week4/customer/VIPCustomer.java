package week4.customer;

/*
Java에서의 상속
- 다중 상속을 받는 것은 불가능
- class 자식 extends 부모
- 하위 클래스가 생성될 때 상위 클래스가 먼저 생성됨
- 상위 클래스 생성자 호출 -> 하위 클래스 생성자 호출
- 하위클래스에서 상위 클래스 생성자 호출하는 코드가 없으면,
  컴파일러는 상위 클래스 생성자를 호출하기 위한 super()를 추가
- 이때 기본 생성자가 호출 됨. 기본생성자가 없으면 하위 클래스는 명시적으로 호출해야.
- super는 부모 클래스를 가리킴
 */
public class VIPCustomer extends Customer{
    public VIPCustomer(int id, String name) {
        super(id, name);
        this.level = "VIP";
    }

    public int calcPrice(int price) {
        this.point += price * 0.05;
        return ((int)(price * 0.9));
    }
}
