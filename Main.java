package br.edu.seuprojeto;

import br.edu.seuprojeto.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista polimórfica (Requisito do exercício)
        List<Personagem> party = new ArrayList<>();

        // Instanciando as subclasses e referenciando pela Superclasse
        Personagem player1 = new Guerreiro("Aragorn", 10, 85.5);
        Personagem player2 = new Mago("Gandalf", 12, 150);

        party.add(player1);
        party.add(player2);

        System.out.println("=== INICIANDO BATALHA ===");
        for (Personagem p : party) {
            System.out.println(p.toString());
            p.atacar(); // Chamada polimórfica: cada classe ataca do seu jeito
            System.out.println("-------------------------");
        }
    }
}