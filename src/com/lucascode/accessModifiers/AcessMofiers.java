package com.lucascode.accessModifiers;


import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

//The class bellow in public, can be acces by any other class
public class AcessMofiers {

    //Public variable, this is an atribbut of the class AcessModifiers
     static String foo = "bar";

    public static void main(String[] args) {
        //Access Modifiers - Access Level ****
        //Classes, methods, atributes and constructors
        //Default, public, private and protected
        // Public: Accesible from anywhere.
        // private: Accessible only anything in the same class.
        // Default: Accessible same class or same packages.

        //Static: Always when you see "static" means that everything belongs to the class it self.
        // 


        //When to use each one?


        //Local variable because is in the method
        //String foo = "bar";
        System.out.println(foo);

    }
}


//Local variable cant be public