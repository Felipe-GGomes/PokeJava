package model;

public class PokemonAgua extends Pokemon{

    public PokemonAgua(String nome, String tipo, int hp, int ataque, int defesa) {
        super(nome, tipo, hp, ataque, defesa);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atacar() {
        System.out.println(nome + " usou Jato de Água! Causando " + getAtaque() + " de Dano!");
    }
        
}
