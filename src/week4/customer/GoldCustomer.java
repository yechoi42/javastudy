package week4.customer;

public class GoldCustomer extends Customer{
    public GoldCustomer(int id, String name) {
        super(id, name);
        this.level = "GOLD";
        this.saveRate = 0.02;
        this.discountRate = 0.1;
    }
}
