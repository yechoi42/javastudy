package week2.transportation;

public class Subway{
    int subway_number;
    int count;
    int income;
    public Subway(int subway_number)
    {
        this.subway_number=subway_number;
    }
    public void take(int income)
    {
        this.income+=income;
        count++;
    }
    public void showSubwayInfo()
    {
        System.out.println(subway_number+"번 지하철의 승객의 수는 "+count+"이고, 수입은 "+income+"입니다.");
    }
}
