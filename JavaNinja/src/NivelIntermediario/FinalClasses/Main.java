package NivelIntermediario.FinalClasses;

public class Main {

    public static void main(String[] args) {
        // Obj Naruto
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 18, 30, NivelNinja.GENNIN);
        naruto.habidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

       // Obj Anbu
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja anbu";
    }
}
