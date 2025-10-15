package NivelIntermediario.OverloadOuSobrecargaConstrutores;

import NivelIntermediario.PolimorfismoEAbstracao.EstrategiasDeBatalha;

public class Uchiha extends Ninja implements EstrategiasDeBatalha {

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habidadeEspecial() {
        System.out.println("Eu sou " + nome + " estou ativando meu SHARINGAN!" + " e eu tenho " + numeroDeMissoesConcluidas + " missoes concluidas e meu nivel é " + rank);
    }
}
