

 public class Human{
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;
    


    public Human(){
        strength = 3;
        stealth = 3;
        intelligence = 3;
        health = 100;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    public int getStealth(){
        return stealth;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public int getIntelligence(){
        return intelligence;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void attack(Human target){
        int targetHealth = target.getHealth();
        targetHealth -= this.strength;
        target.setHealth(targetHealth);
    
    }

    

}