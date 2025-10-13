package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Minha habilidade especial é: " + habilidadeEspecial);;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " +  nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel Dificuldade: " + nivelDificuldade);
        System.out.println("Status Missão: " + statusMissao);
        System.out.println("Minha habilidade especial é: " + habilidadeEspecial);
    }
}
