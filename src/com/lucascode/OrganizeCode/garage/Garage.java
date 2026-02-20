package com.lucascode.OrganizeCode.garage;

public class Garage {
    public Boolean addCarToGarage (Car car, Garage garage){
        int count = 0;

        for (Car c : garage.getCars()){
            if (c != null){
                count ++;
            }
        }
        if (count >= garage.getCapacity() ){
            //add car to garage
            return false;
        }
    }

}
