package com.academy.lesson01;

public class AppMain02 {
    public static void main(String[] args) {
        if (args.length == 1) {
            String name = args[0];
            System.out.println("Hello " + name + "!");
        } else
            System.out.println("Hello!");
    }
}
