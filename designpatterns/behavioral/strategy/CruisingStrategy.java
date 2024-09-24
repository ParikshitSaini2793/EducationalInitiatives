package com.designpatterns.behavioral.strategy;


public class CruisingStrategy implements BikeStrategy {
    @Override
    public void ride() {
        System.out.println("Riding the bike in cruising mode!");
    }
}