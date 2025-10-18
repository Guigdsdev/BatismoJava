package NivelIntermediario.GenericsPt1;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> bolsa;

    public BolsaGenerica() {
        this.bolsa = new ArrayList<>();
    }

    public List<T> getBolsa() {
        return bolsa;
    }

    public void setBolsa(List<T> bolsa) {
        this.bolsa = bolsa;
    }

    public void adicionarItemGenerico(T ItemGenerico){
        bolsa.add(ItemGenerico);
    }

    @Override
    public String toString() {
        return "Item: " + bolsa.toString();
    }
}
