package com.KfcChallange;

public class Main {

    public static void main(String[] args){

        Bucket fullBucket = new Bucket("Deluxe",11,500);
        fullBucket.addBucketTopping1("White sauce",20);
        fullBucket.addBucketTopping2("Snack's",10);
        fullBucket.addBucketTopping3("Red Sauce",20);
        System.out.println("Total bucket price is :-> " + fullBucket.itemizeBucket());

    }
}
