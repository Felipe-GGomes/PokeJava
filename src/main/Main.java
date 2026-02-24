package main;

import java.util.List;
import java.util.Scanner;

import model.Pokemon;
import service.PokedexService;

public class Main {
    public static void main(String[] args) {
        PokedexService pokedex = new PokedexService();
        Scanner sc = new Scanner(System.in);
        List<Pokemon> pokemons = pokedex.ListarPokemons();

        System.out.println("===Mini Jogo de Pokemon===");
        System.out.println("Escolha seu Pokemon:");

        for (int i = 0; i < pokemons.size(); i++){
            Pokemon p = pokemons.get(i);
            System.out.println((i + 1) + " - " + p.getNome() + " (" + p.getTipo() + ")");
        }

        System.out.println("Digite o número do Pokemon escolhido:");
        int escolha = sc.nextInt();

        Pokemon escolhido = pokedex.obterPorIndice(escolha -1);

        if (escolhido == null){
            System.out.println("Escolha Inválida!");
            sc.close();
            return;
        }

        System.out.println("Você escolheu: ");
        escolhido.mostrarStatus();

        System.out.println(escolhido.getNome() + " Entra em campo!");
        escolhido.atacar();

        sc.close();
    }
}
