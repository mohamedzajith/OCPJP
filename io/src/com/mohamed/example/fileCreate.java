package com.mohamed.example;

import java.io.File;
import java.io.IOException;

/**
 * Created by dba on 5/21/15.
 */
public class fileCreate {
    public static void main(String[] args) throws IOException {

        String sp = System.getProperty("file.separator");
        //absolute file name with path
        String ab = "/home/dba/Desktop/llll/mohamed.txt";
        File file = new File(ab);
        if (file.createNewFile()){
            System.out.print(ab+" file created!!!");
        }else {
            System.out.print("File "+ab +" already Exists");
        }
        //file create project directory
        File file1 = new File("zajith.txt");
        if (file1.createNewFile()){
            System.out.print(ab+" file created!!!");
        }else {
            System.out.print("File "+ab +" already Exists");
        }
    }
}
