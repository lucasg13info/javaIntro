package com.lucascode.BeyoundTheBasics;

public class WrapperClasses {
    public static void main(String[] args){
        //Primitive Data Type Wrapper Class
        // - Byte -> Byte
        // - short -> Short
        // - int -> Integer
        // - long -> Long
        // - float -> Float
        // - double -> Double
        // - boolean -> Boolean
        // - char -> Character

        //int age = 20;
        //Integer age = 20;
        //age.byteValue();

        var ageStr = "55";

        //Convert
        int a = Integer.parseInt(ageStr);
        System.out.println(a);
        System.out.println(Integer.min(20, 5)); //show the min number of both

        //Convert string to any giver primitive
        //Double.parseDouble();
    }
}
