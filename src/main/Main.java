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

        System.out.println("=================Prepare-se para a batalha=================");

        System.out.println("| " + escolhido.getNome() + " Entra em campo!");

        System.out.println("| Um Pokemon selvagem aparece!");

        Pokemon selvagem = pokedex.obterPokemonAleatorio();
        System.out.println("| Um " + selvagem.getNome() + " apareceu!");
        while (escolhido.getHp() > 0 && selvagem.getHp() > 0){
            System.out.println("=================Batalha=================");
            System.out.println("| O que deseja fazer?");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");
            int acao = sc.nextInt();
            if (acao == 1){
                //ação do seu pokemon
                System.out.println("| " + escolhido.getNome() + " Ataca!");
                int dano = pokedex.calculaDano(escolhido, selvagem);
                System.out.println("| " + escolhido.getNome() + " causa " + dano + " de dano!");
                selvagem.setHp(selvagem.getHp() - dano);
                System.out.println("| " + selvagem.getNome() + " tem " + selvagem.getHp() + " HP restante!");

                //ação do pokemon selvagem
                if (selvagem.getHp() > 0){
                    System.out.println("| " + selvagem.getNome() + " Ataca!");
                    int danoSelvagem = pokedex.calculaDano(selvagem, escolhido);
                    System.out.println("| " + selvagem.getNome() + " causa " + danoSelvagem + " de dano!");
                    escolhido.setHp(escolhido.getHp() - danoSelvagem);
                    System.out.println("| " + escolhido.getNome() + " tem " + escolhido.getHp() + " HP restante!");
                }
                 if (escolhido.getHp() <= 0){
                        System.out.println("| " + escolhido.getNome() + " foi derrotado! Você perdeu a batalha!");
                    } else if (selvagem.getHp() <= 0){
                        System.out.println("| " + selvagem.getNome() + " foi derrotado! Você venceu a batalha!");
                    }
            }
            else if (acao == 2){
                System.out.println("| Você fugiu da batalha!");
                break;
            } else {
                System.out.println("| Ação inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
