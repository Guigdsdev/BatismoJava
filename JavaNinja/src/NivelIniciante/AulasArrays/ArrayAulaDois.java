package AulasArrays;

public class ArrayAulaDois {
    public static void main(String[] args) {

        // Arrays são tipo referência!
        // Strings inicializa um valor como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[5]);

        // Array de idade
        // Int inicializa valores como 0
        int[] idade = new int[2];
        System.out.println(idade[0]);

        // Array de dinheiro
        // Double inicia valores como 0.0
        double[] dinheiro = new double[2];
        System.out.println(dinheiro[0]);

        // Array de booelan
        // Boolean iniciam valores como false
        boolean[] vivoOuMorto = new boolean[2];
        System.out.println(vivoOuMorto[0]);

        // Pegando a referência da memoria
        System.out.println(ninja);
        System.out.println(idade);
        System.out.println(dinheiro);
        System.out.println(vivoOuMorto);

    }
}
