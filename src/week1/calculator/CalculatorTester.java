package calculator;


public class CalculatorTester extends Calculator {
    public CalculatorTester(int num1, int num2) {
        super(num1, num2);
    }
    public void printNumbers() {
        System.out.printf("num1 is %d and num2 is %d.\n", num1, num2);
    }
    public boolean checkAddition() {
        return (super.add() == (num1 + num2));
    }
    public boolean checkSubtraction() {
        return (super.subtract() == (num1 - num2));
    }
    public boolean checkMultiplication() {
        return (super.multiply() == (num1 * num2));
    }
    public boolean checkDivision() {
        return (super.division() == (float)(num1 / num2));
    }
}
