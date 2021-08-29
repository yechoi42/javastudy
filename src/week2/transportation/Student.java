package week2.transportation;

public class Student {
    String name;
    int grade;
    int money;

    public Student(String name, int money)
    {
        this.name=name;
        this.money=money;
    }
    public void takeCoffee(Coffee coffee)
    {
        System.out.printf("%s가 커피를 마십니다.\n", this.name);
        coffee.take(coffee.getPrice());
        money-=coffee.getPrice();
    }
    public void takeBus(Bus bus)
    {
        System.out.printf("%s가 버스를 탑니다.\n", this.name);
        bus.take(1000);
        money-=1000;
    }
    public void takeSubway(Subway subway)
    {
        System.out.printf("%s가 지하철을 탑니다.\n", this.name);
        subway.take(1200);
        money-=1200;
    }
    public void showInfo()
    {
        System.out.println(name+"의 남은 돈은 "+money+"원입니다.");
    }
}
