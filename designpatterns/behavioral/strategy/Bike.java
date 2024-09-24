package com.designpatterns.behavioral.strategy;

public class Bike {
    private BikeStrategy strategy;

    public void setStrategy(BikeStrategy strategy) {
        this.strategy = strategy;
    }

    public void ride() {
        strategy.ride();
    }
}