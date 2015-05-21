package com.mohamed.example;

import java.util.Scanner;

/**
 * Created by dba on 5/21/15.
 */
public class ioScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name && age :\n");
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.print("Hi "+name+" your are "+age+" years old");
    }
}
