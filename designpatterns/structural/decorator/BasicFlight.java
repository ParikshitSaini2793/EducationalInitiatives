package com.designpatterns.structural.decorator;

public class BasicFlight implements Flight {
    @Override
    public String getDescription() {
        return "Basic flight";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
