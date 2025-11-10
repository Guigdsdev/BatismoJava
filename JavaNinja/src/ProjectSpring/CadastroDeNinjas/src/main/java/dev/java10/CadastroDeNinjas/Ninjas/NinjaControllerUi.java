package dev.java10.CadastroDeNinjas.Ninjas;

import dev.java10.CadastroDeNinjas.Missoes.MissoesDTO;
import dev.java10.CadastroDeNinjas.Missoes.MissoesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/ninjas/ui")
public class NinjaControllerUi {

    private final NinjaService ninjaService;
    private final MissoesService missoesService;

    public NinjaControllerUi(NinjaService ninjaService, MissoesService missoesService) {
        this.ninjaService = ninjaService;
        this.missoesService = missoesService;
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
        List<MissoesDTO> missoes = missoesService.listarMissoes();
        model.addAttribute("missoes", missoes);
        return "criarNinja";
    }

    @PostMapping("/salvar")
    public String salvarNinja(@ModelAttribute NinjaDTO ninja, RedirectAttributes redirectAttributes){
        ninjaService.adicionarNinja(ninja);
        redirectAttributes.addFlashAttribute("mensagem", "Ninja adicionado com sucesso");
        return "redirect:/ninjas/ui/listar";
    }

    @GetMapping("/alterar/{id}")
    public String alterarNinjaPagina(@PathVariable Long id, Model model){
        model.addAttribute("ninja", ninjaService.listarNinjaId(id));
        return "alterarNinja";
    }

    @PatchMapping("/alterar/salvar/{id}")
    public String alterarInfoNinja(@PathVariable Long id, NinjaDTO ninjaDTO, RedirectAttributes redirectAttributes){
        ninjaService.alterarInfoNinja(id, ninjaDTO);
        redirectAttributes.addFlashAttribute("mensagem", "Ninja alterado com sucesso");
        return "redirect:/ninjas/ui/listar";
    }
}
