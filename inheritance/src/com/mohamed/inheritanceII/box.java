package com.mohamed.inheritanceII;

/**
 * Created by dba on 3/13/15.
 */
public class box extends circle {
    double width;
    double higth;
    double depth;

    box(double W,double H,double D){
        width=W;
        higth=H;
        depth=D;
    }

    public box(double r) {
        super(r);
    }

    public void getVolume(){
        System.out.println("total volume is :"+(width*higth*depth));
    }
}
