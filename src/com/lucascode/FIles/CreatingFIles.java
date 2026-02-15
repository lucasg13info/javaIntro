package com.lucascode.FIles;

import java.io.*;
import java.util.Scanner;

public class CreatingFIles {
    public static void main (String[] args) {
        File file = createFile("src/lucas.txt");
        writeToFIle(file, true);

        //Read file
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }


    }

    //Method - Writing file
    private static void writeToFIle(File file, boolean append){
        //Other way to do with resources: (here we dont need to flush or close
        try (FileWriter fileWriter = new FileWriter(file, append);
             PrintWriter writer = new PrintWriter(fileWriter);
             ){

            writer.println("Bianca");

        }catch (IOException e){
            System.out.println(e.getMessage());

        }


//        try{
//            FileWriter fileWriter = new FileWriter(file, append); //true make add at the end of the lines
//            PrintWriter writer = new PrintWriter(fileWriter);
//            writer.println("Jamal");
//            System.out.println("Append new line");
//
//
//            writer.flush(); //Escrever - forcar
//            writer.close();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
    }

    //Method - Creating files
        private static File createFile (String path){
            try{
                File file = new File(path);
                if (!file.exists()) {
                    file.createNewFile();
                    System.out.println("created");
                }
                return file;
                //Delete file
            /*
            if (file.exists()){
                file.delete();
                System.out.println("File deleted");
            }
             */

            }catch (IOException e){
                System.out.println(e.getMessage());
                throw new IllegalStateException(e);
            }
        }
        }


