package NivelIntermediario.EstruturaStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        // São estáticos e tem referência de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas
        // São dinamicas e tamanho aumenta ou diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();

        // Stack
        // O ultimo que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Hinata Hyuga");
        ninjasStack.push("Kakashi Hatake");
        System.out.println("Minha Stack atual = " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha Stack atualizada com o pop = " + ninjasStack);
        System.out.println("Minha Stack com o próximo elemento do topo = " + ninjasStack.peek());
        System.out.println("Tamanho da Stack = " + ninjasStack.size());

    }
}