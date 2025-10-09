package Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE -> Condições
        * Objetivo da aula -> Passar o ninja de nível de acordo com o número de missões.
        */


        String nome = "Naruto Uzumaki";
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 9;

        if(numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20 ) {
            System.out.println("Rank: Jounin");
            
        } else{

            System.out.println("Rank: Genin");
        }

    }
}
