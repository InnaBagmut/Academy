package com.academy.lesson05.date;

public class TestDate {
    /*    2) Протестировать классы Date, DateTime и DateTimeExt:
                - все конструкторы
            - метод toString()
            - метод equals()
            - все методы next...()
                - checkData, checkTime*/
    public static void main(String[] args) {
        testDate();
        testDateTime();
        testDateTimeExt();
    }

    public static void testDate() {
        Date myObject1 = new Date();
        myObject1.print();
        System.out.println(myObject1);
    }

    public static void testDateTime() {
        DateTime myObject1 = new DateTime();
        myObject1.print();
        System.out.println(myObject1);
    }

    public static void testDateTimeExt() {
        DateTimeExt myObject1 = new DateTimeExt();
        myObject1.print();
        System.out.println(myObject1);
    }
}
