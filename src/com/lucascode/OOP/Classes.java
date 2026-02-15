package com.lucascode.OOP;

public class Classes {
    public static void main (String[] args){ //JVM Looks for this method to run the application
        //Classes

        //Type     new class
        Cat rose = new Cat("Rose", 2);
        rose.meow();
        System.out.println(rose.getName());
        System.out.println(rose.getAge());




        //This instance is called star
//        Cat star = new Cat();
//        star.setName("Star");
//        star.meow();
//        System.out.println(star.getName());

    }
}
