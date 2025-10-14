package NivelIntermediario.PolimorfismoEAbstracao;

public class Main {

    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.habidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;
        sasuke.habidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();
    }
}
