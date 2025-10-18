package NivelIntermediario.GenericsPt2;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        bolsaNinja.adicionarFerramenta(new Kunai("de fogo"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("INVOCAÇÃO DO SAPO"));
        bolsaNinja.mostrarFerramenta();
    }
}