package com.academy.lesson06.enumerationHomeWork;

public enum WeekDays {
    SUNDAY("Воскресенье"),
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name() + " " + ordinal();
    }

    WeekDays next() {
        WeekDays day = values()[(ordinal() + 1) % values().length];
        return day;
    }

    boolean isWeekend() {
        switch (this) {
            case SATURDAY:
            case SUNDAY:
                return true;
            default:
                return false;
        }


        }
    }

