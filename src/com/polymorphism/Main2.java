package com.polymorphism;

class Car {

    private String name;
    private int numberOfCylinder;
    private boolean engine;
    private int wheel;

    public Car(String name, int numberOfCylinder) {
        this.name = name;
        this.numberOfCylinder = numberOfCylinder;
        this.engine = true;
        this.wheel = 4;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public String startEngine(){
        return "Car -> startEngine";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";

    }
}

class Holden extends Car {


    public Holden(String name, int numberOfCylinder) {
        super(name, numberOfCylinder);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate";
    }

    @Override
    public String brake() {
        return "Holden -> brake";
    }
}

class Porsche extends Car{


    public Porsche(String name, int numberOfCylinder) {
        super(name, numberOfCylinder);
    }

    @Override
    public String startEngine() {
        return "Porsche -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Porsche -> accelerate";
    }

    @Override
    public String brake() {
        return "Porsche -> brake";
    }
}

public class Main2 {

    public static void main(String[] args){

        Car car = new Car("Base Car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Holden holden = new Holden("Outlander",6);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }
}
