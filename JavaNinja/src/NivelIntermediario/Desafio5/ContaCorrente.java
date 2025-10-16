package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{
    TipoConta tipoConta = TipoConta.CORRENTE;

    public ContaCorrente() {
    }

    public ContaCorrente(String nome, double saldo, int numeroConta) {
        super(nome, saldo, numeroConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
