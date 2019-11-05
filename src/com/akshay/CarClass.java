package com.akshay;

public class CarClass extends Vehicle {

    private int wheels;
    private int doors;
    private int numberOfGears;
    private boolean isManual;

    private int currentGear;

    public CarClass(String name, String size, int wheels, int doors, int numberOfGears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.numberOfGears = numberOfGears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear(): Changed to " + this.currentGear + " gear");
    }
    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity is " + speed + " in direction " + direction);
    }
}
