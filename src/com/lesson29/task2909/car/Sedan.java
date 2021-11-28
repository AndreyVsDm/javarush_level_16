package com.lesson29.task2909.car;

public class Sedan extends Car{

    public Sedan(int numberOfPassengers) {
        super(0, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return Car.MAX_SEDAN_SPEED;
    }
}
