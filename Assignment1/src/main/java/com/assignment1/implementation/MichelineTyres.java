package com.assignment1.implementation;

import com.assignment1.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelineTyres implements Tyres {

    public String rotate() {
        return "Vehicle running with Micheline Tyres";
    }
}
