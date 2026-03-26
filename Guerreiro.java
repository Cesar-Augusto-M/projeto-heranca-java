package br.edu.seuprojeto.modelo;

public class Guerreiro extends Personagem {
    private double forcaFisica;

    public Guerreiro(String nome, int nivel, double forcaFisica) {
        super(nome, nivel);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public void atacar() {
        System.out.println("⚔️ " + getNome() + " desferiu um golpe de espada com " + forcaFisica + " de força!");
    }

    public double getForcaFisica() { return forcaFisica; }
}