package com.designpatterns.structural.decorator;

public class ExtraBaggageDecorator extends FlightDecorator {
    public ExtraBaggageDecorator(Flight decoratedFlight) {
        super(decoratedFlight);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", extra baggage";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.0;
    }
}