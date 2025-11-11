package dev.java10.CadastroDeNinjas.Missoes;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissoesController {
    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/criar")
    @Operation(summary = "Cria uma nova missao", description = "Rota para criar uma nova missão e adicionar no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description ="Missão criada com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro ao criar a missão")
    })
    public ResponseEntity<String> adicionarMissao(@RequestBody MissoesDTO missoesModel){
        MissoesDTO novaMissao = missoesService.adicionarMissao(missoesModel);
        return ResponseEntity.status(HttpStatus.CREATED).body("Missao " + novaMissao.getNomeMissao() + " foi criada com sucesso");
    }

    @GetMapping("/listar")
    @Operation(summary = "Lista todas as missões", description = "Rota para buscar e listar todas as missões contidas no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Informações das missões obtidas com sucesso")
    })
    public ResponseEntity<List<MissoesDTO>> mostrarMissoes(){
        List<MissoesDTO> missoes = missoesService.listarMissoes();
        return ResponseEntity.ok(missoes);
    }

    @GetMapping("/listar/{id}")
    @Operation(summary = "Lista missão por id", description = "Rota para buscar missão no banco de dados por ID informado pelo usuário")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Informação da missão por ID buscada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Erro ao buscar a informação da missão")
    })
    public ResponseEntity<?> listarMissaoId(@PathVariable Long id){
        MissoesDTO missao = missoesService.listarMissaoId(id);
        if (missao != null){
            return ResponseEntity.ok(missao);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("A missão de (ID) " + id + " não foi encontrada.");
    }

    @DeleteMapping("/deletar/{id}")
    @Operation(summary = "Deletar missão por ID", description = "Rota para deletar no banco de dados a missão pelo ID escolhido")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Missão deletada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Erro ao deletar a missão")
    })
    public ResponseEntity<String> deletarMissao(@PathVariable Long id){
        if (missoesService.listarMissaoId(id) != null){
            missoesService.deletarMissao(id);
            return ResponseEntity.ok("Missão de (ID) " + id + " foi deletada com sucesso");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão de (ID) " + id + " não foi encontrada.");
    }
}
