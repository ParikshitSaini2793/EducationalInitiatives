package com.designpatterns.behavioral.observer;


// This example demonstrates the Observer pattern by notifying customers
// when a pizza truck arrives at a new location.

import java.util.ArrayList;
import java.util.List;

public class PizzaTruck {
    private List<Customer> customers = new ArrayList<>();
    private String location;

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void setLocation(String location) {
        this.location = location;
        notifyCustomers();
    }

    private void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(location);
        }
    }
}