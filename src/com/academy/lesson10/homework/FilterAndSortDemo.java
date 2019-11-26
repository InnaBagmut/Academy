/*1) a) Создать List<Date> с разными значениями даты
        (Date использовать реализовнный ранее).
        b) Отсортировать даты по возрастанию и вывести список
        с) Отфильтровать список, оставив только даты с месяцами:
        январь февраль март
        d) Выполнить сортировку
        по годам по убыванию
        по месяцам по возрастанию
        по дням по возрастанию
        => 01.01.2019, 01.01.2018, 01.02.2018, 02.02.2018, 01.01.2017*/

package com.academy.lesson10.homework;

import com.academy.lesson05.date.Date;
import com.academy.lesson10.homework.ComparatorDateImplementation;

import java.util.*;


public class FilterAndSortDemo {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(23, 12, 2019));
        dates.add(new Date(22, 3, 1987));
        dates.add(new Date(9, 9, 1999));

        Collections.sort(dates);
        System.out.println(dates);

        dates.sort(new ComparatorDateImplementation());
        System.out.println(dates);

        System.out.println("Sorting by Day up due to lambda:");
        dates.sort((o1, o2) -> {
            if (o1.getDay() < o2.getDay()) return -1;
            if (o1.getDay() > o2.getDay()) return 1;
            return 0;
        });
        System.out.println(dates);

        System.out.println("Attempting to filter Collection by month:");
        Arrays.stream(new List[]{dates}).filter(n -> n.equals(2)).forEach((System.out::println));
    }
}
