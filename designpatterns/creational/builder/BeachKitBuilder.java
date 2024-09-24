package com.designpatterns.creational.builder;

public class BeachKitBuilder {
    private BeachKit beachKit;

    public BeachKitBuilder() {
        this.beachKit = new BeachKit();
    }

    public BeachKitBuilder addSunscreen() {
        beachKit.setHasSunscreen(true);
        return this;
    }

    public BeachKitBuilder addTowel() {
        beachKit.setHasTowel(true);
        return this;
    }

    public BeachKitBuilder addUmbrella() {
        beachKit.setHasUmbrella(true);
        return this;
    }

    public BeachKitBuilder addSnacks() {
        beachKit.setHasSnacks(true);
        return this;
    }

    public BeachKit build() {
        return beachKit;
    }
}