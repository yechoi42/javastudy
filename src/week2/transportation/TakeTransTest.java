package week2.transportation;

public class TakeTransTest {
    public static void main(String[] args){
        Student studentJ=new Student("James",5000);
        Student studentT=new Student("Tomas",10000);
        Coffee coffee1=new Coffee("americano","starbucks", 3000);
        Coffee coffee2 = new Coffee("latte", "coffee bean", 4000);
        Bus bus100=new Bus(100);
        Subway subwayGreen=new Subway(2);

        System.out.println("=== 초기 금액 ===");
        studentT.showInfo();
        studentJ.showInfo();

        System.out.println("=== 커피 마시기 ===");
        studentT.takeCoffee(coffee1);
        studentT.showInfo();
        studentJ.takeCoffee(coffee2);
        studentJ.showInfo();

        System.out.println("=== 대중교통 이용하기 ===");
        studentJ.takeBus(bus100);
        studentJ.showInfo();
        studentT.takeSubway(subwayGreen);
        studentT.showInfo();

        System.out.println("=== 이용 금액 ===");
        coffee1.showCoffeeInfo();
        coffee2.showCoffeeInfo();
        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
    }
}
