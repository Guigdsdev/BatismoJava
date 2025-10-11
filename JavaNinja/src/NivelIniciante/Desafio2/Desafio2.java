package Desafio2;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] opcoes = {"1. Cadastrar Ninja", "2. Listar Ninjas", "3. Sair"};

        System.out.print("Quantos ninjas você quer cadastrar? ");
        int quantidadeDeNinjas = sc.nextInt();
        String[] nomeNinjas = new String[quantidadeDeNinjas];

        int posicao = 0;
        while (true) {

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

                    if(posicao < nomeNinjas.length) {
                        nomeNinjas[posicao] = nomeDoNinja;
                        System.out.println("Ninja adicionado com sucesso!");
                    } else {
                        System.out.println("Não pode mais cadastrar");
                    }
                    posicao+=1;
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("==== Lista de ninjas ====");
                    for (int i = 0; i < nomeNinjas.length; i++) {
                        if(nomeNinjas[i] != null){
                            System.out.println(nomeNinjas[i]);
                        }
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            if (escolha == 3) {
                break;
            }
        }
        sc.close();
    }
}
