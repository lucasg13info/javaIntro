package com.lucascode.Static;

import com.lucascode.ExerciseOOP.*;
import com.lucascode.OOP.Gender;

import java.math.BigDecimal;

public class StaticKeyword {
    public static void main(String[] args) {
        //Static: It indicates that either a property method belongs to the class itself rather than the instance.

        // When to use Static:

        Car gol = new Car(
                "gol",
                "Volkswagen",
                new BigDecimal("59000.00"),
                2121121,
                com.lucascode.ExerciseOOP.Color.WHITE,
                2026) {
        };

        System.out.println(gol);

        Work work = new Work("Software Engineer", 100.000, Stack.BACKEND){
        };

        Pet pig = new Pet(PetType.PIG, "Lulu", 2){
        };


//        Person alex = new Person(
//                "Alex",
//                "Estefano",
//                Gender.MALE,
//                212121212,
//                "alex@alex.com",
//                "ales 121212",
//                gol,
//                work,
//                pig
//
//        ){
//
//
//        };
//
//        System.out.println(alex);
    }
}
