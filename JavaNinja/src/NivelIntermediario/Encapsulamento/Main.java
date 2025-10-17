package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto", "KONOHA", 18, 28, 1.70);
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki com nome aletrado");
        System.out.println("Meu nome é: " + naruto.getNome());

        System.out.println("--------------- Sasuke Uchiha ---------------");
    }
}
