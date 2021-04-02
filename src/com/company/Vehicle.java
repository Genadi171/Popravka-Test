package com.company;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int wheels;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Vehicle(String make, String model, int wheels) {
        this.make = make;
        this.model = model;
        this.wheels = wheels;
    }

    public abstract void printInfo();
}

