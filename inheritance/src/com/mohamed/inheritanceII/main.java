package com.mohamed.inheritanceII;

/**
 * Created by dba on 3/13/15.
 */
public class main extends box {
    main(double A,double B,double C){
        super(A,B,C);
    }
    main(double R){
        super(R);
    }

    public static void main(String[] args) {
        main ma=new main(10,10,10);
        main m=new main(7);
        ma.getVolume();
        m.getCVolume();
        m.getArea();
    }
}
