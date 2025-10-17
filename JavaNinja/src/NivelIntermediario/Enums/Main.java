package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Capturar gato", RankMissoes.D);
        Missoes missao2 = new Missoes("Proteger a ponte", RankMissoes.A);
        missao1.exibirDetalhes();
        missao2.exibirDetalhes();
    }
}
