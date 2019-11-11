package com.academy.lesson06.enumeration.weekdays;

import static com.academy.lesson06.enumeration.weekdays.WeekDay.*;

public class TestEnumeration {
    public static void main(String[] args) {
        UseWeekDay myObject = new UseWeekDay();
        myObject.setToday(MONDAY);
        System.out.println(myObject);
        System.out.println(myObject.getToday());
        System.out.println("Day After Tomorrow Option1:");
        myObject.dayAfterTomorrowOption1();

        WeekDay day = SUNDAY;
        System.out.println("Day After Tomorrow Option2:");
        //WEDNESDAY.dayAfterTomorrowOption2();
        WeekDay dayAfterTomorrow = day.dayAfterTomorrowOption2();
        System.out.println("2 days after " + day + " is " + dayAfterTomorrow);

        System.out.println("Day Before Yesterday:");
        //TUESDAY.dayBeforeYesterday();
        WeekDay dayBeforeYesterday = day.dayBeforeYesterday();
        System.out.println("2 days before " + day + " is " + dayBeforeYesterday);

        System.out.println("This is an array filled by days of the week:");
        WeekDay[] daysArray = {SUNDAY, THURSDAY, MONDAY, FRIDAY, TUESDAY};
        for (int i = 0; i < daysArray.length; i++) {
            System.out.println(daysArray[i]);
        }

        System.out.println("This is demo of the name:");
        System.out.println(WeekDay.SATURDAY.getName());
    }
}
