package Condicoes;

public class Ternarios {

    public static void main(String[] args) {
        /*
        * Ternarios -> São maneiras de reduzir o código especialmente if-else
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        */

        short numeroDeMissoes = 12;
        String nivelDoNinja = (numeroDeMissoes >=10) ? "Esse ninja está com mais de 10 missões!" : "Esse ninja está com menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
