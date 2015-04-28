package com.mohamed.inheritance;

import java.util.Scanner;

/**
 * Created by dba on 3/11/15.
 */
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        like li=new like();
        li.user(name);
        li.eat();
        li.noteat();
    }
}



