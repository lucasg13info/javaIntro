package com.lucascode;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write the code here.
        System.out.println("Hi Java, now its my time to dominate you!😊");
        System.out.println(10 + 10);
        //sout = write System.out.println();
        System.out.println();

        //primitives - allow to store simple values
        int number1 = 20;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println(result);
        double pi = 3.14;
        boolean isAdult = false;
        char a = 'A';
        /*
         * boolean = true or false
         * byte
         * short
         * char
         * int
         * long
         * float = big numbers
         * double
         * */
        int amount = 1_000_000_000; //We just add _ to be easy to read the number
        System.out.println(amount);


        //Arithmetic Operators
        int numberOne = 10;
        int numberTwo = 20;

        System.out.println(numberOne + number2);
        System.out.println(numberOne - number2);
        System.out.println(numberOne * number2);
        System.out.println(numberOne / number2);
        System.out.println(numberOne % number2); //Number one can go in the number 2 xxx times
        //BODMAS
        //B - Brackets
        //O - Orders (power/ indices or roots
        //D- Division
        //M - Multiplication
        //A - Addition
        //S - Subtraction

        System.out.println((2 + 2) * (3 / 1) * 2);


        // Increment ++ and decrement --
        int nu = 0;

        //Increment number now
        System.out.println(++nu);

        //Increment num for the next use
        System.out.println(nu++);

        //Num after increment
        System.out.println(nu);


        //Comparison Operators
        //< <= > >= == !=
        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println(10 < 10);
        System.out.println(10 <= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);


        int numberfive = 2;
        int numberSix = 10;
        numberSix *= 2;
        System.out.println(numberSix);


        //Variable
        int numberOfGoals = 0;
        System.out.println(numberOfGoals);
        //boobleans - always asking questions
        boolean isMale = true;
        boolean hasCat = true;


        //String
        String brand = "AmigosCode";
        String code = "Code";
        System.out.println(brand + "," + code.toUpperCase());

        System.out.println(brand + "," + code.toLowerCase());
        System.out.println(" ".isEmpty());
        System.out.println("  ".isBlank());
        System.out.println("    a   ".trim()); // remove spaces


        //Reference Types / Objects
        int age = 21;
        Point pointA = new Point(10, 10); //Store more complex information
        System.out.println(pointA.x);


        //Pass by value
        int ages = 211;
        int ageCopy = increment(ages);

        System.out.println(ages);
        System.out.println(ageCopy);


        //Pass by value with Object
        Point pointX = new Point(10,11);
        Point pointW = pointX;

        pointX.x = 100;


        //Arrays - to save multiple values in the same varable
        int numbber = 10;

        //Defining the size of the array
        int [] numbers = new int[4];

        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 44;
        numbers[3] = 55;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        //Including os values no array without define the size
        int [] numbers2 = {0,5,6,8,9,10};
        System.out.println(Arrays.toString(numbers2));
        //Updating data in the array
        numbers2[1] = 6;
        System.out.println(Arrays.toString(numbers2));

        String[] namess = {"Lucas", "Joao"};
        System.out.println(Arrays.toString(namess));




        String str = "Hello";
        str = str.concat(" World");
        System.out.println(str);

        int x = 10;
        x += 5;
        System.out.println(x);



    }

        static int increment(int ages){
            return ++ages;


        }







    }





