package com.mohamed.example;

/**
 * Created by dba on 3/5/15.
 */
public class nameofPerson {
    private String name;
    private  potpie birthday;

    public nameofPerson(String theName,potpie thDate){
        this.name=theName;
        this.birthday=thDate;
    }
    public String toString(){
        return String.format("my name is %s, my birthday is %s",name,birthday);
    }
}
