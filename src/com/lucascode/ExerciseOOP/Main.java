package com.lucascode.ExerciseOOP;

import com.lucascode.OOP.Cat;
import com.lucascode.OOP.Gender;
import java.util.Arrays;


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

        Car gol = new Car(
                "gol",
                "Volkswagen",
                59000.00,
                2121121,
                com.lucascode.ExerciseOOP.Color.WHITE,
                2026) {
        };

        //System.out.println(tesla);

        Car[] cars = {tesla, gol };
        //System.out.println(Arrays.toString(cars));

        Work work = new Work("Software Engineer", 100.000, Stack.BACKEND){
        };
        //System.out.println(work);

        Pet pig = new Pet(PetType.PIG, "Lulu", 2){
        };


        Pet dog = new Pet(PetType.CANARY, "Lui", 3){
        };

        Pet[] pets = {pig, dog};
        //System.out.println(Arrays.toString(pets));


        Person lucas = new Person(
                "Lucas",
                "Estefano",
                Gender.MALE,
                121212121,
                "lucas@lucas.com",
                "Atkin Street",
                cars,
                work,
                pets) {

        };

        System.out.println("----------------------------------------");
        System.out.println(lucas);

    };
}
