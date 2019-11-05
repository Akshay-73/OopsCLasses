package com.OopExercise;

public class Main {

    public static void main(String[] args){

        Hamburgers hamburgers = new Hamburgers("Basic","White","Sausage",3.56);
        double price = hamburgers.itemizeHamburger();
        hamburgers.addHamburgerAddition1("Tomato",0.24);
        hamburgers.addHamburgerAddition2("Lettuce",1.02);
        hamburgers.addHamburgerAddition3("Cheese",2.01);
        System.out.println("Total hamburger price is " + hamburgers.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.60);
        healthyBurger.addHealthyAddition1("Egg",5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total  Healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition1("sasuge",5.20);
        deluxeBurger.itemizeHamburger();

    }
}
