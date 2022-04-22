package week3.student;

/*
정적 멤버(static 변수, static 메소드)
- class에 고정된 멤버
- gc가 관여 X, 남발하면 시스템 성능에 악영향
- 모든 객체가 메모리 공유.

 */

import week3.student.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이순신");
        System.out.println(Student.getSerialNum());
        System.out.println(studentLee.studentName+ "학번:" + studentLee.studentID);

        Student studentSon = new Student();
        studentSon.setStudentName("손흥민");
        System.out.println(Student.getSerialNum());
        System.out.println(studentSon.studentName + "학번:" + studentSon.studentID);
    }
}
