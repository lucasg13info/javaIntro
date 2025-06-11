package com.lucascode;

import java.util.Arrays;

public class LoopsAndArrays {
    public static void main(String[] args) {
    //Loops and Arrays
        String[] names = {
                "James",
                "Nadia",
                "Sophie",
                "Alex"
        };
        //To print all array
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------");

        //To print specifc parts
        System.out.println(names[1]);
        System.out.println("--------------------");

        //Using for - percorrendo o array com for
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);

        };
        System.out.println("--------------------");
//        //Using for - percorrendo reverse
        int a = names.length;
        System.out.println(a);

        //Read the array reverse
        for(int i = names.length -1; i>= 0; i--){


            System.out.println(names[i]);

        };
    }
    }

