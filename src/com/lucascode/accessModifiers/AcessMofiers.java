package com.lucascode.accessModifiers;


import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

//The class bellow in public, can be acced by any other class
public class AcessMofiers {

    //Public variable, this is an atribbut of the class AcessModifiers
    private static String foo = "bar";

    public static void main(String[] args) {
        //Access Modifiers - Access Level
        //Classes, methods, atributes and constructors
        //Default, public, private and protected

        //Local variable because is in the method
        //String foo = "bar";
        System.out.println(foo);
    }
}


//Local variable cant be public