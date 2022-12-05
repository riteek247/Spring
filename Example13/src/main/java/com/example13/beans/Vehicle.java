package com.example13.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {

    private String name;
    @Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printHello(){
        System.out.println("Printing hello from component vehicle bean");
    }
    @Override
    public String toString(){
        return name;
    }
}
