package oop.labor11.lab11_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("labor11");

        ArrayList<MyDate> dates = new ArrayList<>();
        Random rand = new Random();

        while(dates.size() != 10){
            int year = rand.nextInt(2050);
            int month = rand.nextInt(13);
            int day = rand.nextInt(32);

            if(DateUtil.isValidDate(year, month, day)){
                MyDate date = new MyDate(year, month, day);
                dates.add(date);
            }
        }

        Collections.sort(dates);
        //dates.forEach((e) -> System.out.println(e));
        dates.forEach(System.out::println);

    }
}
