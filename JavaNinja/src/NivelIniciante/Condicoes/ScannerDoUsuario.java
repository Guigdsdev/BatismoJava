package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {
        /*
        * Scanner -> é um jeito de trazer o usuário para dentro da aplicação.
        * Objetivo da aula -> O usuario vai criar um ninja, e vamos validar os dados.
        */

        // Abrir o scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do ninja: ");
        String nomeDoNinja = sc.nextLine();
        System.out.println("O nome do ninja é " + nomeDoNinja);

        System.out.print("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = sc.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja);

        if(idadeDoNinja > 18){
            System.out.println("Esse ninja é maior de idade e pode participar de missões fora da aldeia.");
        }else {
            System.out.println("Esse ninja ainda é muito novo para ir para missões fora da aldeia.");
        }


        String test = "teste";

        switch (test){

        }

        // Fechar sempre o Scanner
        sc.close();
    }
}
