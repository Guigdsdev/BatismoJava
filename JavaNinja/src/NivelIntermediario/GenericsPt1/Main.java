package NivelIntermediario.GenericsPt1;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsa = new BolsaGenerica<>();

        bolsa.adicionarItemGenerico(kunai);
        bolsa.adicionarItemGenerico(shuriken);
        bolsa.adicionarItemGenerico(pergaminho);

        System.out.println(bolsa);
    }
}
