package com.mohamed.example;

/**
 * Created by dba on 3/5/15.
 */
public class potpie {
    private int day;
    private int month;
    private int year;

    public potpie(int d,int m,int y){
        this.month=m;
        this.day=d;
        this.year=y;

        System.out.printf("the constructor for this is %s%n", this);
    }
    public  String toString(){
        return String.format("%02d/%02d/%02d ",day,month,year);
    }
}
