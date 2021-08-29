package week2.transportation;

public class Coffee {
    int income;
    int count;
    String brand;
    String menu;
    int price;
    public Coffee(String menu,String brand, int price)
    {
        this.income = 0;
        this.count = 0;
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
        this.count++;
    }
    public void showCoffeeInfo()
    {
        System.out.println(brand+"에서 파는 "+menu+"을 마신 사람은 "+count+ "명이고, 수입은 " + income +"원입니다.");
    }
}
