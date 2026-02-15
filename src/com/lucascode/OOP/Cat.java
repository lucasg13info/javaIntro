package com.lucascode.OOP;

/*
- Class can be everything:
    Classes are made by propertys and behaviors

    GETTER: method for get value
    SETTER: method to change the value
    CONSTRUCTOR: Allow you to pass values at the point of initialization for your object.

* */


//Classes are made by propertys and behaviors
public class Cat {
    private String name; //property, never be public
    private int age;
    private String color;


    //Constructor 1:
    //Constructor - hability to create a cat passing the name
    //If you dont define, Java defines for you

    public Cat (String name, int age, String color){
        this(name, age); //Reuse other constructors
        this.color = color;
    }

    public Cat (String name, int age){
        this.name = name;
        this.age =  age;
    }

    //Constructor 2:
    public Cat (String name){
        this.name = name;
        this.age =  0;
    }

    //Constructor 3:
    public Cat(){
    //Default
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}