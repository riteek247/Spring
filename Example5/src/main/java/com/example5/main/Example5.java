package com.example5.main;

import com.example5.beans.Vehicle;
import com.example5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component vehicle name from spring context is :" +vehicle.getName());
        vehicle.printHello();
    }
}
