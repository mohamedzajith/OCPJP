package com.mohamed.Enumeration;
import java.util.EnumSet;
/**
 * Created by dba on 3/6/15.
 */
public class main {
    public static void main(String[] args) {
        for (details people: details.values()){
            System.out.printf("%s\t%s\t%s\n",people,people.getAge(),people.getArea());
        }

        //Enumset range using special methods
        System.out.println("\n Enum Set Range \n");
        for (details people : EnumSet.range(details.miller,details.nimishan)){
            System.out.printf("%s\t%s\t%s\n",people,people.getAge(),people.getArea());
        }
    }
}
