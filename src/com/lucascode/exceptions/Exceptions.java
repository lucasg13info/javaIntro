package com.lucascode.exceptions;

import java.io.File;

public class Exceptions {



    public static void main(String[] args) {
        //Exception - try catch - this make the program dont break.
        //We can have a few catch...
        //if you dont know the exception

        try {
            int number = Integer.parseInt("11x");
            System.out.println(number);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
            System.out.println("end");


            //Option1 when you have amy idea of the error
        /*
        }catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage()); //Show the message in the terminal
            //e.printStackTrace(); //Break the system but show the erros to
        }
        */


            // Option 2 - A few catchs
        /*
        }catch (NumberFormatException e){
            System.out.println("Fail to parse 1x");
        }catch (ArithmeticException e){
            System.out.println("Cant devide by zero");
            }
        */


            //Option 3: you dont know any excetion that can happend

        } catch (Exception e) {
            System.out.println("Catch all exception");
            System.out.println(e.getMessage());
        }finally {
            //Always execute regardless - always run
            System.out.println("Finnaly always runs");
        }

        //Working with files
        try {
            File file = new File("src/foo.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(divide(10, 0));

    }


    //MyUncheckedException
    public static int divide(int a, int b){
        if (b == 0 ){
            throw new MyUncheckedException("Cant divide by 0");
        }
        return a/b;
    }




}
