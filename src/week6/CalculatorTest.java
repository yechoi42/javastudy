package week6;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int number1 = 4;
        int number2 = 2;

        System.out.println(calc.add(number1, number2));
        System.out.println(calc.substract(number1, number2));
        System.out.println(calc.times(number1, number2));
        System.out.println(calc.divide(number1, number2));
    }
}