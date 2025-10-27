package dev.java10.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissoesController {

    @PostMapping("/criar")
    public String adicionarMissao(){
        return "missao adicionada";
    }

    @GetMapping("/listar")
    public String mostrarMissoes(){
        return "todas missoes";
    }

    @GetMapping("/listarID")
    public String mostrarMissoesID(){
        return "Mostrar missoes por ID";
    }


    @DeleteMapping("/deletarID")
    public String deletarMissao(){
        return "Deletar missao por ID";
    }
}
