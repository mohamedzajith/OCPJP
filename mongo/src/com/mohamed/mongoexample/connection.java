package com.mohamed.mongoexample;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by dba on 5/28/15.
 */
public class connection {
    public static DB conn(){
        try {
            MongoClient mongoClient = new MongoClient();
            DB dbtest = mongoClient.getDB("testdb");
            return dbtest;

        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }
}
