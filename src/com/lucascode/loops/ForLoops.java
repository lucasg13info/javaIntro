package com.lucascode.loops;

public class ForLoops {
    public static void main(String[] args) {
    //Loops increment
        System.out.println("Start of the Loop");
        for(int i = 0; i<= 10; i++){
            System.out.println("Hello " + i);
        }
        System.out.println("End of the Loop");
        System.out.println("--------------------");

        //Loops reverse
        System.out.println("Start of the Loop");
        for(int i = 10; i>= 0; i--){
            System.out.println("Hello " + i);
        }
        System.out.println("End of the Loop");
        System.out.println("--------------------");


        //Loops increment skiping
        System.out.println("Start of the Loop");
        for(int i = 0; i<= 10; i+=2){
            System.out.println("Hello " + i);
        }
        System.out.println("End of the Loop");
        System.out.println("--------------------");
    }
}





