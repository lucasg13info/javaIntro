package com.lucascode.ifStatements;

public class NegationOnIfs {
    public static void main(String[] args){
        System.out.println(!true); // false
        System.out.println(!false); // true

        boolean isAdult = false;
        if(!isAdult){
            System.out.println("Adult ");
        }
    }
}
