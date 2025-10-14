package NivelIntermediario.ClassesAbstratas;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuMorto;
    String aldeia;
    double saldoBancario;
    double altura;

    public Hokages(){
    }


    public abstract void sabedoriaHokage();

    public int teste(){
        int valor = 10;
        if (valor >=10){
            return valor;
        }
        return 0;
    }
}
