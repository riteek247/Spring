package com.example13.config;

import com.example13.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example13.beans")
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
