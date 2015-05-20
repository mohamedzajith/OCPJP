package com.mohamed.example;

/**
 * Created by dba on 5/3/15.
 */

class school implements name{
    public void student(){System.out.println("Hello");}

    @Override
    public void teacher() {
        System.out.println("Hello dear");
    }

    public static void main(String args[]){
        school obj = new school();
        obj.student();
        obj.teacher();
    }
}