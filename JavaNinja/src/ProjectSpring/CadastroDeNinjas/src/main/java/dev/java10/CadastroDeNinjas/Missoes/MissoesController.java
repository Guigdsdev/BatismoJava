package dev.java10.CadastroDeNinjas.Missoes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> adicionarMissao(@RequestBody MissoesDTO missoesModel){
        MissoesDTO novaMissao = missoesService.adicionarMissao(missoesModel);
        return ResponseEntity.status(HttpStatus.CREATED).body("Missao " + novaMissao.getNomeMissao() + " foi criada com sucesso");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<MissoesDTO>> mostrarMissoes(){
        List<MissoesDTO> missoes = missoesService.listarMissoes();
        return ResponseEntity.ok(missoes);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarMissaoId(@PathVariable Long id){
        MissoesDTO missao = missoesService.listarMissaoId(id);
        if (missao != null){
            return ResponseEntity.ok(missao);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("A missão de (ID) " + id + " não foi encontrada.");
    }


    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarMissao(@PathVariable Long id){
        if (missoesService.listarMissaoId(id) != null){
            missoesService.deletarMissao(id);
            return ResponseEntity.ok("Missão de (ID) " + id + " foi deletada com sucesso");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão de (ID) " + id + " não foi encontrada.");
    }
}
