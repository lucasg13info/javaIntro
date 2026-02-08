package com.lucascode.methods;

public class VoidMethods {

    //Method 1:
    private static int add(int n1, int n2){
        int result = n1+n2;
        return result;
    }

    //Method 2 print nothig "void" you dont need to say the return.
    private static void printBrand(){
        System.out.println("Amigoscode");
    }

    //Method 3 print band uppercase
    private static void printBrand2(String brand){
        System.out.println(brand.toUpperCase());
    }

    //Method 3
    private static void isAdult(int age){
        if (age >= 16){
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
        }


    }


    public static void main(String[] args){
        int result = add(10,10);
        System.out.println(result);

        printBrand();

        printBrand2("amigosj");

        isAdult(16);
        isAdult(10);




    }
}
