package oop.labor02;

public class MyDate {
    private int year, month, day;

    public MyDate(int pyear, int pmonth, int pday) {
        if (DateUtil.isValidDate(pyear, pmonth, pday)) {
            year = pyear;
            month = pmonth;
            day = pday;
        } else System.out.println("invalid date");
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return year + " " + month + " " + day;
    }
}
