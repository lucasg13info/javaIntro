package com.lucascode.FIles;

import java.io.File;
import java.io.IOException;

public class CreatingFIles {
    public static void main (String[] args) {
        createFile("src/lucas.txt");
    }
    //Creating files
    //Method
        private static void createFile (String path){
            try{
                File file = new File(path);
                if (!file.exists()) {
                    file.createNewFile();
                    System.out.println("created");
                }
                //Delete file
            /*
            if (file.exists()){
                file.delete();
                System.out.println("File deleted");
            }
             */

            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }





        }


