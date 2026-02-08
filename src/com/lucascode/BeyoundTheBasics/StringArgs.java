package com.lucascode.BeyoundTheBasics;

import java.util.Arrays;

public class StringArgs {
    public static void main(String[] args){
        //String args

        System.out.println("Program was given");
        if (args.length > 0){
            System.out.println("The following arguments");
            System.out.println(Arrays.toString(args));
        }else {
            System.out.println("0 Args");
        }


        //Use var for local veriables
        var name = "joao";
        var names = new String[]{"Lucas", "Pedro"};
        var age = 22;


        //Break
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (int number : numbers){
            if (number == 3){
                break;
            }
            System.out.println(number);
        }
    }
}
