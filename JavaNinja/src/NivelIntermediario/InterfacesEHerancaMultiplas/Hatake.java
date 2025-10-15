package NivelIntermediario.InterfacesEHerancaMultiplas;

public class Hatake extends Ninja implements Sharingan, Anbu{

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Sharingan ativado!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Sou um ninja de elite! pertenço a anbu.");
    }
}
