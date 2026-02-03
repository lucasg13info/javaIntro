package com.lucascode.loops;

import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        //Enchance for loop

        String[] names = {
                "James",
                "Nadia",
                "Sophie",
                "Alex"
        };


        System.out.println(Arrays.toString(args));
        //Normal for - used when you want to have access to the index i - access de elements of the loop.

        System.out.println("For loop");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            System.out.println("-------------");
        }
        // Enhanced For Loop - for aprimorado - we dont have control, if you want just the first element you cant use this for.
        // Just a for form the beggin to the end of the array
        for (String name : names) {
            System.out.println(name);
        }

        String name = "Lucas";
        String surnema = "Rodirgues Estefano";

    }
}
