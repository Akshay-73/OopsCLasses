package com.akshay;

public class Wall {
    private String direction;
    private boolean hasWindow;

    public Wall(String direction, boolean hasWindow) {
        this.direction = direction;
        this.hasWindow = hasWindow;
    }

    public String getDirection() {
        return direction;
    }

    public boolean isHasWindow() {
        return hasWindow;
    }
}
