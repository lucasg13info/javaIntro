package com.lucascode.methods;

/*
Methods is a block of code that only runs when is envolt.
Use to reuse code something you do many times in your code you can create as a method and dont repeat code.
 */

/*
    We have to spefify thinkgs:

    - Access modifier
    - Optional static
    - Return Type
    - Name
    - Optional parameters (int n1, int n2) can be string, int, anything
    - Methodh Body
    - Optional return value
* */

/*
Methods convention: Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal workd capitalized.
run();
runFast();
getBackground();
* */


public class Methods {
    //Method 1:
    private static int add(int n1, int n2){
        int result = n1 +n2;
        return result;
    }


    public static void main(String[] args){
        //This is the mothod - public static void main(String[] args){
        /*
        * Here for exemple we have everuthung:
        * Access modifier: public
        * Return Type: void (means this method does not return anything
        * Name: Main
        * Optional parametert: String[]
        * Methody body: everything inside the curl brackets
        * Optional return: nothing at the moment because we are using void
        *
        * */

        // Create a method that add 2 numbers
        int result = add(10,10);
        int result2 = add(10,200);
        System.out.println(result);
        System.out.println(result2);
    }
}
