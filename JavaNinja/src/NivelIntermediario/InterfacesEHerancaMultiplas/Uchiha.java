package NivelIntermediario.InterfacesEHerancaMultiplas;

public class Uchiha extends Ninja implements Sharingan{

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Sharigan ativado!");
    }
}
