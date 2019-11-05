package com.elfstudio;

public class Student {

    private String name;
    private String id;
    private String theClass;
    private String section;

    private static String college = "ITI";

    public Student(String name, String id, String theClass, String section) {
        this.name = name;
        this.id = id;
        this.theClass = theClass;
        this.section = section;
    }

    public void print(){
            System.out.println( name + " " + id + " " + theClass + " " + section + " " +college + ".");
    }

    @Override
    public String toString() {
        return name + " " + id + " " + theClass + " " + section;
    }
}
