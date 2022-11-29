package com.sfwork.main;

import com.sfwork.beans.Vehicle;
import com.sfwork.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args){
        Vehicle vehicle =new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from Non-spring context is :"+vehicle.getName());
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh  = context.getBean(Vehicle.class);
        System.out.println("Vehicle name form spring context is :" + veh.getName());


        String hello = context.getBean(String.class);
        System.out.println("String value from spring context is :" + hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from spring context is  :  " + num);



    }
}
