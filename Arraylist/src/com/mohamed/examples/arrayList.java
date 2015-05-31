package com.mohamed.examples;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dba on 5/31/15.
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("mohamed");
        arrayList.add("miller");
        arrayList.add("fahim");
        arrayList.add("nimishan");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            String element = iterator.next().toString();
            System.out.print(element+"  ");
        }

        System.out.print("\n"+arrayList.indexOf("fahim"));
    }
}
