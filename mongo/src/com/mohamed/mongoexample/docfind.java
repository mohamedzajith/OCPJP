package com.mohamed.mongoexample;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoException;

/**
 * Created by dba on 5/25/15.
 */
public class docfind extends connection {

    public static void main(String[] args) {
        DB dbtest = connection.conn();
        DBCollection coll = dbtest.getCollection("zzz");

        try {
            DBCursor carCursor = coll.find();
            while (carCursor.hasNext()) {
                System.out.println(carCursor.next());
            }
        }
        catch (MongoException e){
            System.out.println(e.getClass().getCanonicalName());
        }
    }
}
