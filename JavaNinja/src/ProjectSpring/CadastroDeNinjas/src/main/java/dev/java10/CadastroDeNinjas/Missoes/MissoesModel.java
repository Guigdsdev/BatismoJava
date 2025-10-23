package dev.java10.CadastroDeNinjas.Missoes;

import dev.java10.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldadeMissao;

    // @OneToMany - Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nomeMissao, String dificuldadeMissao) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldadeMissao = dificuldadeMissao;
    }

    public Long getId() {
        return id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldadeMissao() {
        return dificuldadeMissao;
    }

    public void setDificuldadeMissao(String dificuldadeMissao) {
        this.dificuldadeMissao = dificuldadeMissao;
    }
}
