package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = "99";

    // //requires one empty constructor
    private IdGenerate() {}

    public static String getCurrentId() {
        return currentId;
    }

    public static void reset() {   //must reset the currentId back to 99
        currentId = "99";
    } 

    public static void generateID() {  //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
        // Parse Id to int as it is a String
        int id = Integer.parseInt(currentId);
        //increment
        id++;
        //Convert new int value back to String
        String newId = Integer.toString(id);
        currentId = newId;
    } 
}