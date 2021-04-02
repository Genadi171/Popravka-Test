package com.company;

public class Truck extends Vehicle {
    private int maxWeight;

    public Truck(String make, String model, int wheels, int maxWeight) {
        super(make, model, wheels);
        this.maxWeight = maxWeight;
    }
    @Override
    public void printInfo(){
        System.out.println("Make: "+this.make);
        System.out.println("Model: "+this.model);
        System.out.println("Number of wheels: "+this.wheels);
        System.out.println("Maximum weight: "+this.maxWeight+"t");
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
