package Condicoes;

public class LacosRepeticoes {

    public static void main(String[] args) {
        /*
        * Laços de repetição -> Vão repetir infinitamente ou até você atingir um parâmetro determinante
        * WHILE -> FOR
        */

        // While
        // while(condicao) {Tudo vai acontecer aqui}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*
        while(numeroDeClones <= numeroMaximoDeClones){
            System.out.println("O naruto fez um total de " + numeroDeClones + " numeros de clones.");
            numeroDeClones+=1;
        }
        */

        for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("O naruto fez um total de " + i + " numeros de clones.");
        }
    }
}
