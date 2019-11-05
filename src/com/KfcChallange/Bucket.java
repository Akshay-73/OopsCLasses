package com.KfcChallange;

public class Bucket {

    private String name;
    private int numberOfPieces;
    private double price;

    private String topping1Name;
    private double topping1Price;

    private String topping2Name;
    private double topping2Price;

    private String topping3Name;
    private double topping3Price;

    public Bucket(String name, int numberOfPieces, double price) {
        this.name = name;
        this.numberOfPieces = numberOfPieces;
        this.price = price;
    }

    public void addBucketTopping1(String name, double price){
        this.topping1Name = name;
        this.topping1Price = price;
    }

    public void addBucketTopping2(String name, double price){
        this.topping2Name = name;
        this.topping2Price = price;
    }

    public void addBucketTopping3(String name, double price){
        this.topping3Name = name;
        this.topping3Price = price;
    }

    public double itemizeBucket(){
        double bucketPrice = this.price;
        System.out.println(this.name + " bucket " + "with " + this.numberOfPieces + " number of pieces is added " + "," + " price is " + this.price);
        if (this.topping1Name!=null){
            bucketPrice += topping1Price;
            System.out.println("Added " + this.topping1Name + " for an extra " + this.topping1Price);
        }

        if (this.topping2Name!=null){
            bucketPrice += topping2Price;
            System.out.println("Added " + this.topping2Name + " for an extra " + this.topping2Price);
        }

        if (this.topping3Name!=null){
            bucketPrice += topping3Price;
            System.out.println("Added " + this.topping3Name + " for an extra " + this.topping3Price);
        }

        return bucketPrice;
    }
}
