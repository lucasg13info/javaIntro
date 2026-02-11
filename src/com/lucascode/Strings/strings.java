package com.lucascode.Strings;

public class strings {

    public static void main(String[] args){
        String name= "Jamila";
        System.out.println(name + " Concat" );
        System.out.println(name.toUpperCase());
        System.out.println("   ".isBlank());
        System.out.println("   ".isEmpty());
        System.out.println("         Hello".trim()); // remove spaces
        System.out.println(name.startsWith("J"));
        System.out.println(name.substring(1, 4));
        System.out.println(name.replace("J", "A"));
    }
}
