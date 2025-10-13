package NivelIntermediario.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuMorto;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    // All args constructors -> Construtor com todos os argumentos.
    public Hokages(String nome, int idade, boolean vivoOuMorto, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    // No args constructors -> Construtor sem argumentos
    public Hokages() {

    }
}
