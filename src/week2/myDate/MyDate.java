package week2.myDate;
import java.util.Arrays;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private boolean isLeapYear;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.isLeapYear = checkLeapYear();
    }

    public boolean checkLeapYear() {
        if((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0)
            return true;
        else
            return false;
    }

    public static boolean contains(int[] arr, int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

    public int getLastDayOfMonth(){
        int[] thirtyDays = new int[]{4,6,9,11};
        int[] thirtyOneDays = new int[]{1,3,5,7,8,10,12};

        if (contains(thirtyDays, this.month))
            return 30;
        else if (contains(thirtyOneDays, this.month))
            return 31;
        else if (isLeapYear && this.month == 2)
            return 29;
        else if (!isLeapYear && this.month == 2)
            return 28;
        return 30;
    }

    public boolean isValidDate() {
        int lastDayOfMonth = getLastDayOfMonth();
        if (this.day >= 1 && this.day <= lastDayOfMonth)
            return true;
        return false;
    }

    public boolean isValidMonth() {
        if (this.month >= 1 && this.month <= 12)
            return true;
        return false;
    }

    public boolean isValidYear() {
        if (this.year >= 1)
            return true;
        return false;
    }

    public String isValid() {
        if (isValidDate() && isValidMonth() && isValidYear())
            return String.format("%d년 %d월 %d일은 유효한 날짜입니다", this.year, this.month, this.day);
        return String.format("%d년 %d월 %d일은 유효하지 않은 날짜입니다", this.year, this.month, this.day);
    }
}
