import name.MyName;
import calculator.CalculatorTester;
import student.Student;
import human.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== 이름 =====");
        MyName myName = new MyName("Choi Yeji");
        System.out.println(myName.getName());

        System.out.println("\n===== 사칙연산 =====");
        CalculatorTester tester = new CalculatorTester(4, -5);
        tester.printNumbers();
        System.out.println("Addition Test Result: "+tester.checkAddition());
        System.out.println("Subtraction Test Result: "+tester.checkSubtraction());
        System.out.println("Multiplication Test Result: "+tester.checkMultiplication());
        System.out.println("Division Test Result: "+tester.checkDivision());

        System.out.println("\n===== 학생정보 =====");
        Student student = new Student(2013182033, "최예지", 1);
        student.printStudentInfo();

        System.out.println("\n===== 참조변수 =====");
        Student studentLee = new Student();
        studentLee.name = "이순신";
        System.out.println(studentLee);

        System.out.println("\n===== 사람정보 =====");
        Human jane = new Human("제인");
        jane.setAge(30);
        jane.setGender("female");
        jane.setIsMarried(true);
        jane.setChildrenNumber(1);
        jane.printInfo();
    }
}
