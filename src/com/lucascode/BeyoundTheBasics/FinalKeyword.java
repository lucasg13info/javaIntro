package com.lucascode.BeyoundTheBasics;

public class FinalKeyword {

    //Good aproach to create constant:
    public static final String  NAME = "Lucas";

    public static void main(String[] args){
        //Final Keyword: Allows to create constants

        final String name = "Alex"; //You cant change the variable later, isso e como se fosse uma const do javascript
        //name = "jamila";
        System.out.println(name);

    }
}
