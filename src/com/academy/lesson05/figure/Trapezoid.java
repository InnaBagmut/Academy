package com.academy.lesson05.figure;

public class Trapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public Trapezoid(String color) {
        super(color);
    }

    public Trapezoid(double upperBase, double lowerBase, double height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Trapezoid with bases %.2f, %.2f, height %.2f and color = %s", upperBase, lowerBase, height, color));
    }

    @Override
    public double area() {
        return (upperBase + lowerBase) * height / 2;
    }
}
