package com.sfwork.config;

import com.sfwork.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {


    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    String hello() {
        return "Hello Spring";

    }
    @Bean
    Integer number(){
        return 16;
    }

}
