package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String aldeia;
    TipoHabilidade habilidade;

    public NinjaBasico(){
    }

    public NinjaBasico(String nome, int idade, String aldeia, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("==== Informações do Ninja ====");
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Habilidade: " + habilidade);
        System.out.println();
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ativando habilidade especial: " + habilidade + "!!!");
    }
}
