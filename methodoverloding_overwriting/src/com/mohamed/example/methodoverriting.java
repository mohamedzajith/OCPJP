package com.mohamed.example;

/**
 * Created by dba on 3/16/15.
 */
public class methodoverriting extends food{
    void eat(){
        System.out.println("I am not eat");
    }

    public static void main(String[] args) {
        methodoverriting mo=new methodoverriting();
        mo.eat();
    }
}
