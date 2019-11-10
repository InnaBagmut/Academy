package com.academy.lesson06.enumerationHomeWork;

import static com.academy.lesson06.enumerationHomeWork.WeekDays.*;

public class TestEnumeration {
    public static void main(String[] args) {
        UseWeekDays myObject = new UseWeekDays();
        myObject.setOneDay(MONDAY);
        System.out.println(myObject);

        System.out.println("This is an array filled by days of the week:");
        WeekDays[] daysArray = {SUNDAY, THURSDAY, MONDAY, FRIDAY, TUESDAY};
        for (int i = 0; i < daysArray.length; i++) {
            System.out.println(daysArray[i]);
        }

        System.out.println("This is demo of the name:");
        System.out.println(WeekDays.SATURDAY.getName());


    }
}
