package br.edu.seuprojeto.modelo;

public class Personagem {
    private String nome;
    private int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    // Método que será sobrescrito
    public void atacar() {
        System.out.println(nome + " realizou um ataque básico.");
    }

    @Override
    public String toString() {
        return "Personagem: " + nome + " | Nível: " + nivel;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
}