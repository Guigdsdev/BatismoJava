package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{
    TipoConta tipoConta = TipoConta.POUPANCA;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nome, double saldo, int numeroConta) {
        super(nome, saldo, numeroConta);
    }

    @Override
    public void consultarSaldo(){
        System.out.println("Seu saldo em conta é: R$" + saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor - (valor * 0.01);
    }
}
