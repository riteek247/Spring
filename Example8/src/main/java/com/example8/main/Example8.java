package com.example8.main;

import com.example8.beans.Vehicle;
import com.example8.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example8 {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () ->{

            Vehicle audi= new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random Number = "+randomNumber);

        if ((randomNumber%2)==0){
            context.registerBean("Volkswagen", Vehicle.class,volkswagenSupplier);

        }else {
            context.registerBean("Audi", Vehicle.class,audiSupplier);
        }
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try{

            volksVehicle= context.getBean("volkswagen", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating volkswagen vehicle");
        }
        try{
            audiVehicle= context.getBean("Audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Audi vehicle");
        }
        if (null != volksVehicle){
            System.out.println("programing vehicle name from spring context is :" + volksVehicle.getName());
        }else {
            System.out.println("Programing vehicle name from spring context is :" + audiVehicle.getName());
        }
    }
}
