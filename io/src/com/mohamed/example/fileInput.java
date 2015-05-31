package com.mohamed.example;

import java.io.*;

/**
 * Created by dba on 5/22/15.
 */
public class fileInput {
    public static void main(String[] args) {
        try {
            File fr = new File("/home/dba/Desktop/mohamed.txt");

            FileReader fileread = new FileReader(fr);
            BufferedReader bufferedread = new BufferedReader(fileread);
            String line = bufferedread.readLine();
            while (line != null){
                System.out.println(line);
                line=bufferedread.readLine();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
