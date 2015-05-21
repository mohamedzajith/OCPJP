package com.mohamed.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dba on 5/21/15.
 */
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name : ");
        String name = bread.readLine();

        System.out.print("Enter your age : ");
        int age = Integer.parseInt(bread.readLine());

        System.out.print("your name is "+name+" and age is "+age+" ");
    }
}
