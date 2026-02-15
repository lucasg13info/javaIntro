package com.lucascode.InputFromConsole;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        //Scanner

        //String
        System.out.println("Hello what is your name?");
        Scanner scanner = new Scanner(System.in); //Any input from console
        String input = scanner.nextLine();
        System.out.println("Hello "+ input);


        //Limit the data type
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        if(age < 1611){
            System.out.println("You are a child");
        }else {
            System.out.println("You are an adult!");
        }


    }
}
