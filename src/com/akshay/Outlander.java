package com.akshay;

public class Outlander extends CarClass {

    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void outlanderAccelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity ==0 || newVelocity == -1){
            stop();
            changeGear(1);
        }else if (newVelocity>0 && newVelocity <=10){
            changeGear(1);
        }else if (newVelocity>10 && newVelocity <=30){
            changeGear(2);
        }else if (newVelocity>30 && newVelocity <=50){
            changeGear(3);
        }else if (newVelocity>50 && newVelocity <=90){
            changeGear(4);
        }else if (newVelocity>90 && newVelocity <=120){
            changeGear(5);
        }else {
            changeGear(6);
        }

        if (newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
