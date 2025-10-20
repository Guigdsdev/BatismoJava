package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto", "naruto@gmail.com", 9999999);
        System.out.println("cadastro = " + naruto);

        CadastroUsandoRecord cadastroUsandoRecord = new CadastroUsandoRecord("Sasuke", 9);
        System.out.println("Nome: " + cadastroUsandoRecord.funcionario());
    }
}
