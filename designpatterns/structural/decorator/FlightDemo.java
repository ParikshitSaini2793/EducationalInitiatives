package com.designpatterns.structural.decorator;

public class FlightDemo {
    public static void main(String[] args) {
        Flight myFlight = new BasicFlight();
        myFlight = new ExtraBaggageDecorator(myFlight);
        myFlight = new MealDecorator(myFlight);
        
        System.out.println("Flight details: " + myFlight.getDescription());
        System.out.println("Total cost: $" + myFlight.getCost());
    }
}