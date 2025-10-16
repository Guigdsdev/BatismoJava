package NivelIntermediario.OverloadOuSobrecargaMetodos;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habidadeEspecial() {
        System.out.println("Eu sou um UZUMAKI e minha habilidade especial é um JUTSU de selamento");
    }
}
