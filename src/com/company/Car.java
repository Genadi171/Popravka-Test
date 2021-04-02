package com.company;

 public class Car extends Vehicle{
    private int doorCount;

  public Car(String make, String model, int wheels, int doorCount) {
   super(make, model, wheels);
   this.doorCount = doorCount;


  }
   @Override
   public void printInfo(){
    System.out.println("Make: "+this.make);
    System.out.println("Model: "+this.model);
    System.out.println("Number of wheels: "+this.wheels);
   }

  public int getDoorCount() {
   return doorCount;
  }

  public void setDoorCount(int doorCount) {
   this.doorCount = doorCount;
  }
 }
