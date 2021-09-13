//Create a test file where you instantiate pokemons, attack pokemons, and list pokemons from a pokedex.

//Create a test file where you instantiate pokemons from a pokedex.


public class PokemonTest {
    public static void main(String[] args) {
        Pokedex poke = new Pokedex();

        Pokemon brian = poke.createPokemon("Brian", 50, "mewtoo");
        Pokemon tricia = poke.createPokemon("Tricia", 50, "pickachui");
        tricia.attackPokemon(brian);
        poke.listPokemon();
        
        
        
    }
}
