package com.mohamed.example;

/**
 * Created by dba on 4/29/15.
 */
public class recursion {

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static long fact(long num){
        if (num <= 1)
            return  1;
        else
            return num * fact(num-1);
    }
}
