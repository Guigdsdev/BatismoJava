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
    public MissoesModel adicionarMissao(@RequestBody MissoesModel missoesModel){
        return missoesService.adicionarMissao(missoesModel);
    }

    @GetMapping("/listar")
    public List<MissoesModel> mostrarMissoes(){
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissaoId(@PathVariable Long id){
        return missoesService.listarMissaoId(id);
    }


    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissao(id);
    }
}
