package com.example7.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
@Component
public class Vehicle {
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying Vehicle bean");
    }

    public void printHello(){
        System.out.println("Printing hello from component vehicle bean !!!");
    }
}
