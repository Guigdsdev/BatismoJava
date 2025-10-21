package NivelIntermediario.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- ARRAY LIST -------------");
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Naruto Uzumaki");
        System.out.println("Lista: " + ninjasList);

        System.out.println("-------------- HASH SET -------------");
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.add("Kakashi Hatake");
        System.out.println("HashSet: " + ninjasSet);

        System.out.println("-------------- HASH SET (1) -------------");
        ninjasSet.addAll(ninjasList);
        System.out.println("HashSet: " + ninjasSet);

        System.out.println("-------------- HASH SET (2) -------------");
        ninjasSet.remove("Sakura Haruno");
        System.out.println("HashSet: " + ninjasSet);
    }
}
