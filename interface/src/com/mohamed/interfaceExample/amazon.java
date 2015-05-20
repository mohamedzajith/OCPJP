package com.mohamed.interfaceExample;

/**
 * Created by dba on 5/3/15.
 */
public class amazon extends zajith {

    @Override
    public void name() {
        System.out.println("mohamed zajith");
    }

    @Override
    public void age() {
        System.out.println(18);
    }

    public static void main(String[] args) {
        amazon am = new amazon();
        am.age();
        am.name();
        am.food();
    }
}
