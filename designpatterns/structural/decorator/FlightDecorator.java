package com.designpatterns.structural.decorator;

public abstract class FlightDecorator implements Flight {
    protected Flight decoratedFlight;

    public FlightDecorator(Flight decoratedFlight) {
        this.decoratedFlight = decoratedFlight;
    }

    @Override
    public String getDescription() {
        return decoratedFlight.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedFlight.getCost();
    }
}