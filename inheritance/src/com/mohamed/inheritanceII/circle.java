package com.mohamed.inheritanceII;

/**
 * Created by dba on 3/13/15.
 */
public class circle {
    double radias;
    circle(){

    }
    circle(double R){
        radias=R;
    }
    public void getArea(){
        System.out.println("circle area is :"+(Math.PI*Math.pow(radias,2)));
    }
    public  void  getCVolume(){
        System.out.println("kolam volume is :"+((4*Math.PI*Math.pow(radias,3))/3));
    }
}
