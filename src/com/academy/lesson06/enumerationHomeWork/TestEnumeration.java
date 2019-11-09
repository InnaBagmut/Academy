package com.academy.lesson06.enumerationHomeWork;

import static com.academy.lesson06.enumerationHomeWork.WeekDays.MONDAY;

public class TestEnumeration {
    public static void main(String[] args) {
        UseWeekDays myObject = new UseWeekDays();
        myObject.setOneDay(MONDAY);
        System.out.println(myObject.toString());

    }
}
