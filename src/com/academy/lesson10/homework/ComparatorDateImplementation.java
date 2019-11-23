package com.academy.lesson10.homework;

import com.academy.lesson05.date.Date;

import java.util.Comparator;

public class ComparatorDateImplementation implements Comparator<Date> {
    @Override
    public int compare(Date o1, Date o2) {
        if (o1.getYear() < o2.getYear())
            return 1;
        if (o2.getYear() < o1.getYear())
            return -1;
        return 0;
    }
}
