/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsonExample.cd111;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hiramtodd
 */
public class WriteJson {

    /**
     * @param args the command line arguments
     *             In this application, we are creating a Json object, adding a Json array list to the object, and then
     *             the data will be written to a txt file called ToddOtisProfile with the FileWriter class.
     */
    public static void main(String[] args) {


        /**
         * JSON objects are built of key value pairs. So, the key always has to be string for values such as name, age,
         * date... and the value is any valid data type. Below, we are including Strings, Integers, and an array that will
         * all be written to a ToddOtisProfile.json file.
         * */
        // This creates the JSON object.
        JSONObject j = new JSONObject();

        // Here we are adding the key, Name, and giving it a String value, Todd.
        j.put("Name", "Todd");

        // Here we are adding the key, Age, and giving it a Integer value, 47.
        j.put("Age", 47);

        // Here we are adding the key, Major, and giving it a String value, Software Engineering.
        j.put("Major", "Software Engineering");

        // Here we are adding the key, Internship, and giving it a String value, Microsoft Japan.
        j.put("Internship", "Microsoft Japan");

        // Here we are adding a Json array list.
        JSONArray prevJobs = new JSONArray();

        // Below we are adding the data into the array list.
        prevJobs.put("Mechanical/Electrical Drafter");
        prevJobs.put("Student");
        prevJobs.put("Stay-at-home Dad");

        /**
         * Here we are adding the prevJobs array list above to the JSON object. We also gave the array list a key name
         * which is Previous jobs.
         * */
        j.put("Previous jobs", prevJobs);

       /**
        * We are now using the FileWriter class in the block below to write all the data coded above to a JSON file
        * called ToddOtisProfile. This will create a separate JSON file with the object created.
        * */
        String fileName = "ToddOtisProfile";
        try (FileWriter file = new FileWriter(fileName)) {
            
            file.write(j.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

// https://youtu.be/-qEpxIARKxE