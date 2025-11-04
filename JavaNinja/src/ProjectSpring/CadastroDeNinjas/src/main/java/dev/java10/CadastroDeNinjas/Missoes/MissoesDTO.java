package dev.java10.CadastroDeNinjas.Missoes;


import dev.java10.CadastroDeNinjas.Ninjas.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesDTO {
    private Long id;
    private String nomeMissao;
    private String dificuldadeMissao;
}
