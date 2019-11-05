package com.elfstudio;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        System.out.println("Player health is " + this.health);
        System.out.println("Damage given is " + damage);
        this.health = this.health- damage;
        if (this.health<=0){
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
