package com.example9.beans;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle bean created by spring");
    }
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void printHello(){
        System.out.println("Printing hello from component vehicle bean");
    }
    @Override
    public String toString(){
        return name;
    }
}
