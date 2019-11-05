package com.elfstudio;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
//
//        Rectangle rectangle = new Rectangle(5,6);
//        rectangle.calculate();
//
//        ArrayList<Student> list = new ArrayList<>();
//
//        Student student = new Student("Akshay","001","B.sc Medical","A");
//        Student student1 = new Student("Jatin","002","B.tech","A");
//        Student student2 = new Student("Akshit","003","Msc Computer Science","B");
//        Student student3 = new Student("Mohit","004","IIT","D");
//        Student student4 = new Student("Gagan","005","Medical","C");
//
//        student.print();
//        student1.print();
//        student2.print();
//        student3.print();
//        student4.print();
//
//        list.add(student);
//        list.add(student1);
//        list.add(student2);
//        list.add(student3);
//        list.add(student4);
//
//
//        System.out.println(list);



//
//        Player player = new Player();
//        player.name = "Akshay";
//        player.health = 20;
//        player.weapon = "M416";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Akshay",10,"Kar98");
        System.out.println("Player initial health is " + player.getHealth());

        Printer printer = new Printer(50,false);
        System.out.println("Initial pages count " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
//        printer.addToner(60);
//        System.out.println("Toner Amount is " + printer.getTonerLevel());


    }
}

