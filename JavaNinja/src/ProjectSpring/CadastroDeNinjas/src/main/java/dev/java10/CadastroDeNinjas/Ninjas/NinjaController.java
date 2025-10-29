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
    public NinjaModel adicionarNinja(@RequestBody NinjaModel ninja){
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
    @PutMapping("/alterarID")
    public String alterarNinja(){
        return "alterar ninja";
    }
    // Deletar ninja
    @DeleteMapping("/deletarID")
    public String deletarNinja(){
        return "Deletar ninja";
    }
}
