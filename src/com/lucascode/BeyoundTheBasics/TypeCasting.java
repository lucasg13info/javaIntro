package com.lucascode.BeyoundTheBasics;

public class TypeCasting {

    public static void main(String[] args){
        // Type Casting: Convert one data type to another
        //Implicit: Type (Widening) Casting
        //Explicit: Type (Narrowing) Casting

        //Implicit:
        System.out.println("Implicit");
        int balance = 100;
        double balanceIndouble = balance;
        System.out.println(balance);
        System.out.println(balanceIndouble);



        //Explicit:
        System.out.println("Explicit");
        double remaingnBalance = 100.55;
        int remaingnBalanceInt = (int)remaingnBalance;
        System.out.println(remaingnBalance);
        System.out.println(remaingnBalanceInt);
    }
}
