package com.codingdojo.objectmaster;
public class Wizard extends Human {
    public Wizard(){
        super(3,3,8,50);
    }
    
    public void heal(Human target){
        if (this.intelligence == 0){
            System.out.println("not enough intelligence");
            return;
        }else{
       int targetHealth = target.getHealth();
       targetHealth += this.intelligence;
       target.setHealth(targetHealth);
    }
    }
    public void fireBall(Human target){
        if (this.intelligence == 0){
            System.out.println("not enough intelligence");
            return;
        }else{
            int targetHealth = target.getHealth();
            targetHealth -= this.intelligence * 3;
            target.setHealth(targetHealth);
    }
    }
}
