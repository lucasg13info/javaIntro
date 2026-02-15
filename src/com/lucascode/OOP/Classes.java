package com.lucascode.OOP;

public class Classes {
    public static void main (String[] args){ //JVM Looks for this method to run the application
        //Classes

        //Type     new class
        Cat rose = new Cat();
        rose.setName("Rose");
        rose.meow();


        //This isnatance is called star
        Cat star = new Cat();
        star.setName("Star");
        star.meow();
    }
}
