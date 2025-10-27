package dev.java10.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/ninjas")
@RestController
public class NinjaController {

    // Adicionar ninja
    @PostMapping("/criar")
    public String adicionarNinja(){
        return "Ninja adicionado";
    }

    // Mostrar todos os ninjas
    @GetMapping("/listar")
    public String mostrarNinjas(){
        return "Todos os ninjas";
    }

    // Procurar Ninja
    @GetMapping("/listarID")
    public String procurarNinja(){
        return "Mostrar ninja por ID";
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
