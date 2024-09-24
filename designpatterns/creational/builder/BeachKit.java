package com.designpatterns.creational.builder;


public class BeachKit {
    private boolean hasSunscreen;
    private boolean hasTowel;
    private boolean hasUmbrella;
    private boolean hasSnacks;

    public void setHasSunscreen(boolean hasSunscreen) {
        this.hasSunscreen = hasSunscreen;
    }

    public void setHasTowel(boolean hasTowel) {
        this.hasTowel = hasTowel;
    }

    public void setHasUmbrella(boolean hasUmbrella) {
        this.hasUmbrella = hasUmbrella;
    }

    public void setHasSnacks(boolean hasSnacks) {
        this.hasSnacks = hasSnacks;
    }

    @Override
    public String toString() {
        return "BeachKit{" +
                "sunscreen=" + hasSunscreen +
                ", towel=" + hasTowel +
                ", umbrella=" + hasUmbrella +
                ", snacks=" + hasSnacks +
                '}';
    }
}
