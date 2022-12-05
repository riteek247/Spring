package com.assignment1.beans;

import com.assignment1.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {
    private String name="Honda";
    private VehicleServices vehicleServices;
    @Autowired
    public Vehicle(VehicleServices vehicleServices){
        this.vehicleServices=vehicleServices;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    @Override
    public String toString(){
        return name;
    }
}
