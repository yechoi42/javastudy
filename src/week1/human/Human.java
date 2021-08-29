package human;

public class Human {
    private String name;
    private int age;
    private Gender gender;
    private boolean isMarried;
    private int childrenNumber;
    public Human() {}
    public Human(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        if (gender.equals("female") || gender.equals("여성")) {
            this.gender = Gender.FEMALE;
        } else if (gender.equals("male") || gender.equals("남성")) {
            this.gender = Gender.MALE;
        }
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    public void setChildrenNumber(int childrenNumber) {
        this.childrenNumber = childrenNumber;
    }
    public void printInfo() {
        System.out.printf("이름은 %s이고 나이는 %d살 입니다.\n", this.name, this.age);
        System.out.printf("성별은 %s이며, %s입니다. ", this.gender == Gender.FEMALE ? "여성" : "남성", this.isMarried ? "기혼자" : "미혼자");
        if (this.childrenNumber != 0){
            System.out.printf("자녀는 %d명이 있습니다", this.childrenNumber);
        } else {
            System.out.println("자녀는 없습니다.");
        }
    }
}

enum Gender {
    MALE, FEMALE
}
