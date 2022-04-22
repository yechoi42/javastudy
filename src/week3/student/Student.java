package week3.student;

public class Student {
    String studentName;
    static int serialNum = 1000;
    int studentID;

    public Student()
    {
        this.studentID = ++serialNum;
    }

    public void setStudentName(String name)
    {
        this.studentName = name;
    }

    static public int getSerialNum()
    {
        return serialNum;
    }
}
