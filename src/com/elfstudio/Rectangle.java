package com.elfstudio;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

   public void calculate(){
        System.out.println(length*width);
    }
}
