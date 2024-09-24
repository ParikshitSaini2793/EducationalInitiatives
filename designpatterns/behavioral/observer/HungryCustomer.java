package com.designpatterns.behavioral.observer;

public class HungryCustomer implements Customer {
    private String name;

    public HungryCustomer(String name) {
        this.name = name;
    }

    @Override
    public void update(String location) {
        System.out.println(name + " has been notified that the pizza truck is now at " + location);
    }
}