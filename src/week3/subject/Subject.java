package week3.subject;

public class Subject {
    private int score;
    private String subjectName;

    public String getSubjectName() {
        return this.subjectName;
    }

    public int getScore() {
        return this.score;
    }
    public Subject(String subjectName, int score) {
        this.score = score;
        this.subjectName = subjectName;
    }
}
