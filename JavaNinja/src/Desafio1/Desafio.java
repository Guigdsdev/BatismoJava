package Desafio1;

public class Desafio {

    public static void main(String[] args) {

        // Ninja 1 -----------
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 12;
        String nomeMissao1 = "Capturar pergaminho";
        char nivelMissao1 = 'C';
        boolean statusMissao1;

        // Ninja 2 -----------

        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 16;
        String nomeMissao2 = "Capturar pergaminho";
        char nivelMissao2 = 'A';
        boolean statusMissao2;

        // Ninja 3 -----------

        String nomeNinja3 = "Shikamaru";
        int idadeNinja3 = 14;
        String nomeMissao3 = "Capturar pergaminho";
        char nivelMissao3 = 'A';
        boolean statusMissao3;

        // Ninja 1 -----------

        if(idadeNinja1 < 15 && nivelMissao1 == 'C' || nivelMissao1 == 'D'){
            statusMissao1 = true;
            System.out.println("Status missão 1: " + statusMissao1);
            System.out.println("O ninja " + nomeNinja1 + " conclui a missão com sucesso!");
        } else if (idadeNinja1 >= 15) {
            statusMissao1 = true;
            System.out.println("Status missão 1: " + statusMissao1);
            System.out.println("O ninja " + nomeNinja1 + " conclui a missão com sucesso!");
        } else {
            statusMissao1 = false;
            System.out.println("Status missão 1: " + statusMissao1);
            System.out.println("O ninja " + nomeNinja1 + " não pode concluir essa missão!");
        }

        // Ninja 2 -----------

        if(idadeNinja2 < 15 && nivelMissao2 == 'C' || nivelMissao2 == 'D'){
            statusMissao2 = true;
            System.out.println("Status missão 2: " + statusMissao2);
            System.out.println("O ninja " + nomeNinja2 + " conclui a missão com sucesso!");
        } else if (idadeNinja2 >= 15) {
            statusMissao2 = true;
            System.out.println("Status missão 2: " + statusMissao2);
            System.out.println("O ninja " + nomeNinja2 + " conclui a missão com sucesso!");
        } else {
            statusMissao2 = false;
            System.out.println("Status missão 2: " + statusMissao2);
            System.out.println("O ninja " + nomeNinja2 + " não pode concluir essa missão!");
        }

        // Ninja 3 -----------

        if(idadeNinja3 < 15 && nivelMissao3 == 'C' || nivelMissao3 == 'D'){
            statusMissao3 = true;
            System.out.println("Status missão 3: " + statusMissao3);
            System.out.println("O ninja " + nomeNinja3 + " não pode concluir essa missão!");
        } else if (idadeNinja3 >= 15) {
            statusMissao3 = true;
            System.out.println("Status missão 2: " + statusMissao3);
            System.out.println("O ninja " + nomeNinja3 + " conclui a missão com sucesso!");
        } else {
            statusMissao3 = false;
            System.out.println("Status missão 3: " + statusMissao3);
            System.out.println("O ninja " + nomeNinja3 + " conclui a missão com sucesso!");
        }

    }
}
