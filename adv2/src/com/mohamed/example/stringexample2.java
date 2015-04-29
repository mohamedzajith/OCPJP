package com.mohamed.example;

/**
 * Created by dba on 4/29/15.
 */
public class stringexample2 {
    public static void main(String[] args) {
        String s="i am mohamed zajith ( computer science )";

        System.out.println(s.indexOf("m"));
        System.out.println(s.indexOf("mo"));
        System.out.println(s.indexOf("m",12));
        System.out.println(s.indexOf("mo",3));
        System.out.println(s.indexOf("mo",12));
        System.out.println("-------------------------------------------------");
        String a="mohamed";
        String b="zajith";
        System.out.println(a+b);
        System.out.println(a.concat(" "+b));
        System.out.println("-------------------------------------------------");
        String ab="       iam_mohamedzajith        ";
        System.out.println(ab);
        System.out.println(ab.trim());
    }
}
