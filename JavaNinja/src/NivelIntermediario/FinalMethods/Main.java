package NivelIntermediario.FinalMethods;

public class Main {

    public static void main(String[] args) {
        // Obj Naruto
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 18, 30, NivelNinja.GENNIN);
        naruto.habidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj Sasuke
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENNIN);
        sasuke.habidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        // Obj Itachi
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27, 100, NivelNinja.JOUNNIN);
        itachi.habidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();

        // Obj madara
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 40, 900, NivelNinja.KAGE);
        madara.habidadeEspecial();
        // Método comum
        madara.estrategiaDeBatalhaNinja();
        // Método sobrecarregado
        madara.estrategiaDeBatalhaNinja(170);
    }
}
