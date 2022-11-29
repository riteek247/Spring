package com.example2.main;

import com.example2.ProjectConfig.java.ProjectConfig;
import com.example2.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.lang.model.element.NestingKind;

public class Example2 {


    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle2",Vehicle.class);
        System.out.println("Vehicle name from spring context is :" + veh.getName());
    }
}
