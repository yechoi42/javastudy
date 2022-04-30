package week4.customer;

public class GoldCustomer extends Customer{
    public GoldCustomer(int id, String name) {
        super(id, name);
        this.level = "GOLD";
    }
    @Override
    public int calcPrice(int price) {
        this.point += price * 0.02;
        return (int)(price * 0.9);
    }
}
