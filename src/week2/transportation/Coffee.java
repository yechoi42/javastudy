package week2.transportation;

public class Coffee {
    int income;
    String brand;
    String menu;
    int price;
    public Coffee(String menu,String brand, int price)
    {
        this.income = 0;
        this.menu=menu;
        this.brand=brand;
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
    public void take(int income)
    {
        this.income+=income;
    }
    public void coffeeInfo()
    {
        System.out.println(brand+"에서 파는 "+menu+"의 가격은 "+income+"원입니다.");
    }
}
