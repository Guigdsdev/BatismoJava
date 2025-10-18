package NivelIntermediario.ArratLists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array
        // Arrays são estáticos, não alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        // Listas
        // Listas não são estaticas elas podem aumentar e diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        // Adicionar na lista
        ninjasList.add("Kakashi Hatake");

        System.out.println("ninjasList = " + ninjasList);

        // Remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjasList = " + ninjasList);

        // Trocar elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("ninjasList = " + ninjasList);

        // Tamanho da lista
        System.out.println("Tamanho  = " + ninjasList.size() + " elementos ");

    }
}
