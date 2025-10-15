package NivelIntermediario.SuperClassesESubClasses;

public class Main {

    public static void main(String[] args) {

        // Obj naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.habidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;
        sasuke.habidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        // Obj itachi

        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da folha", 27);
        itachi.estrategiaDeBatalhaNinja();
        itachi.habidadeEspecial();
    }
}
