package com.example3.main;

import com.example3.beans.Vehicle;
import com.example3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from spring context is : "+veh1.getName());

        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from spring context is : "+veh2.getName());

        Vehicle veh3 = context.getBean("Ferrari", Vehicle.class);
        System.out.println("Vehicle name from spring context is : "+veh3.getName());
    }
}
