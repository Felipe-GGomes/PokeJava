package model;

public abstract class Pokemon {
    protected String nome;
    protected String tipo;
    protected int hp;
    protected int ataque;
    protected int defesa;

    public Pokemon(String nome, String tipo, int hp, int ataque, int defesa){
        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void mostrarStatus(){
        System.out.println(nome + " | tipo: " + tipo + " | HP : " + hp + " | Ataque: " + ataque + " | Defesa: " + defesa);
    }

    public abstract void atacar();

    public String getTipo(){
        return tipo;
    }

    public String getNome(){
        return nome;
    }

    public int getHp(){
        return hp;
    }

    public int getAtaque(){
        return ataque;
    }

    public int getDefesa(){
        return defesa;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
}
