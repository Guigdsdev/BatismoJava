package dev.java10.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class NinjaController {
    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World!";
    }

    // Adicionar ninja
    @PostMapping("/adicionar")
    public String adicionarNinja(){
        return "Ninja adicionado";
    }

    // Mostrar todos os ninjas
    @GetMapping("/todos")
    public String mostrarNinjas(){
        return "Todos os ninjas";
    }

    // Procurar Ninja
    @GetMapping("/todosID")
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
