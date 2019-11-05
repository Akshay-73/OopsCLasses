package com.akshay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

//        Car porsche = new Car(2,4,"carrera","White","Super sexy with 2000 Hp");
//        Car holden = new Car(2,4,"commodore","Black","1900Hp");
//
//        System.out.println("Porsche model is " + porsche.getModel());
//        System.out.println("Holder model is " + holden.getModel());
//        System.out.println("Porsche color is " + porsche.getColor());
//
//        Account myAccount = new Account("20095846",50.1,"Akshay","akshaydalal700@gmail.com ",
//                "7347364276");
//        myAccount.deposit(50);
//        myAccount.withdrawal(100);
//        myAccount.withdrawal(10);
//
//        VipCustomer akshay = new VipCustomer("Mohit","30000");
//        System.out.println(akshay.getName());
//
//        VipCustomer jatin = new VipCustomer();
//        System.out.println(jatin.getName());
//
//        VipCustomer Manish = new VipCustomer("Manish","3000000","manishshan50@gmail.com");
//        System.out.println(Manish.getName() + "\n" + Manish.getCreditLimit());
//
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(35.0);
//        calculator.setSecondNumber(35.0);
//        System.out.println("Addition of two number is " + calculator.getAdditionResult());
//        calculator.setFirstNumber(20);
//        calculator.setSecondNumber(30);
//        System.out.println("Subtraction of two number is " + calculator.getSubtractionResult());
//        System.out.println("Division of two number is " + calculator.getDivisionResult());
//        System.out.println("Multiplication of two number is "+ calculator.getMultiplicationResult());
//
//
//        ArrayList<Car> list = new ArrayList<>();
//
//        Car porsche = new Car(4,4," Carrera "," Purple "," 35000 CC ");
//        Car holden = new Car(2,4, " Commodore "," Black "," 25000 CC ");
//        Car bmw = new Car(4,4," Bmw C34 ", " White "," 3500 CC ");
//        Car lamborghini = new Car(2,4," Aventador "," Blue "," V12 ");
//        Car bentley = new Car(2,4," Continental "," Red "," 6.0 L V12 ");
//
//        list.add(porsche);
//        list.add(holden);
//        list.add(bmw);
//        list.add(lamborghini);
//        list.add(bentley);
//
//        carList(list, "Doors,Wheels,Model,Color,Engine");
//
//    }
//
//    public static void carList(ArrayList<Car> list, String format){
//
//        String [] stringList = format.split(",");
//        int count = stringList.length;
//
//        System.out.println(format);
//
//        for (Car car: list) {
//            for (int i=0; i<count; i++){
//                System.out.print(car.printHelper(stringList[i]));
//            }
//            System.out.println("");
//        }

//        Outlander outlander = new Outlander(30);
//        outlander.steer(32);
//        outlander.outlanderAccelerate(30);
//        outlander.outlanderAccelerate(20);
//        outlander.outlanderAccelerate(-25);
//        outlander.outlanderAccelerate(-25);
//        outlander.outlanderAccelerate(-1);
//        outlander.outlanderAccelerate(100);
//        outlander.outlanderAccelerate(200);
//
//        Porsche porsche = new Porsche("Porsche",20);
//        porsche.steer(50);
//        porsche.porscheAccelerate(140);

        Case theCase = new Case("350C55","Dell","320V",new Dimensions(15,20,5));
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1080));
        Motherboard theMotherboard = new Motherboard("KD-300","Apple",8,6);

        PC myPc = new PC(theCase,theMonitor,theMotherboard);
        myPc.drawLogo();
        myPc.powerUp();
        myPc.getMotherboard().loadProgram("Windows 10.0");

        Wall theWall1 = new Wall("East",false);
        Wall theWall2 = new Wall("West",true);
        Wall theWall3 = new Wall("North",false);
        Wall theWall4 = new Wall("South",false);

        Celling celling = new Celling(50,"Blue");

        Bed bed = new Bed("Modern",4,2);

        Floor floor = new Floor("Grey","Classic With Tiles");

        Bedroom bedroom = new Bedroom(theWall1,theWall2,theWall3,theWall4,bed,celling,floor);
        bedroom.makeBed();
        bedroom.getWall1();
        bedroom.getCelling().getHeight();




        ArrayList<Wall> list = new ArrayList<>();
        list.add(theWall1);
        list.add(theWall2);
        list.add(theWall3);
        list.add(theWall4);

        for (Wall wall:list) {
            System.out.println( "Wall Direction "+wall.getDirection() + " Has Window " + wall.isHasWindow() + ".");
        }


    }
}

