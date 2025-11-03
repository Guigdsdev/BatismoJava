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
    public MissoesDTO adicionarMissao(@RequestBody MissoesDTO missoesModel){
        return missoesService.adicionarMissao(missoesModel);
    }

    @GetMapping("/listar")
    public List<MissoesDTO> mostrarMissoes(){
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesDTO listarMissaoId(@PathVariable Long id){
        return missoesService.listarMissaoId(id);
    }


    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissao(id);
    }
}
