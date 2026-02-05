package com.lucascode.packages;

import java.awt.Point;
import java.util.Date;
import java.util.ArrayList;
// import java.sql.Date;   - Here we are already using .Date, in this case we will use the full name of the class.


public class Packages {
    public static void main(String[] args){
        //Package - is a folder that allows to structure the project. Package is just a folder to organize the code.

        Point point = new Point();


        Date date = new Date();
        /**
         * Constructs an {@code ArrayIndexOutOfBoundsException} class with the
         * specified detail message.
         *
         * @param s the detail message.
         */



        //TIP When you are importing classes with the exacly same name, you will need to use the full name of the second.
       java.sql.Date date1 = new java.sql.Date(1);


       //Strings from java.lang dont need to import.Lang is a default path in Java.
       String name = "AmigoosCode";


        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list.get(0));

    }
}
