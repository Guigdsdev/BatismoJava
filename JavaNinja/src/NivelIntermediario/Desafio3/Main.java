package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mostrarOpcoes = new String[]{"1. Exibir informações","2. Criar ninja", "3. Atualizar Habilidaes", "4. Sair"};

        int QUANTIDADE_MAX = 5;
        Uchiha[] listaDeNinjas = new Uchiha[QUANTIDADE_MAX];

        int quantidade = 0;
        Uchiha ninja;

        while(true){


            for (int i = 0; i < mostrarOpcoes.length; i++) {
                System.out.println(mostrarOpcoes[i]);
            }
            System.out.print("Escolha a opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 4){
                System.out.println("Fechando...");
                break;
            }

            switch (opcao){
                case 1:
                    System.out.println();
                    for (int i = 0; i < QUANTIDADE_MAX; i++) {
                        if(listaDeNinjas[i] != null) {
                            listaDeNinjas[i].mostrarInformacoes();
                            System.out.println("=============");
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nome do ninja: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do ninja: ");
                    int idade = sc.nextInt();
                    System.out.println("Missão: ");
                    sc.nextLine();
                    String missao = sc.nextLine();
                    System.out.print("Dificuldade Missão: ");
                    String nivelDificuldade = sc.nextLine();
                    System.out.print("Status Missão: ");
                    String statusMissao = sc.nextLine();
                    System.out.print("Digite sua habilidade especial: ");
                    String habilidadeEspecial = sc.nextLine();

                    ninja = new Uchiha();

                    ninja.nome = nome;
                    ninja.idade = idade;
                    ninja.missao = missao;
                    ninja.nivelDificuldade = nivelDificuldade;
                    ninja.statusMissao = statusMissao;
                    ninja.habilidadeEspecial = habilidadeEspecial;

                    if(quantidade < QUANTIDADE_MAX) {
                        listaDeNinjas[quantidade] = ninja;
                        quantidade+=1;
                    } else {
                        System.out.println("Não pode mais adicionar ninjas.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do ninja: ");
                    String nomeParaMudarHabilidade = sc.nextLine();

                    System.out.print("Digite a nova habilidade do ninja: ");
                    String novaHabilidade = sc.nextLine();

                    for (int i = 0; i < QUANTIDADE_MAX; i++) {
                        if(listaDeNinjas[i] != null){
                            if(listaDeNinjas[i].nome.equals(nomeParaMudarHabilidade)){
                                System.out.println(listaDeNinjas[i].habilidadeEspecial);
                                listaDeNinjas[i].habilidadeEspecial = novaHabilidade;
                            }
                        }

                    }
                    break;
            }
        }

        sc.close();
    }
}
