package week2.transportation;

public class Bus {
    int bus_number;
    int count;
    int income;
    public Bus(int bus_number)
    {
        this.bus_number=bus_number;
    }
    public void take(int income)
    {
        this.income+=income;
        count++;
    }
    public void showBusInfo()
    {
        System.out.println(bus_number+"번 버스의 승객의 수는 "+count+"이고, 수입은 "+income+"입니다.");
    }
}
