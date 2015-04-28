package com.mohamed.example;

/**
 * Created by dba on 3/16/15.
 */
public class methodeoverloding extends food{
    public static void main(String[] args) {
        methodeoverloding mo=new methodeoverloding();
        mo.eat();
        mo.sum(10.0,6.4);
        mo.sum(5,10);
    }
}