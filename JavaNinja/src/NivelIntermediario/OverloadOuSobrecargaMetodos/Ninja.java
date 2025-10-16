package NivelIntermediario.OverloadOuSobrecargaMetodos;

public abstract class Ninja implements EstrategiasDeBatalha {

    //TODO Incluir novos 2 atributos: numeroDeMissoes e Rank
    // TODO Rank: Gennin, Jounnin, Chunnin, Kage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja(){
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
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
    // Inteligência de combate -> Sobrecarga de método
    @Override
    public void estrategiaDeBatalhaNinja(int qi){
        if(qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais");
        }
    }
}
