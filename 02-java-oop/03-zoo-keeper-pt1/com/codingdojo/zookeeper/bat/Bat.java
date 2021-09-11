package com.codingdojo.zookeeper.bat;
import com.codingdojo.zookeeper.mammal.Mammal;

public class Bat extends Mammal{

    public Bat(int energyLevel) {
        super(energyLevel);
        
    }

    public void fly(){
        if (energyLevel == 0){
            System.out.println("Not enough energy, eat a human");
            return;
        }else{
            energyLevel = energyLevel -= 50;
            System.out.println("Bat is soaring through the sky, your energy is now " + getEnergy() );
        }
    }

    public void eatHuman(){
        energyLevel = energyLevel += 25;
        System.out.println("Yum, your energy is now: " + getEnergy());
    }

    public void attackTown(){
        energyLevel = energyLevel -= 100;
        System.out.println("The town is on fire!!! Energy left is: " + getEnergy());
    }
    
}
