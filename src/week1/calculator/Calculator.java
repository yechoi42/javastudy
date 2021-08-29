package calculator;

public class Calculator {
    protected int num1 = 0;
    protected int num2 = 0;
    public Calculator() {}
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add() {
        return (this.num1 + this.num2);
    }
    public int subtract() {
        return (this.num1 - this.num2);
    }
    public int multiply() {
        return (this.num1 * this.num2);
    }
    public float division() {
        return (this.num1 / this.num2);
    }
}
