package com.academy.lesson06.enumerationHomeWork;

public class UseWeekDays {
    protected WeekDays today;

    public WeekDays getToday() {
        return today;
    }

    public void setToday(WeekDays today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "UseWeekDays{" +
                "today=" + today +
                '}';
    }

    public void dayBeforeYesterday(WeekDays direction) {
        //getOneDay() += oneDay;
/*        switch (direction) {
            case MONDAY:
                return "Суббота";
            break;
        }*/
    }

    public void dayAfterTomorrow() {
        if (today == WeekDays.MONDAY) System.out.println("The day after tomorrow is Wednesday");
        else if (today == WeekDays.TUESDAY) System.out.println("The day after tomorrow is Thursday");
        else System.out.println("The day after tomorrow is undefined");
    }
}
