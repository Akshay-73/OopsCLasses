package com.akshay;

public class VipCustomer {

    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("defaultName","500000","unknow54@gmail.com");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name,creditLimit,"akshaydalal700@gmail.com");
    }

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
