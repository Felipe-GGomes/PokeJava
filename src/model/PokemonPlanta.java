package model;

public class PokemonPlanta extends Pokemon{

    public PokemonPlanta(String nome, String tipo, int hp, int ataque, int defesa) {
        super(nome, tipo, hp, ataque, defesa);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atacar() {
        System.out.println(nome + " usou Folha Navalha! Causando " + getAtaque() + " de Dano!");
    }
    
}
