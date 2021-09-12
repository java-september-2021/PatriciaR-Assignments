package com.codingdojo.objectmaster;

public class Ninja extends Human{
    public Ninja(){
        super(3,10,3,100);
    }
    
    public void steal(Human target){
        int targetHealth = target.getHealth();
        targetHealth -= this.stealth;
        this.health += this.stealth;
        target.setHealth(targetHealth);
        
    }

    public void runAway(){
        health -= 10;
        this.setHealth(health);
    }
}
