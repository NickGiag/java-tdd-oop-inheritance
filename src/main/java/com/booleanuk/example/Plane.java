package com.booleanuk.example;

public class Plane extends Vehicle{

    public Plane(int topSpeed) {
        super(topSpeed);
    }

    public String move() {
        return "Flies at: " + this.topSpeed;
    }
}
