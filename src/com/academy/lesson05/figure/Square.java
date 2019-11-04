package com.academy.lesson05.figure;

import java.util.Objects;

public class Square extends Figure {
    private double side;
    // private String color;

    public Square(double side) {
        super("black"); // вызов конструктора базового класса
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
