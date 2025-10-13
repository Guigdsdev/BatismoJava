package NivelIntermediario.AulaTres;

public class Main {

    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Konoha";
        naruto.idade = 17;

        // Aplicando métodos aos meus objetos
        naruto.jutsuSelamento();

        // Criar o ninja Sasuke - Sasuke é um OBJETO
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Konoha";
        sasuke.idade = 18;

        // Aplicando métodos aos meus objetos

        sasuke.sharinganAtivado();
        String euSouUmNinja = sasuke.euSouUmNinja();
        System.out.println(euSouUmNinja);

        // Criar o ninja Sakura - Sakura é um OBJETO
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Konoha";
        sakura.idade = 18;

        // Aplicando métodos aos meus objetos
        sakura.ativarModoCura();

        Hyuuga hinata = new Hyuuga();
        hinata.nome = "Hinata Hyuuga";
        hinata.aldeia = "Konoha";
        hinata.idade = 17;

        // Aplicando métodos aos meus objetos
        hinata.ativarByakugan();
    }
}
