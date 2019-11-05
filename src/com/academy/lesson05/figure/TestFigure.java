package com.academy.lesson05.figure;

public class TestFigure {
    public static void main(String[] args) {
        //TestCircle.testCircle();
        //testSquare();
        testTrapezoid();
    }

    public static void testSquare() {
        Square myObject1 = new Square(3); // black
        Square myObject2 = new Square(5, "Orange");
        Square myObject3 = new Square(5, "Orange");
        myObject2.getColor();  // Этот метод берется из базового класса

        double sideActual = myObject1.getSide();
        double sideExpected = 5;
        double areaActual = myObject1.area();
        double areaExpected = 9;

        if (areaActual == areaExpected)
            System.out.println("Test passed");
        else System.out.println("Test failed");

        myObject1.setSide(6);
        myObject1.draw();

        System.out.println(myObject2);
        System.out.println(myObject2.equals(myObject3));
    }

    @Override
    public String toString() {
        return "TestFigure{}";
    }

    public static void testTrapezoid() {
        Trapezoid myObject1 = new Trapezoid("Blue");
        myObject1.setUpperBase(10);
        myObject1.setLowerBase(10);
        myObject1.setHeight(10);
        System.out.println(myObject1);
        System.out.println(myObject1.area());
        double heightActual = myObject1.getHeight();
        double heightExpected = 10;
        if (heightActual == heightExpected) System.out.println("Test passed");
        else System.out.println("Test failed");
        System.out.println("=====================================");
        System.out.println(heightActual);

        Trapezoid myObject2 = new Trapezoid(23.34253, 4534.32432, 324.234, "Grey");
        myObject2.draw();
    }
}
