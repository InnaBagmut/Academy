package com.academy.lesson06.enumeration.weekdays;

import static com.academy.lesson06.enumeration.weekdays.WeekDay.*;

public class TestEnumeration {
    public static void main(String[] args) {
        UseWeekDay myObject = new UseWeekDay();
        myObject.setToday(MONDAY);
        System.out.println(myObject);
        System.out.println(myObject.getToday());
        myObject.dayAfterTomorrow();

        System.out.println("This is an array filled by days of the week:");
        WeekDay[] daysArray = {SUNDAY, THURSDAY, MONDAY, FRIDAY, TUESDAY};
        for (int i = 0; i < daysArray.length; i++) {
            System.out.println(daysArray[i]);
        }

        System.out.println("This is demo of the name:");
        System.out.println(WeekDay.SATURDAY.getName());
    }
}
