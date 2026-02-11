package com.lucascode.BeyoundTheBasics;

public class GlobalAndLocalVariables {
    //Global variable for the class GlobalAndLocalVariables
    private static final String BRAND = "Amigoscode";

    //Global variable - accessible from anywhere other classes can see and use.
    public static final double PI = 3.14;



    public static void main(String[] args){
        // Global and local variables
        //Global can be accesed from this class and other classes
        //Local: only visible in the scope of the function, only acessible in the scope of the method

        //Local variable:
        String country = "England";

        //How to create local variable
        var BRAND = "ADIDAS";


        System.out.println(BRAND);
        foo();
    }

    //Funciton:
    private static void foo(){
        System.out.println(BRAND);
    }
}
