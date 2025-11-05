package dev.java10.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ninjas")
@RestController
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar ninja
    @PostMapping("/criar")
    public ResponseEntity<String> adicionarNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO novoNinja =  ninjaService.adicionarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja " + novoNinja.getNome() + " adicionado com sucesso (ID) " + novoNinja.getId());
    }

    // Mostrar todos os ninjas
    @GetMapping("/listar")
    public List<NinjaDTO> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Procurar Ninja
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjaId(@PathVariable Long id){
        NinjaDTO ninjaEncontrado = ninjaService.listarNinjaId(id);
        if (ninjaEncontrado != null) {
            return ResponseEntity.ok(ninjaEncontrado);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja de (ID) " + id + " não encontrado");
    }

    // Alterar ninjas
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarInfoNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        NinjaDTO ninja = ninjaService.listarNinjaId(id);
        if (ninja != null) {
            ninja = ninjaService.alterarInfoNinja(id, ninjaAtualizado);
            return ResponseEntity.ok(ninja);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja de (ID) " + id + " não foi encontrado");
    }
    // Deletar ninja
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinja(@PathVariable Long id){
        NinjaDTO ninja = ninjaService.listarNinjaId(id);
        if (ninja != null){
            ninjaService.deletarNinja(id);
            return ResponseEntity.ok("Ninja " + ninja.getNome() + " foi removido com sucesso (ID) " + ninja.getId());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja de (ID) " + id + " não ofi encontrado");
    }
}
