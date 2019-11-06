package com.academy.lesson05.date;

public abstract class Date {
    /*    1) a) Создать класс Date, который имеет следующие поля:
            - день
            - месяц
            - год

        Все поля должны быть помечены модификатором private
            - реализовать конструкторы:
        по умолчанию public Date() // инициировать 1 января 1970
        который инициализирует все поля public Date(int day, int month, int year)
        конструктор копирования public Date(Date date)

            - реализовать возможность установки нового значения времени с помощью методов:
        set(int day, int month, int year);
        set(Date date);
        в первом случае проверять корректность полей: day, month, year

            - реализовать методы:
        int getDay();
        int getMonth();
        int getYear();
        которые возвращают день, месяц и год, соответственно

            -* реализовать методы:
        String getDayOfWeek();
        который возвращает день недели: пн, вт, ср и тд.
        int getWeekOfYear();
        которые вычисляет номер недели в году

            - реализовать методы:
        nextDay();
        nextMonth();
        nextYear();
        которые увеличивают на единицу значение дня, месяца и года соответственно

            -* реализовать метод addDays(int days);
        который добавляет кол-во дней 'days' к текущей дате

            -* реализовать метод checkData(int day, int month, int year), который проверяет существование введенной даты
            -* использовать проверку checkData в конструкторах при создании класса и при попытке изменить поле методом set,
        в случае ошибки не проводить изменение, а вывести сообщение на консоль
            -** реализовать метод differenceInDays(int day, int month, int year), который принимает другую дату и вычисляет в
        днях между датами

            - переопределить метод toString();
        который возвратит строковое представление даты: 25.01.2017
                - переопределить метод equals(Object obj) и hashCode() // использовать автогенерацию
                - реализовать метод printData();
        который выводит дату в форматированном виде, напр. 25.01.2017*/
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public void setDay(int day) {
        this.day = day;
        if (day > 31 || day <= 0) System.out.println("Error 01: Enter correct day");
    }

    public void setMonth(int month) {
        this.month = month;
        if (month > 12 || month <= 0) System.out.println("Error 02: Enter correct month");
    }

    public void setYear(int year) {
        this.year = year;
        if (year > 10000 || year <= 0) System.out.println("Error 03: Enter correct year");
    }

    public void print() {
        System.out.println(day + "." + month + "." + year);
    }

    public double nextDay() {
        return day++;
    }

    public double nextMonth() {
        return month++;
    }

    public double nextYear() {return year++;}

}
