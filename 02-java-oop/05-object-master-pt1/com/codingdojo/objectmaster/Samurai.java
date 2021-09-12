package com.codingdojo.objectmaster;
public class Samurai extends Human {
    public static int numberOf = 0;
    public Samurai(){
        super(3,3,3,200);
        numberOf++;
    }

    public void deathBlow(Human target){
        int targetHealth = target.getHealth();
        targetHealth -= target.getHealth();
        this.health -= this.health / 2;
        target.setHealth(targetHealth);
    }
    
    public void meditate(){
        int increase = this.health / 2;
        this.health = this.health += increase;
    }

    public static int count(){
        return numberOf;
    }
}
