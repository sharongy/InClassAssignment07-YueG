package com.example.inclassassignment07_yueg;

import java.io.Serializable;

public class Animal implements Serializable {
    private String animalName;
    private int leg;
    private boolean fur;
    private String info;

    public Animal(String animalName, int leg, boolean fur, String info) {
        this.animalName = animalName;
        this.leg = leg;
        this.fur = fur;
        this.info = info;
    }

    public String toString(){
        return "Animal Name: " + animalName + "\nNumber of Legs: " + leg + "\nHas Fur? " + fur + "\nAdditional Information: " + info;
    }
}
