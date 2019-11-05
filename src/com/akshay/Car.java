package com.akshay;

public class Car {

    private int doors;
    private int wheels;   // public and private are access modifier.
    private String model;
    private String color;
    private String engine;

    public Car(int doors, int wheels, String model, String color, String engine) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
       this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String printHelper(String value){
        String var = "";
            switch (value){
                case "Doors":  var = String.valueOf(getDoors()); break;
                case "Wheels": var = String.valueOf(getWheels()); break;
                case "Model":  var = getModel(); break;
                case "Color":  var =getColor(); break;
                case "Engine": var =getEngine(); break;
            }
            return var;
    }

}
