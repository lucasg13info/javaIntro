package com.lucascode.BigDecimal;

import java.math.BigDecimal;

public class ProblemWithBigDec {
    public static void main(String[] args){

        //TO stroe money never store with double but with Bigdecimal
        double numer1 = 0.02;
        double numer2 = 0.03;
        double result = numer2 - numer1;
        System.out.println(result); // 0.009999999999999998


        //Correct way to store money:
        BigDecimal numero1= new BigDecimal("0.02");
        BigDecimal numero2= new BigDecimal("0.03");
        BigDecimal resultado = numero2.subtract(numero1);
        System.out.println(resultado);




        //Big decimal
        BigDecimal num = BigDecimal.TEN;
        System.out.println(num);
        System.out.println(num.add(BigDecimal.ONE));
        System.out.println(num.max(BigDecimal.ZERO));
        System.out.println(num.compareTo(BigDecimal.ZERO));
    }


}
