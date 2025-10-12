package NivelIntermediario.AulaDois;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Criar um método publico  personalizado

    /*
    * Método VOID não retorna valor nenhum!
    */

    public void sharinganAtivado(){
        System.out.println("Sharingan ativado");
    }

        /*
        * Método String vai ter que retornar uma String
        * */

    public String euSouUmNinja(){
        return "Eu sou um ninja!";
    }

    /*
     * Método int vai ter que retornar um int
     * */

    public int anosParaSerHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
