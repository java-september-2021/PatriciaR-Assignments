class Pokemon{
    private String name;
    private int health;
    private String type;
    public static int count;

    public Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        count ++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void attackPokemon(Pokemon target){
        int targetHealth = target.getHealth();
        targetHealth = targetHealth -=10;
        target.setHealth(targetHealth);
    }
}