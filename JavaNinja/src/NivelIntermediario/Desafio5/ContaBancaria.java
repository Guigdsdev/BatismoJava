package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta{

    String nome;
    int saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nome, int saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo(){
        System.out.println("Seu saldo em conta é: R$" + saldo);
    }

}
