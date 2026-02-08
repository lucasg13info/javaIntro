package com.lucascode.methods;

public class methodRentalYield {

    //Method to calculate rental Yields:
    private static double rentalYield(double rentalIncoming, double purchasedProperty){

        double rentalIncomingYear = (rentalIncoming * 12);
        double rentalYield = (rentalIncomingYear / purchasedProperty) * 100;

        System.out.println("-----------------------------");
        System.out.println("Rental incoming a year is: " + rentalIncomingYear);
        System.out.println("purchasedProperty: " + purchasedProperty);
        System.out.println("Rental yield is: " + rentalYield);
        System.out.println("-----------------------------");

        return rentalYield;

    }

    public static void main(String[] args){
        double yield = rentalYield(1300, 250000);

    }
}
