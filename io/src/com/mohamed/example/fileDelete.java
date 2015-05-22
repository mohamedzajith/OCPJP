package com.mohamed.example;

import java.io.File;

/**
 * Created by dba on 5/22/15.
 */
public class fileDelete {
    public static void main(String[] args) {
        //absolute path delete
        File filedelete = new File("/home/dba/Desktop/mohamed.txt");
        if (filedelete.delete()){
            System.out.println(filedelete + " is delete");
        }else{
            System.out.println(filedelete+" is not exits");
        }

        //delete file from project directory
        File file = new File("zajith.docx");
        if (file.delete()){
            System.out.println(file+" is deleted!");
        }else{
            System.out.println(file+" is not exits!");
        }
    }
}
