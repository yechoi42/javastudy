package week1.student;

public class Student {
    private int studentNumber = 0;
    public String name = "javastudy/week1/student";
    private int grade = 0;
    public Student() {}
    public Student(int studentNumber, String name, int grade) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.grade = grade;
    }
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void printStudentInfo() {
        System.out.println("학번: "+this.studentNumber);
        System.out.println("이름: "+this.name);
        System.out.println("학년: "+this.grade+"학년");
    }
}
