package service;

import java.util.ArrayList;
import java.util.List;

import model.Pokemon;
import model.PokemonAgua;
import model.PokemonFogo;
import model.PokemonPlanta;

public class PokedexService {
    private List<Pokemon> pokemons = new ArrayList<>();

    public PokedexService() {
        pokemons.add(new PokemonAgua("Squirtle", "Água", 44, 48, 65));
        pokemons.add(new PokemonFogo("Charmander", "Fogo", 39, 52, 43));
        pokemons.add(new PokemonPlanta("Bulbasaur", "Planta", 45, 49, 49));
    }

    public List<Pokemon> ListarPokemons(){
        return pokemons;
    }

    public Pokemon obterPorIndice(int indice){
        if (indice < 0 || indice >= pokemons.size()) {
            return null;
        }
        return pokemons.get(indice);
    }
} 