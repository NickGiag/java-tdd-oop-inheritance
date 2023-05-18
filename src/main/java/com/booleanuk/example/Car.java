package com.booleanuk.example;

public class Car extends Vehicle {
    public Car(int topSpeed) {
        super(topSpeed);
    }

    public boolean openDoor() {
        return true;
    }
}
