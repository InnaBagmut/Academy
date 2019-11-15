package com.academy.lesson08.exeption.homework;

import com.academy.lesson05.date.Date;

public class CorrectDate extends Date {
    public CorrectDate() {
    }

    public CorrectDate(int day, int month, int year) throws IllegalDateException{
        super(day, month, year);

        if (day < 0 || month > 12 || year > 3000) throw new IllegalDateException("Enter correct value");
    }

    public CorrectDate(Date date) {
        super(date);
    }
}
