package NivelIntermediario.AbstratasVSIntarfaces;

public class Main {

    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.tacarUmaShuriken();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;
        sasuke.nomeDoNinja();
        sasuke.tacarUmaKunai();
    }
}