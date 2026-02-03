package com.lucascode.ifStatements;

import java.sql.SQLOutput;

public class ifStatements {
    public static void main(String[] args){
        //If Statements - execute block of code based on the condition


        int age = 16;
        boolean isAdult = age >= 16;
       //Basic If
        if(isAdult){
            System.out.println("Is Adult ");
        }else{
            System.out.println("Is not an Adult ");
        }



        //If Else if
        if(isAdult){
            System.out.println("Is Adult ");
        }else if(age > 0 && age <= 2){
            System.out.println("Baby");

        }else if(age >= 3 && age <= 4 ){
            System.out.println("Kids 1");
        }else if(age >= 5 && age <=7){
            System.out.println("Kids 2");
        }else{
            System.out.println("Idade nao identificada");
        }


        //If Statements OR
        String gender = "Male";


        if (gender.equalsIgnoreCase("FEMALE") || gender.equalsIgnoreCase("MALE")){
            System.out.println("Valid gender");
        }else{
            System.out.println("invalid gender");
        }




    }
}


