package NivelIntermediario.Enums;

public class Missoes {
    private String nome;
    private RankMissoes rank;

    public Missoes() {
    }

    public Missoes(String nome, RankMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    // Método para mostrar mais informações
    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + " Rank: " + rank + " Descrição (Nivel: " + rank.getDescricao() + ", Dificuldade: " + rank.getDificuldade() + ")");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankMissoes getRank() {
        return rank;
    }

    public void setRank(RankMissoes rank) {
        this.rank = rank;
    }
}
