package dev.java10.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissoesController {
    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/criar")
    public String adicionarMissao(){
        return "missao adicionada";
    }

    @GetMapping("/listar")
    public List<MissoesModel> mostrarMissoes(){
        return missoesService.listarMissoes();
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
