public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);
        
    }

    public void throwSomething(){
        if (energyLevel == 0){
            System.out.println("Not enough energy, eat a banana");
            return;
        }else{
            energyLevel = energyLevel -= 5;
            System.out.println("Gorilla has thrown something, your energy is now " + getEnergy() );
        }
    }
    
    public void eatBananas(){
        energyLevel = energyLevel += 10;
        System.out.println("Yum, your energy is now: " + getEnergy());
    }

    public void climb(){
        energyLevel =  energyLevel -= 10;
        System.out.println("Gorilla has climbed a tree, your energy is now: " + getEnergy());
    }
}
