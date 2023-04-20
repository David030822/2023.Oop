package oop.labor02;

public class DateUtil {
    public static boolean leapYear(int year) {
        return year % 4 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year <= 0)
            return false;
        if (month > 0 && month < 7) {
            if (month == 2) {
                if (leapYear(year)) {
                    if (day < 30 && day > 0)
                        return true;
                } else if (day < 29 && day > 0)
                    return true;
            } else {
                if ((month & 1) == 0) {
                    if (day < 31 && day > 0)
                        return true;
                } else if (day < 32 && day > 0)
                    return true;
            }
        }
        if (month > 6 && month < 13) {

            if ((month & 1) != 0) {
                return day < 31 && day > 0;
            } else return day < 32 && day > 0;
        }
        return false;
    }
}
