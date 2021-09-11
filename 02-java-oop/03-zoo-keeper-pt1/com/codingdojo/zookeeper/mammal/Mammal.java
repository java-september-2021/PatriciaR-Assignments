package com.codingdojo.zookeeper.mammal;
public class Mammal{
    protected int energyLevel;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public void setEnergy(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int getEnergy(){
        return energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Energy level: " + getEnergy());
        return energyLevel;
    }
}