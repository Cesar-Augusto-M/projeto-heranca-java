# projeto-heranca-java
#  Exercício: Sistema de RPG em Java

Projeto acadêmico para demonstrar conceitos de **Herança** e **Polimorfismo** em Java 17+, utilizando o fluxo de trabalho **GitHub Flow**.

---

##  Integrante
* **Césa Augusto** - RA: `4231921453`

---

## Descrição do Tema
O sistema modela uma mecânica básica de **RPG (Role Playing Game)**. A hierarquia foi construída para gerenciar diferentes tipos de heróis em um jogo. 

### Detalhes da Hierarquia:
1.  **Personagem (Superclasse):** Define as propriedades base de qualquer herói, como `nome` e `nivel`, além do método genérico `atacar()`.
2.  **Guerreiro (Subclasse):** Especialização que foca em `forcaFisica`. Sobrescreve o ataque para um golpe de espada.
3.  **Mago (Subclasse):** Especialização focada em `mana`. Sobrescreve o ataque para uma habilidade mágica.

No `Main.java`, utilizamos o **Polimorfismo** para iterar sobre uma lista de personagens e executar o método `atacar()`, onde cada objeto executa sua própria lógica de combate, independentemente de estarem em uma coleção do tipo `Personagem`.

---

##  Estrutura de Pastas
```text
projeto-heranca/
├─ README.md
└─ src/main/java/br/edu/seuprojeto/
   ├─ Main.java
   └─ modelo/
      ├─ Personagem.java
      ├─ Guerreiro.java
      └─ Mago.java
