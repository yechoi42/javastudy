package week4.customer;

/*
Java에서의 상속
- private 멤버는 상속시 사용할 수 없음
- protected는 같은 패키지, 같은 패키지와 상속받은 서브 클래스에서 접근 가능
- default는 같은 패키지 내 클래스 접근 가능
 */
public class Customer {
    protected int id;
    protected String name;
    protected String level;
    public int point;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.level = "SILVER";
    }

    public String showCustomerInfo() {
        return this.name + "의 등급은 " + this.level + "이며, 보너스 포인트는 " + Integer.toString(this.point) +"입니다.";
    }

    public int calcPrice(int price) {
        this.point += price * 0.01;
        return price;
    }
}
