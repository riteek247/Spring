package com.example12.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {

    private String name = "Preeti";


    private final Vehicle vehicle;
    @Autowired
    public Person(@Qualifier("vehicle3") Vehicle vehicle) { //use @Qualifier to and give the value to execute
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
