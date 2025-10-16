package NivelIntermediario.ReferenciaXValor;

public class Main {

    public static void main(String[] args) {
        // Obj Naruto
        System.out.println("----------------- Naruto Uzumaki -----------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 18, 30, NivelNinja.GENNIN);
        System.out.println(naruto);
        // Obj Sasuke
        System.out.println("----------------- Sasuke Uchiha -----------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENNIN);
        System.out.println(sasuke);
    }
}
