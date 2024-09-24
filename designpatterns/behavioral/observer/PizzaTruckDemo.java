package com.designpatterns.behavioral.observer;

public class PizzaTruckDemo {
    public static void main(String[] args) {
        PizzaTruck truck = new PizzaTruck();
        
        Customer alice = new HungryCustomer("Alice");
        Customer bob = new HungryCustomer("Bob");
        
        truck.addCustomer(alice);
        truck.addCustomer(bob);
        
        truck.setLocation("Main Street");
        truck.setLocation("Park Avenue");
    }
}