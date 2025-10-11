package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos -> String, Array, Class, Enum.
        * Objetivo da aula -> Criar um ninja e atribuir um nome a ele.
        *
        */

        // Declarando a variável como NARUTO UZUMAKI

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println("Esse texto está em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = nomeEmCaixaAlta.toLowerCase();
        System.out.println(aldeiaEmCaixaBaixa);
    }
}
