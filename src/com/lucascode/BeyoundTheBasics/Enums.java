package com.lucascode.BeyoundTheBasics;

public class Enums {

    //This is constant:
    public static final String MALE = "MALE";


    //Enums: define constants
    //This is constant too, but here in can create group of, all in one: :
    enum Gender{
        MALE,
        FEMALE
    }


    enum TShirtSize{
        S,
        M,
        L,
        XL
    }
    public static void main(String[] args){
        //Enums: define constants

        System.out.println(Gender.MALE);
    }
}
