package dev.java10.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Controller {
    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World!";
    }
}
