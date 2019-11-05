package com.akshay;

public class Bed {

    private String style;
    private int numberOfPillow;
    private int height;

    public Bed(String style, int numberOfPillow, int height) {
        this.style = style;
        this.numberOfPillow = numberOfPillow;
        this.height = height;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }

    public String getStyle() {
        return style;
    }

    public int getNumberOfPillow() {
        return numberOfPillow;
    }

    public int getHeight() {
        return height;
    }
}
