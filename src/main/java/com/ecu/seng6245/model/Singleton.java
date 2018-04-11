package com.ecu.seng6245.model;

public class Singleton
{
	// static variable single_instance of type Singleton
    private static Singleton single_instance = null;
 
    // variable of type String
    public String content;
 
    // private constructor restricted to this class itself
    private Singleton()
    {
        content = "String content of a Singleton Class";
    }
 
    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }

}