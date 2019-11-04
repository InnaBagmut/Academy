package com.academy.lesson05.figure;

public class TestCircle {
    public static void testCircle() {
        Circle myObject1 = new Circle(5);
        double areaActual = myObject1.area();
        double areaExpected = Math.PI * 25;
        System.out.println(areaActual == areaExpected);
        Circle myObject2 = new Circle(5); // ссылки у проектов разные

        System.out.println(myObject1);

        System.out.println(myObject1.equals(myObject2));
    }

}
