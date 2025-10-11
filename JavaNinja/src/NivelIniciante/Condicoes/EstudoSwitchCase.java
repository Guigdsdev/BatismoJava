package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {

    public static void main(String[] args) {
        /*
        * SwitchCases -> Que servem para gerar casos especificos
        * Objetivo da aula -> Pedir para o usuário escolher entre ninjas.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um ninja: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = sc.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuario escolher o Naruto Uzumaki, o próximo hokage");
                break;
            case 2:
                System.out.println("O usuario escolher o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuario escolher a Sakura Haruno, a ninja feminina mais legal");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
