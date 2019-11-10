package com.academy.lesson06.enumerationHomeWork;

public class UseWeekDays {
    protected WeekDays oneDay;

    public WeekDays getOneDay() {
        return oneDay;
    }

    public void setOneDay(WeekDays oneDay) {
        this.oneDay = oneDay;
    }

    @Override
    public String toString() {
        return "UseWeekDays{" +
                "oneDay=" + oneDay +
                '}';
    }

    public void dayBeforeYesterday(WeekDays direction) {
        //getOneDay() += oneDay;
        switch (direction) {
            case MONDAY:
               // oneDay--;
                break;
        }
    }

    public void dayAfterTomorrow() {

    }
}
