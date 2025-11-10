package dev.java10.CadastroDeNinjas.Ninjas;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ninjas")
@RestController
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar ninja
    @PostMapping("/criar")
    @Operation(summary = "Cria um novo ninja", description = "Rota cria um novo ninja e insere no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Ninja criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro na criação do ninja")
    })
    public ResponseEntity<String> adicionarNinja(@Parameter(description = "Usuario envia informações no corpo da requisição") @RequestBody NinjaDTO ninja){
        NinjaDTO novoNinja =  ninjaService.adicionarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja " + novoNinja.getNome() + " adicionado com sucesso (ID) " + novoNinja.getId());
    }

    // Mostrar todos os ninjas
    @GetMapping("/listar")
    @Operation(summary = "Lista todos os ninjas", description = "Rota para buscar as informações de todos os ninjas registrados no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listou todos os ninjas com sucesso")
    })
    public List<NinjaDTO> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Procurar Ninja
    @GetMapping("/listar/{id}")
    @Operation(summary = "Lista o ninja por ID", description = "Rota para buscar o ninja pelo ID informado pelo usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ninja encontrado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Ninja não encontrado")
    })
    public ResponseEntity<?> listarNinjaId(@Parameter(description = "Usuario envia o id no caminho da requisição") @PathVariable Long id){
        NinjaDTO ninjaEncontrado = ninjaService.listarNinjaId(id);
        if (ninjaEncontrado != null) {
            return ResponseEntity.ok(ninjaEncontrado);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja de (ID) " + id + " não encontrado");
    }

    // Alterar ninjas
    @PatchMapping("/alterar/{id}")
    @Operation(summary = "Altera informações do ninja", description = "Rota para alterar as informações do ninja e salvar no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Informações alteradas com sucesso"),
            @ApiResponse(responseCode = "404", description = "Ninja não encontrado")
    })
    public ResponseEntity<?> alterarInfoNinja(@Parameter(description = "Usuario envia o id no caminho da requisição") @PathVariable Long id,
                                              @Parameter(description = "Usuario envia informações a ser alteradas no corpo da requisição") @RequestBody NinjaDTO ninjaDTO){
        NinjaDTO ninja = ninjaService.listarNinjaId(id);
        if (ninja != null) {
            ninja = ninjaService.alterarInfoNinja(id, ninjaDTO);
            return ResponseEntity.ok(ninja);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja de (ID) " + id + " não foi encontrado");
    }
    // Deletar ninja
    @DeleteMapping("/deletar/{id}")
    @Operation(summary = "Deletar ninja", description = "Rota para deletar o ninja do banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Ninja deletado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Ninja não encontrado")
    })
    public ResponseEntity<String> deletarNinja(@Parameter(description = "Usuario envia ID na requisição da entidade a ser deletada") @PathVariable Long id){
        NinjaDTO ninja = ninjaService.listarNinjaId(id);
        if (ninja != null){
            ninjaService.deletarNinja(id);
            return ResponseEntity.ok("Ninja " + ninja.getNome() + " foi removido com sucesso (ID) " + ninja.getId());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja de (ID) " + id + " não ofi encontrado");
    }
}
