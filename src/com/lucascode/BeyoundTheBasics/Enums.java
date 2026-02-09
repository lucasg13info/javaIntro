package com.lucascode.BeyoundTheBasics;

import java.util.Arrays;

public class Enums {

    //This is constant:
    public static final String MALE = "MALE";


    //Enums: define constants
    //This is constant too, but here in can create group of, all in one, we have full control: :
    enum Genderr{
        MALE,
        FEMALE
    }

    enum TShirtSizee{
        S,
        M,
        L,
        XL
    }
    public static void main(String[] args){
        //Enums: define constants

        System.out.println(Gender.MALE);

        System.out.println(Month.JANUARY);
        System.out.println(Gender.valueOf("FEMALE"));

        //Show all values in the ENUMS in ARRAY
        System.out.println(Arrays.toString(Gender.values()));

        //Percorrendo gender
        for (Gender gender : Gender.values()){
            System.out.println(gender);
        }
    }
}
