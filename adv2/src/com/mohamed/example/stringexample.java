package com.mohamed.example;

/**
 * Created by dba on 4/29/15.
 */
public class stringexample {

    public static void main(String[] args) {

        String[] word = {"mohamed", "zajith", "example", "Computer", "Science"};
        // word searching first of character matching
        for (String w : word) {
            if (w.startsWith("mo"))
                System.out.println(w);
        }
        System.out.println("\n------------------------------------");

        // word searching end of character matching
        for (String w : word) {
            if (w.endsWith("e"))
                System.out.println(w);
        }
        System.out.println("\n------------------------------------");

        //word for capital letters
        for (String w : word) {
            System.out.println(w.toUpperCase());
        }
        System.out.println("\n------------------------------------");

        //word for small letters
        for (String w : word) {
            System.out.println(w.toLowerCase());
        }
        System.out.println("\n------------------------------------");

        //letters or word replacing
        for (String w : word) {
            System.out.println(w.replace("m","mm"));
        }
    }
}
