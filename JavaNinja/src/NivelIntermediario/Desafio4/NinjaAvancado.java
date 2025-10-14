package NivelIntermediario.Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String aldeia;
    TipoHabilidade habilidade;
    String especialidade;

    public NinjaAvancado(){
    }

    public NinjaAvancado(String nome, int idade, String aldeia, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("==== Informações do Ninja ====");
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialização: " + especialidade);
        System.out.println();
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ativando habilidade especial: " + habilidade + "!!!");
    }
}
