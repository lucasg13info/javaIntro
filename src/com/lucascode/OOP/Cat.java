package com.lucascode.OOP;

/*
- Class can be everything:
    Classes are made by propertys and behaviors

    GETTER: method for get value
    SETTER: method to change the value
    CONSTRUCTOR: Allow you to pass values at the point of initialization for your object.

* */

public class Cat {
    //Classes are made by propertys and behaviors

    private String name; //property, never be public
    private int age;



    //Constructor - hability to create a cat passing the name
    public Cat (String name, int age){
        this.name = name;
        this.age =  age;

    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}