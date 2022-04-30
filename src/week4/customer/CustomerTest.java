package week4.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.point = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.point = 10000;
        System.out.println(customerKim.showCustomerInfo());

        GoldCustomer customerPark = new GoldCustomer(10030, "박혁거세");
        customerPark.point = 10000;
        System.out.println(customerPark.showCustomerInfo());

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);
        int pricePark = customerPark.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
        System.out.println(customerPark.showCustomerInfo() + " 지불금액은 " + pricePark + "원 입니다.");
    }
}
