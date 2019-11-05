package com.akshay;

public class Porsche extends CarClass {

    private int roadServiceMonths;

    public Porsche(String name, int roadServiceMonths) {
        super(name, "4WD", 4, 2, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void porscheAccelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity ==0 || newVelocity == -1){
            stop();
            changeGear(1);
        }else if (newVelocity>0 && newVelocity<=10){
            changeGear(1);
        }else if (newVelocity>10 && newVelocity<=30){
            changeGear(2);
        }else if (newVelocity>30 && newVelocity<=50){
            changeGear(3);
        }else if (newVelocity>50 && newVelocity<=100){
            changeGear(4);
        }else if (newVelocity>100 && newVelocity<=130){
            changeGear(5);
        }else {
            changeGear(6);
        }

        if (newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
