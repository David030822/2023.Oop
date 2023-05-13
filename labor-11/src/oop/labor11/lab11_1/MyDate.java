package oop.labor11.lab11_1;

public class MyDate implements Comparable<MyDate> {
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

    @Override
    public int compareTo(MyDate o) {
        if(this.year != o.year){
            return this.year - o.year;
        }
        if(this.month != o.month){
            return this.month - o.month;
        }
        return this.day - o.day;
    }
}
