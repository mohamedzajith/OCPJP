package com.mohamed.example;

/**
 * Created by dba on 5/20/15.
 */
enum colors_name{
    red,green,blue,white,yellow;
}
public class enumtest {
    public static void main(String[] args) {
        colors_name colorsName[] = colors_name.values();
        for (colors_name c:colorsName){
            System.out.print(c+ "  ");
        }

    }
}
