package AulasArrays;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];
        
        // Ninjas da folha
        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        // Ninjas da névoa
        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        // Ninjas da areia
        ninjasEAldeias[2][0] = "Areia";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " - Ninja 1: " + ninjasEAldeias[i][1] + " Ninja 2: " + ninjasEAldeias[i][2]);
        }
        
    }
}
