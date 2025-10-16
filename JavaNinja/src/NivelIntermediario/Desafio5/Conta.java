package NivelIntermediario.Desafio5;

public interface Conta {
    void consultarSaldo();
    void depositar(double valor);
    void depositar(double valor, ContaBancaria conta);
}
