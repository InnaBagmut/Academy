package com.academy.lesson04;

public class Currency {
    /*    Класс Currency для работы с денежными суммами.
        - Класс должен быть представлен двумя private полями:
        double value; для хранения значания суммы
        String name; для хранения названия валюты ("грн", "руб", "$")

        Реализовать 2 конструктора:
            - без параметров
            - и с двумя параметрами, которые принимает (double value, String name);
            - конструктор копирования: (Currency currency)

            - Реализовать метод отображения суммы на экран print();
        Напр. в виде: 154.65руб // отображать не более 2 знаков после запятой

            - Реализовать операцию сравнения:
        boolean isEqual(Currency currency); // вернет true, если и значение и строка - совпадают

            - Реализовать методы:
        void sum(Currency currency); // метод сложения
                (если name отличается от текущего поля 'name', то сложение не производить,
        а вывести сообщение об ошибке ("Error: currency names are differ 'грн' - 'руб')

                void substract(Currency currency); // метод вычитания ...
                void divide(double factor); // деление суммы на число
                void multiply(double factor); // умножение суммы на число*/
    private double value;
    private String name;

    public Currency() {
        this.value = 0;
        this.name = null;
    }

    public Currency(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public void print() {
        System.out.println(value + name);
    }

    boolean isEqual(Currency currency) {
        if (value == value) return true;
        return false;
    }

    void sum(Currency currency) {
        if (name != name)
            System.out.println("Error: currency names are differ" + "'" + name + "'" + " " + "'" + name + "'");
    }
    void substract(Currency currency) {
        double substr = value - value;
    }
    void divide(double factor) {
        factor = value/value;
    }
    void multiply(double factor) {
        factor = value * value;
    }
}
