package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public Pokemon obterPokemonAleatorio(){
        Random random = new Random();
        int pokemonindex = random.nextInt(pokemons.size());
        return pokemons.get(pokemonindex);
    }

    public int calculaDano(Pokemon atacante, Pokemon defensor){
        int dano = atacante.getAtaque() - (defensor.getDefesa() / 2);
        if (dano < 0) {
            dano = 0;
        }
        return dano;
    }
} 