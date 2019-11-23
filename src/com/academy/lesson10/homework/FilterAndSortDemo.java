package com.academy.lesson10.homework;

import com.academy.lesson05.date.Date;
import com.academy.lesson10.homework.ComparatorDateImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FilterAndSortDemo {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(23, 12, 2019));
        dates.add(new Date(22, 3, 1987));
        dates.add(new Date(9, 9, 1999));

        Collections.sort(dates);
        System.out.println(dates);

        //dates.sort(new ComparatorDateImplementation());
        //System.out.println(dates);

        System.out.println("С помощью лямбды по дням:");
        //dates.sort((o1, o2) -> o1.getYear().compareTo(o2.getYear()));

    }
}
