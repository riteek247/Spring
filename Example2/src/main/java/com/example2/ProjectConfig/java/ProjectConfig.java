package com.example2.ProjectConfig.java;


import com.example2.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;

    }
    @Bean
    Vehicle vehicle2(){

        var veh = new Vehicle();
        veh.setName("Honda City");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){

        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }


}