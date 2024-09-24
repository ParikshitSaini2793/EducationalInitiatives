package com.designpatterns.behavioral.strategy;

public class BikeDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        
        bike.setStrategy(new RacingStrategy());
        bike.ride();
        
        bike.setStrategy(new CruisingStrategy());
        bike.ride();
    }
}