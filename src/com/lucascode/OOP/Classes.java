package com.lucascode.OOP;

public class Classes {
    public static void main (String[] args){ //JVM Looks for this method to run the application
        //Classes

        //Type     new class
        //Cat1
        Cat rose = new Cat("Rose", 2, "Blue");
//        System.out.println(rose.getName());
//        System.out.println(rose.getAge());
//        System.out.println(rose.getColor());
        rose.toString();

        System.out.println(rose);


        System.out.println("------------");
        Cat rose2 = new Cat("Rose", 2, "Blue");
        System.out.println(rose2);


        //Compare Objects
        System.out.println(rose == rose2); //Wrong way
        System.out.println(rose.equals(rose2));

        System.out.println("-----------");
        //This instance is called star
        //Cat 2
        Cat star = new Cat(); // constructor with 0 arguments.
//        star.setName("Star");
//        star.meow();
//        System.out.println(star.getName());
        System.out.println(star);

        System.out.println("-----------");
        //Cat 3
        Cat jupiter = new Cat("jupiter"); // constructor with 0 arguments.
//        System.out.println(jupiter.getName());
//        System.out.println(jupiter.getAge());
        System.out.println(jupiter);


    }
}
