package com.assignment1.implementation;

import com.assignment1.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound() {
        return "Playing music with Bose Speakers ";
    }
}
