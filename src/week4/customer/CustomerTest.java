package week4.customer;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.point = 1000;
//        System.out.println(customerLee.showCustomerInfo());
//
//        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//        customerKim.point = 10000;
//        System.out.println(customerKim.showCustomerInfo());
//
//        GoldCustomer customerPark = new GoldCustomer(10030, "박혁거세");
//        customerPark.point = 10000;
//        System.out.println(customerPark.showCustomerInfo());
//
//        int priceLee = customerLee.calcPrice(10000);
//        int priceKim = customerKim.calcPrice(10000);
//        int pricePark = customerPark.calcPrice(10000);
//
//        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
//        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
//        System.out.println(customerPark.showCustomerInfo() + " 지불금액은 " + pricePark + "원 입니다.");

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임당");
        Customer customerHong = new GoldCustomer(10030, "홍길동");
        Customer customerLee2 = new GoldCustomer(10040, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신");

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerLee2);
        customerList.add(customerKim);

        System.out.println("----- 고객 정보 출력 -----");
        for(Customer customer: customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("----- 할인율과 보너스 포인트 계산 -----");
        for(Customer customer: customerList) {
            customer.calcPrice(10000);
        }
    }
}
