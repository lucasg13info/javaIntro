package com.lucascode.OrganizeCode.car;

public class CarDAO {
    //Add to database
    private static Car[] cars;
    private static int nexAvailableSlot = 0;

    static {
        cars = new Car [100];
    }

    public void saveCar(Car car){

        cars[nexAvailableSlot] = car;
    }
}
