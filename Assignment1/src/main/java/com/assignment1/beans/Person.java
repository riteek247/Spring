package com.assignment1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {
    private String name= "Preeti";
    private final Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle1){
        this.vehicle=vehicle1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Vehicle getVehicle(){
        return vehicle;

    }

}
