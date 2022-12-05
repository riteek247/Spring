package com.example9.config;

import com.example9.beans.Person;
import com.example9.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Preeti");
        person.setVehicle(vehicle());
        return person;

    }

}
