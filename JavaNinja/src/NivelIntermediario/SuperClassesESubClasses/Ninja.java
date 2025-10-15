package NivelIntermediario.SuperClassesESubClasses;

public abstract class Ninja implements EstrategiasDeBatalha {

    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Métodos geral! todas as classes vão ter

   public void habidadeEspecial(){
       System.out.println("Meu nome é " + nome + " esse é meu ataque especial!");
   }

   // Sobrescrevendo o método da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estrategia de batalha!");
    }
}
