package model;

public class PokemonFogo extends Pokemon{

    public PokemonFogo(String nome, String tipo, int hp, int ataque, int defesa) {
        super(nome, tipo, hp, ataque, defesa);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atacar() {
        System.out.println(nome + " Usou lança Chamas! Causando " + getAtaque() + " de Dano!");
    }

    @Override
    protected int calculaDano(Pokemon atacante, Pokemon defensor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculaDano'");
    }
    
}
