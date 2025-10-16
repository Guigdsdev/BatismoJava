package NivelIntermediario.Desafio5;

public class Main {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Naruto", 0, 1001);
        conta1.depositar(100.0);
        conta1.consultarSaldo();

        ContaCorrente conta2 = new ContaCorrente("Sasuke", 0, 1002);
        conta1.depositar(50, conta2);
        conta2.consultarSaldo();
        conta1.consultarSaldo();
        conta2.depositar(1000, conta1);
    }
}
