package NivelIntermediario.InterfacesEHerancaMultiplas;

public class Main {
    public static void main(String[] args) {

        // Obj Sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 15;
        sasuke.aldeia = "KONOHA";
        sasuke.sharinganAtivado();

        // Obj Kakashi
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.idade = 30;
        kakashi.aldeia = "KONOHA";
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
    }
}
