package com.designpatterns.creational.builder;

public class BeachVisitDemo {
    public static void main(String[] args) {
        BeachKit kit = new BeachKitBuilder()
                .addSunscreen()
                .addTowel()
                .addSnacks()
                .build();
        
        System.out.println("Beach Kit: " + kit);
    }
}