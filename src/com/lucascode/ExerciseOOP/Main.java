package com.lucascode.ExerciseOOP;

import com.lucascode.OOP.Gender;

import java.math.BigDecimal;

public class Main {
    public static void main (String[] args) {

        Car tesla = new Car(
                "Tesla Model 3",
                "Tesla",
                59000.00,
                2121121,
                com.lucascode.ExerciseOOP.Color.WHITE,
                2026) {
        };

        System.out.println(tesla);

        Car[] cars = {tesla };
        System.out.println(cars);



        Person lucas = new Person(
                "Lucas",
                "Estefano",
                Gender.MALE,
                121212121,
                "lucas@lucas.com",
                "Atkin Street",
                cars){

        };


        System.out.println("-------------------");
        System.out.println(lucas);






    };


}
