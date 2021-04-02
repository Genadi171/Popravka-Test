package com.company;

public class Main {

    public static void main(String[] args) {
	    Truck truck1 = new Truck ("Scania", "Ivan", 7, 10);
        Car car1 = new Car ("Opel", "Astra", 4, 2  );

       car1.printInfo();
       truck1.printInfo();
    }
}
