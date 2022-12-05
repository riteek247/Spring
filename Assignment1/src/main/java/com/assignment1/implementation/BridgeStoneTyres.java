package com.assignment1.implementation;

import com.assignment1.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate() {
        return "Vehicle running with Bridgestone Tyres";
    }
}
