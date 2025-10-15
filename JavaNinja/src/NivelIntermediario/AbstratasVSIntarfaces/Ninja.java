package NivelIntermediario.AbstratasVSIntarfaces;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    public abstract void nomeDoNinja();

    public void tacarUmaKunai(){
        System.out.println("Taquei uma kunai");
    }
}