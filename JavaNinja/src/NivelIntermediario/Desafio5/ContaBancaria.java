package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta{

    String nome;
    double saldo;
    int numeroConta;
    public ContaBancaria() {
    }

    public ContaBancaria(String nome, double saldo, int numeroConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    @Override
    public void consultarSaldo(){
        System.out.println("Titular: +" + nome);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("-----------");
    }

    @Override
    public void depositar(double valor, ContaBancaria numeroConta){
        if(saldo >= valor){
            numeroConta.saldo += valor;
            saldo -= valor;
        }else {
            System.out.println("Você não tem saldo suficiente");
        }
    }
}