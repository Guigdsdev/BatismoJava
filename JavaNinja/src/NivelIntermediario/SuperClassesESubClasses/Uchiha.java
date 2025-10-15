package NivelIntermediario.SuperClassesESubClasses;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habidadeEspecial() {
        System.out.println("Eu sou " + nome + " estou ativando meu SHARINGAN!");
    }
}
