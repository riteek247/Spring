package com.example12.config;

import com.example12.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example12.beans")
public class ProjectConfig {
//    @Primary use primary to assign default function.
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }
}
