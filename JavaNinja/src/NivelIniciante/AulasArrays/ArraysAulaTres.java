package AulasArrays;

public class ArraysAulaTres {
    public static void main(String[] args) {

        // Arrays são tipo referência!
        // Strings inicializa um valor como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuuga";
        ninja[4] = "Kakashi Hatake";

        // Redeclarando o array
        ninja = new String[4];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikzaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        System.out.println(ninja[7]);


    }
}
