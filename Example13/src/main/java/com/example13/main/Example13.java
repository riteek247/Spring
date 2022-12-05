package com.example13.main;

import com.example13.beans.Person;
import com.example13.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from spring context is :" +person.getName());
        System.out.println("Vehicle that "+ person.getName()+" owns is "+person.getVehicle());
    }

}
