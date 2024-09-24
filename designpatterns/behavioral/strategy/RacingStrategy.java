package com.designpatterns.behavioral.strategy;



public class RacingStrategy implements BikeStrategy {
    @Override
    public void ride() {
        System.out.println("Riding the bike in racing mode!");
    }
}
