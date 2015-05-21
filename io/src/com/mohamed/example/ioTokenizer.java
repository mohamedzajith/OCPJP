package com.mohamed.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by dba on 5/21/15.
 */
public class ioTokenizer {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter your name : ");
        BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
        String input = bread.readLine();

        StringTokenizer tokenizer = new StringTokenizer(input,",");
        String name = tokenizer.nextToken();
        int age = Integer.parseInt(tokenizer.nextToken());

        System.out.print("Your name is "+name+" and age is "+age);
    }
}
