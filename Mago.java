package br.edu.seuprojeto.modelo;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println("🔮 " + getNome() + " lançou uma bola de fogo gastando " + mana + " de mana!");
    }

    public int getMana() { return mana; }
}