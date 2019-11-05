package com.akshay;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;


    public double getAdditionResult(){

       double getAddition = firstNumber + secondNumber;
            return getAddition;
    }

    public double getSubtractionResult(){
       // double getSubtraction ;
        //if (firstNumber >= secondNumber) {
          double  getSubtraction = firstNumber - secondNumber;
       // }else {
        //    System.out.println("First number is greater");
       // }
        return getSubtraction;
    }

    public double getDivisionResult(){
        double getDivision = firstNumber/secondNumber;
        return getDivision;
    }

    public double getMultiplicationResult(){
        double getMultiplication = firstNumber * secondNumber;
        return getMultiplication;

    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
