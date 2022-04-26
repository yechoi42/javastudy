package week3.subject;

import java.util.ArrayList;

public class Student {
    private int number;
    private String name;
    /*
    ArrayList는 List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트.
    자동적으로 capacity가 늘어난다.
     */
    private ArrayList<Subject> subjects;


    /*
    생성자가 호출되기 직전 호출되는 초기화 블럭
     */
    {
        this.subjects = new ArrayList<Subject>();
    }


    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    /**
     * add subject to Student class
     * @param score 과목 점수
     * @param subjectName 과목 이름
     */
    public void addSubject(String subjectName, int score) {
        subjects.add(new Subject(subjectName, score));
    }

    public void showStudentInfo() {
        int totalScore = 0;

        for (Subject subject: subjects) {
            System.out.printf("학생 %s의 %s 과목 성적은 %d이빈다.\n", this.name, subject.getSubjectName(), subject.getScore());
            totalScore += subject.getScore();
        }
        System.out.printf("학생 %s의 총점은 %d입니다.\n", this.name, totalScore);
    }
}
