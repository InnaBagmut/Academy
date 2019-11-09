package com.academy.lesson06;

public class ComponentDemo {
    public static void main(String[] args) {
        Component[] componentsArray = {new Button(), new RoundButton(), new CheckBox(), new Label()};
        componentsArray[1].draw();

        for (int i = 0; i < componentsArray.length; i++) {
            componentsArray[i].draw();
        }

        System.out.println("And only Button and her inheritors:");

        for (int i = 0; i < componentsArray.length; i++) {
            if (componentsArray[i] == new Button()) componentsArray[i].draw();
            // не правильно сделала, ничего не выводит и не знаю, как вывести наследников класса Button
        }
    /*        Object object = new Object();
        Object objectButton = new Button(); */
/*        if (componentsArray[0] instanceof Button)
            ((Button)componentsArray[0].push());
        else componentsArray[0].show();*/


    }
}
