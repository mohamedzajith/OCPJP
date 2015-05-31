package com.mohamed.mongoexample;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.WriteResult;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by dba on 5/28/15.
 */
public class fileTOmongo {
    public static void main(String[] args) {
        try{
            DB dbconn = connection.conn();
            DBCollection coll = dbconn.getCollection("zzz");
            coll.drop();
            File file = new File("/home/dba/Desktop/zajith.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedread = new BufferedReader(fileReader);
            String line = bufferedread.readLine();
            while (line != null){
                StringTokenizer tokenizer = new StringTokenizer(line,",");
                String name = tokenizer.nextToken();
                int age = Integer.parseInt(tokenizer.nextToken());

                BasicDBObject ins = new BasicDBObject();
                ins.append("name",name);
                ins.append("age",age);
                WriteResult result = coll.insert(ins);

                line=bufferedread.readLine();
            }
            System.out.println("Everything ok");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
