package NivelIntermediario.AulaDois;

import NivelIntermediario.AulaDois.Ninja;

public class Main {

    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Konoha";
        naruto.idade = 17;

        // Criar o ninja Sasuke - Sasuke é um OBJETO
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Konoha";
        sasuke.idade = 18;

        // Aplicando métodos aos meus objetos
        sasuke.sharinganAtivado();
        String euSouUmNinja = sasuke.euSouUmNinja();
        System.out.println(euSouUmNinja);

        int anosParaSerHokage = sasuke.anosParaSerHokage(50);
        System.out.println("Você tem " + sasuke.idade + " anos e faltam " + anosParaSerHokage + " para se tornar hokage");

        // Criar o ninja Sakura - Sakura é um OBJETO
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Konoha";
        sakura.idade = 18;

    }
}
