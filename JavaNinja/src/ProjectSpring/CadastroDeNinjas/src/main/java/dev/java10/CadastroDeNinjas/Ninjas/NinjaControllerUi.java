package dev.java10.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/ninjas/ui")
public class NinjaControllerUi {

    private final NinjaService ninjaService;

    public NinjaControllerUi(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }
    @GetMapping("/listar")
    public String listarNinjas(Model model){
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        model.addAttribute("ninjas", ninjas);
        return "listaNinjas";
    }

    @GetMapping("/deletar/{id}")
    public String deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinja(id);
        return "redirect:/ninjas/ui/listar";
    }

    @GetMapping("/listar/{id}")
    public String listarNinjaId(@PathVariable Long id, Model model){
        NinjaDTO ninja = ninjaService.listarNinjaId(id);
        model.addAttribute("ninja", ninja);
        return "detalhesNinja";
    }

    @GetMapping("/adicionar")
    public String mostrarFormularioAdicionarNinja(Model model){
        model.addAttribute("ninja", new NinjaDTO());
        return "criarNinja";
    }

    @PostMapping("/salvar")
    public String salvarNinja(@ModelAttribute NinjaDTO ninja, RedirectAttributes redirectAttributes){
        ninjaService.adicionarNinja(ninja);
        redirectAttributes.addFlashAttribute("mensagem", "Ninja adicionado com sucesso");
        return "redirect:/ninjas/ui/listar";
    }
}
