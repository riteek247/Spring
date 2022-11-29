package com.example4.main;

import com.example4.beans.Vehicle;
import com.example4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh= context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is : " +veh.getName());
    }


}
