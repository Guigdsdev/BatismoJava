package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente() {
    }

    public ContaCorrente(String nome, int saldo) {
        super(nome, saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
