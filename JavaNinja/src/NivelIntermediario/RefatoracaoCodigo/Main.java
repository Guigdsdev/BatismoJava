package NivelIntermediario.RefatoracaoCodigo;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------- Naruto Uzumaki -----------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 18, 30, NivelNinja.GENNIN, Bijuu.KURAMA);
        System.out.println(naruto.bijuu);

        System.out.println("----------------- Sasuke Uchiha -----------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENNIN);
        sasuke.habidadeEspecial();

        System.out.println("----------------- Itachi Uchiha -----------------");
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27, 100, NivelNinja.JOUNNIN);
        itachi.habidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();

        System.out.println("----------------- Madara Uchiha -----------------");
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 40, 900, NivelNinja.KAGE);
        madara.habidadeEspecial();
        // Método comum
        madara.estrategiaDeBatalhaNinja();
        // Método sobrecarregado
        madara.estrategiaDeBatalhaNinja(170);
    }
}
