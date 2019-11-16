package com.academy.lesson08.stringoperations;

public class CharAndSort {
    public static void toCharAndSort() {
        String word1 = "Constructor";
/*        word1.toCharArray();
        System.out.println(word1.toCharArray());*/
        for (int i = 0; i < word1.length(); i++) {
            System.out.println(word1.charAt(i));
        }

        char[] word2 = word1.toCharArray();
        System.out.println(word2);
        System.out.println("There are chars: " + word2);
        System.out.println(word2[2]);
        System.out.println("There is one char element: " + word2[2]);

        for (int i = 0; i < word2.length; i++) {
            int min = word2[i];
            if (word2[i] < word2[i+1]) word2[i] = word2[i+1];
            System.out.print(word2[i]);
        }
    }
}
