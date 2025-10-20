package NivelIntermediario.Queues;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Array
        String[] ninjasArray = new String[6];

        // List
        List<String> ninjasList = new ArrayList<>();

        // Stack
        Stack<String> ninjasStack = new Stack<>();

        // QUEUE (FILAS)
        Queue<String> ninjasQueue = new LinkedList<>();

        // Adicionando valores na QUEUE;
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Mostrar a lista
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Tirar um ninja (FIFO) -> O primeiro a entrar é o primeiro a sair
        ninjasQueue.poll(); // <- removeu o HEAD (naruto).
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Vendo o primeiro da lista
        System.out.println("Ninja no HEAD: " + ninjasQueue.peek());

        // Adicionar novos valores na fila
        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Tobirama");
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Não da pra deletar o TAIL (o ultimo da fila)

        // Esvaziar a fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila: " + ninjasQueue);
        if(ninjasQueue.isEmpty()){
            System.out.println("Fila vazia");
        }
    }
}
