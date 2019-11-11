package com.academy.lesson06.enumeration.weekdays;

public enum WeekDay {
    SUNDAY("Воскресенье"),
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private String name;

    WeekDay(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name() + " " + ordinal();
    }

    WeekDay next() {
        WeekDay day = values()[(ordinal() + 1) % values().length];
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

