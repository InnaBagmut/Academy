package com.academy.lesson08.exeption.homework;

import com.academy.lesson05.date.Date;

public class DateDemo {
    public static void main(String[] args) {
        try {
            CorrectDate date1 = new CorrectDate(15, 12, 2019);
            CorrectDate date2 = new CorrectDate(-1, 22, 2000);
        } catch (IllegalDateException e) {
            //System.out.println("Enter valid data");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
