package NivelIntermediario.Desafio6;

import java.util.LinkedList;
import java.util.List;

public class Ninja {
    private String nome;
    private int idade;
    private String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void buscarNinja(String nome, List<Ninja> listaNinja) {
        for (int i = 0; i < listaNinja.size(); i++) {
            if (listaNinja.get(i).getNome().contains(nome)) {
                System.out.println("Nome: " + listaNinja.get(i).nome);
                System.out.println("Idade: " + listaNinja.get(i).idade);
                System.out.println("Aldeia: " + listaNinja.get(i).aldeia);
                System.out.println();
            }
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade + " Aldeia: " + aldeia;
    }
}
