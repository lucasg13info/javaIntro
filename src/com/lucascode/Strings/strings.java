package com.lucascode.Strings;

public class strings {

    public static void main(String[] args){
        //Strings
        // Java Save all the variables in the String Pool (Space in the memory).
        // If you have two variables with the same content java will not create another variable in the memory, but will create a referencia for your previus variable.
        //String pool: is the special memory  region where Strings are stored by the JVM. optimize the memory

        //Strings are immutable
        String name= "Jamila";
        String name2  = "Jamila";

        //String Literal Vs String Object
        name2 = "Alex";
        String name3 = new String ("Jamila");

        System.out.println(name + " Concat" );
        System.out.println(name.toUpperCase());
        System.out.println("   ".isBlank());
        System.out.println("   ".isEmpty());
        System.out.println("         Hello".trim()); // remove spaces
        System.out.println(name.startsWith("J"));
        System.out.println(name.substring(1, 4));
        System.out.println(name.replace("J", "A"));



        //Compare Strings:
        System.out.println(1 == 1 );
        System.out.println("Luc" == "Luc");
        System.out.println(name.equals(name3)); // this is the best way to compare strings


        //Convert integer to string
        String number = String.valueOf(1);
        System.out.println(number);

        String format = String.format("Number %s", number);
        System.out.println(format);

        String[] names = {"Jamila", "Alex"};
        String join = String.join(" , ", names); // ALl that in one variable
        System.out.println(join);
    }
}
