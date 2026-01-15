package com.lucascode.ifStatements;

public class SwitchStatement {
    public static void main(String[] args){
        //Switch - used to improve the readability
        char grade = 'B';

        //Code with if
        if (grade == 'A'){
            System.out.println("Excellent");
        }else if (grade == 'B' || grade == 'C'){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        //Code with Switch case - easy to read

        //Just possible to use: byte short int char enums String in the Switch case
        // Byte Short Integer Character
        switch (grade)
        {
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }

        //New Switch Expression
        String result = switch (grade){
            case 'A' -> "Excellent";
            case 'B', 'C' -> "Pass";
            default -> "Fail";
        };

        System.out.println(result);



    }
}
