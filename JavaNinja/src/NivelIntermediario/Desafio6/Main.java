package NivelIntermediario.Desafio6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        String aldeia;

        LinkedList<Ninja> ninjasList = new LinkedList<>();
        ninjasList.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        ninjasList.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        ninjasList.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        ninjasList.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        ninjasList.add(new Ninja("Gaara", 17, "Areia"));
        ninjasList.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        ninjasList.add(new Ninja("Temari", 18, "Areia"));

        while (true){
            System.out.println("-------------- LISTA DE NINJAS --------------");
            System.out.println("1. Adicionar Ninja (inicio)");
            System.out.println("2. Remover Ninja (inicio)");
            System.out.println("3. Listar todos os Ninjas.");
            System.out.println("4. Procurar por Ninja (indice)");
            System.out.println("5. Buscar por Ninja (nome)");
            System.out.println("6. Sair");
            System.out.println();

            System.out.print("Escolha -> ");
            int escolha = sc.nextInt();

            if(escolha == 6){
                System.out.println("Saindo ...");
                break;
            }

            switch (escolha){
                case 1:
                    System.out.println();
                    System.out.println("-------------- Adicionar Ninja --------------");
                    System.out.print("Nome: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("Aldeia: ");
                    aldeia = sc.nextLine();
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    ninjasList.addFirst(new Ninja(nome, idade, aldeia));
                    System.out.println("Ninja " + nome + " adicionado com sucesso");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("-------------- Remover Ninja --------------");

                    System.out.print("Aperte enter pra remover o primeiro ninja da lista ...");
                    sc.nextLine();
                    sc.nextLine();
                    Ninja removido = ninjasList.removeFirst();
                    System.out.println("Ninja " + removido.getNome() + " removido com sucesso");
                    break;
                case 3:
                    System.out.println("-------------- Listar Ninjas --------------");
                    System.out.println();
                    for(Ninja ninja : ninjasList){
                        System.out.println(ninja);
                    }
                    break;
                case 4:
                    System.out.println("-------------- Buscar Ninja --------------");
                    System.out.print("Escolha o indice do ninja: ");
                    int indice = sc.nextInt();
                    System.out.println();

                    if(indice <= ninjasList.size() -1){
                        Ninja infoNinja = ninjasList.get(indice);
                        System.out.println("Nome: " + infoNinja.getNome());
                        System.out.println("Idade: " + infoNinja.getIdade());
                        System.out.println("Aldeia: " + infoNinja.getAldeia());
                        System.out.println();
                    }else {
                        System.out.println("Indice não encontrado");
                    }
                    break;
                case 5:
                    System.out.println("-------------- Buscagem de Ninja --------------");
                    System.out.print("Digite o nome do Ninja: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    Ninja ninja = new Ninja();
                    ninja.buscarNinja(nome, ninjasList);
                    break;
                default:
                    System.out.println("Escolha inexistente");
            }
        }

        sc.close();
    }
}
