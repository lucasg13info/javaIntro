package com.lucascode.OrganizeCode.car;

public class CarService {

    private CarDAO carDAO = new CarDAO(); //Connection database
    public int registerNewCar(Car car){

        // Bisunes logic


        // Check if car is not null
        // Check if reg number is valid
        // Check if reg number not taken
        // If price is < 0


        carDAO.saveCar(car);
    return 1;
    }

    //public Car[]getCars () {
    //    carDAO.selectAllCars();
    //}
}
