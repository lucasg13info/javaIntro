package com.lucascode.OOP;

public class Cat {
    //Classes are made by propertys and behaviors

    private String name; //property

    public void meow() { //behaviour
        System.out.println(name + ": meow...");
    }

    public void setName(String name){
        this.name = name;
    }
}