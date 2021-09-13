import java.util.ArrayList;


public class Pokedex extends AbstractPokemon {
    ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
    @Override
    public void listPokemon() {
        
       for(int i = 0; i < myPokemons.size(); i++){
            Pokemon poke = myPokemons.get(i);
            System.out.println(super.pokemonInfo(poke));

       }

        
    }
     @Override
     public Pokemon createPokemon(String name, int health, String type){
        Pokemon poke = super.createPokemon(name, health, type);
        myPokemons.add(poke);
         return poke;
    
}
}