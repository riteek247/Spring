package com.example3.config;

import com.example3.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.tree.VariableHeightLayoutCache;

@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle vehicle1(){

        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;

    }
    @Bean(value = "hondaVehicle")
    Vehicle vehicle2(){

        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;

    }
    @Bean("Ferrari")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;

    }



}
