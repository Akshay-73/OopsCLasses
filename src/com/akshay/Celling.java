package com.akshay;

public class Celling {

    private int height;
    private String paintedColor;

    public Celling(int height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPaintedColor(String paintedColor) {
        this.paintedColor = paintedColor;
    }

    public String getPaintedColor() {
        return paintedColor;
    }
}
