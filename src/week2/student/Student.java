package week2.student;
import week2.student.Subject;

public class Student {
    private int studentID;
    private String studentName;
    private Subject korean;
    private Subject math;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.korean = new Subject("국어", 0);
        this.math = new Subject("수학", 0);
    }

    public void setKorean(String name, int score) {
        this.korean.setSubject(name, score);
    }

    public void setMath(String name, int score) {
        this.math.setSubject(name, score);
    }

    public int getTotalScore() {
        return this.korean.getScore() + this.math.getScore();
    }

    public void showStudentInfo() {
        System.out.printf("학생 %s의 총점은 %d입니다.\n", this.studentName, this.getTotalScore());
    }
}
