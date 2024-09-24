package com.designpatterns.structural.decorator;


public class MealDecorator extends FlightDecorator {
    public MealDecorator(Flight decoratedFlight) {
        super(decoratedFlight);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", meal included";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.0;
    }
}