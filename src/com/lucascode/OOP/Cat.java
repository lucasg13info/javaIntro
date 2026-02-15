package com.lucascode.OOP;

public class Cat {
    //Classes are made by propertys and behaviors

    private String name; //property, never be public

    public void meow() { //behaviour
        System.out.println(name + ": meow...");
    }

    //Setter method
    public void setName(String name){
        this.name = name;
    }

    //Get the property
    public String getName(){
        return this.name;
    }
}