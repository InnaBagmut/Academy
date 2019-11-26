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
