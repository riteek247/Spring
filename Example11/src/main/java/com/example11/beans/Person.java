package com.example11.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Preeti";


    private Vehicle vehicle;

    public String getName() {
        return name;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    @Autowired

    public void setVehicle(Vehicle vehicle) {
        this.vehicle=vehicle;
    }
}
