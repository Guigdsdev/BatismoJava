package Desafio2;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] opcoes = {"1. Cadastrar Ninja", "2. Listar Ninjas", "3. Sair"};
        String[] nomeNinjas;
        String[] nomeNinjasAux = new String[nomeNinjas.length];
        int quantidade = 0;

        while (true) {

            nomeNinjas = new String[quantidade];

            quantidade += 1;

            System.out.println("==== Menu Ninja ====");
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println(opcoes[i]);
            }

            System.out.print("Ecolha uma opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Nome do Ninja: ");
                    sc.nextLine();
                    String nomeDoNinja = sc.nextLine();
                    int posicao = quantidade - 1;
                    nomeNinjas[posicao] = nomeDoNinja;
                    nomeNinjasAux = nomeNinjas.clone();
                case 2:
                    System.out.println("==== Lista de ninjas ====");
                    for (int i = 0; i < nomeNinjas.length; i++) {
                        System.out.println(nomeNinjasAux[i]);
                    }
                default:
                    System.out.println("Opção inválida");
            }

            if (escolha == 3) {
                break;
            }

            sc.close();
        }
    }
}
