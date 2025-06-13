package com.lucascode.loops;

public class WhileLoopAndDoWhile {
    public static void main(String[] args) {
        //While loops
        int i = 0;
        boolean keepLooping = true;
        while(keepLooping){
            System.out.println("Hello" + i++);
            keepLooping = false;
        }


        System.out.println("--------------------");

        //Do While
        boolean  keepLooping2 = true;
        do{
            System.out.println("Hello " +i++);
//            keepLooping2 = false;

        } while(keepLooping2);



    }

}
