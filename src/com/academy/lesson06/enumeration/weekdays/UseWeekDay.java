package com.academy.lesson06.enumeration.weekdays;

public class UseWeekDay {
    protected WeekDay today;

    public WeekDay getToday() {
        return today;
    }

    public void setToday(WeekDay today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "UseWeekDays{" +
                "today=" + today +
                '}';
    }

    public void dayBeforeYesterday(WeekDay direction) {
        //getOneDay() += oneDay;
/*        switch (direction) {
            case MONDAY:
                return "Суббота";
            break;
        }*/
    }

    public void dayAfterTomorrow() {
        if (today == WeekDay.MONDAY) System.out.println("The day after tomorrow is Wednesday");
        else if (today == WeekDay.TUESDAY) System.out.println("The day after tomorrow is Thursday");
        else System.out.println("The day after tomorrow is undefined");
    }
}
