package com.elfstudio;

public class EnhancedPlayer {

    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health>0 && health<=100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        System.out.println("Player health is " + this.health);
        System.out.println("Damage given is " + damage);
        this.health = this.health- damage;
        if (this.health<=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
