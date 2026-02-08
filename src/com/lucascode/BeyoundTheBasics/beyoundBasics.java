package com.lucascode.BeyoundTheBasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class beyoundBasics {
    public static void main(String[] args){
        //public: this method is public accessible
        //static: is no need to create an instance of the class, this method ca be involked directly by saying main dot
        //void: means the method does not return anything
        //main: principal - name of the method - jvm start compiling from here
        //String args: program arguments
        System.out.println("Program was given");
        if (args.length > 0){
            System.out.println("The following arguments");
            System.out.println(Arrays.toString(args));
        }else {
            System.out.println("0 Args");
        }

    }
}
