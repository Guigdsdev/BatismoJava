package NivelIntermediario.TreeSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- ARRAY LIST -------------");
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Danzo");
        ninjasList.add("Boruto Uzumaki");
        ninjasList.add("Tsunade Senju");
        ninjasList.add("Naruto Uzumaki");
        System.out.println("Lista: " + ninjasList);

        System.out.println("-------------- TREE SET -------------");
        Set<String> ninjasSet = new TreeSet<>();
        ninjasSet.add("Kakashi Hatake");
        System.out.println("TreeSet: " + ninjasSet);

        System.out.println("-------------- TREE SET (1) -------------");
        ninjasSet.addAll(ninjasList);
        System.out.println("TreeSet: " + ninjasSet);

        System.out.println("-------------- TREE SET (2) -------------");
        ninjasSet.remove("Sakura Haruno");
        System.out.println("TreeSet: " + ninjasSet);
    }
}
