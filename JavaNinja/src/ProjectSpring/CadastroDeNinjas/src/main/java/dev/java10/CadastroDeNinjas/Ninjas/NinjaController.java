package dev.java10.CadastroDeNinjas.Ninjas;

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
    public NinjaDTO adicionarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.adicionarNinja(ninja);
    }

    // Mostrar todos os ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Procurar Ninja
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaId(@PathVariable Long id){
        return ninjaService.listarNinjaId(id);
    }

    // Alterar ninjas
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarInfoNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.alterarInfoNinja(id, ninjaAtualizado);
    }
    // Deletar ninja
    @DeleteMapping("/deletar/{id}")
    public void deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }
}
